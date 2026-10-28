#!/usr/bin/env python3
"""Lightweight HTTP sidecar serving live Mappls traffic signal countdowns.

Polls Mappls only when junctions are requested, caches the phase,
and schedules the next poll ~2s before the current phase ends.
"""
import base64, hashlib, json, os, struct, sys, threading, time, uuid
from http.server import HTTPServer, BaseHTTPRequestHandler
from urllib.parse import urlparse, parse_qs
from urllib.request import Request, urlopen
from urllib.error import HTTPError, URLError

# ── load .env if present (for local dev) ─────────────────────────────
_env_path = os.path.join(os.path.dirname(os.path.abspath(__file__)), "..", ".env")
if os.path.isfile(_env_path):
    with open(_env_path) as _f:
        for _line in _f:
            _line = _line.strip()
            if _line and not _line.startswith("#") and "=" in _line:
                _k, _, _v = _line.partition("=")
                os.environ.setdefault(_k.strip(), _v.strip())

# ── Mappls auth constants ─────────────────────────────────────────────
ACCESS_TOKEN  = os.environ.get("MAPPLS_ACCESS_TOKEN",  "")
REFRESH_TOKEN = os.environ.get("MAPPLS_REFRESH_TOKEN", "")
UUID_VAL      = os.environ.get("MAPPLS_UUID",          "")
STATIC_KEY    = os.environ.get("MAPPLS_STATIC_KEY",    "")
APP_FINGERPRINT = os.environ.get("MAPPLS_APP_FINGERPRINT", "")
APP_ID          = os.environ.get("MAPPLS_APP_ID", "")
PAYLOAD_PUB_KEY = os.environ.get("MAPPLS_PAYLOAD_PUB_KEY", "")
UA = "MapplsApp - 10.5.13 (672) [Android Version : 13 | API : 33] [Device Brand : Xiaomi | Model : sunny]"

# ── AES helpers (from the decompiled Mappls SDK) ──────────────────────
# These need the `cryptography` library — the only non-stdlib dep.
try:
    from cryptography.hazmat.primitives.ciphers import Cipher, algorithms, modes
    from cryptography.hazmat.primitives import padding as sym_padding
    HAS_CRYPTO = True
except ImportError:
    HAS_CRYPTO = False

def _l_d(s):
    return s.encode("utf-8")[:16]

def _l_f(s):
    buf = ""
    for c in s:
        buf += format(ord(c), "x")
    return base64.b64decode(buf[:32])

def _l_a(wb, kb):
    d = Cipher(algorithms.AES(kb), modes.CBC(wb[:16])).decryptor()
    padded = d.update(wb[16:]) + d.finalize()
    u = sym_padding.PKCS7(128).unpadder()
    return u.update(padded) + u.finalize()

def _l_g(w64, ak):
    raw = _l_a(base64.b64decode(w64), ak)
    b = base64.b64encode(raw).decode().strip()
    return "".join(chr(int(b[i:i+2], 16)) for i in range(0, len(b), 2))

def _l_c(db, k64, aid):
    key, iv = base64.b64decode(k64), _l_d(aid)
    p = sym_padding.PKCS7(128).padder()
    padded = p.update(db) + p.finalize()
    e = Cipher(algorithms.AES(key), modes.CBC(iv)).encryptor()
    ct = e.update(padded) + e.finalize()
    r = base64.b64encode(ct).decode()
    return "\n".join(r[i:i+76] for i in range(0, len(r), 76)) + "\n"

_key_b64 = None

def payload_hdr():
    global _key_b64
    if _key_b64 is None:
        _key_b64 = _l_g(PAYLOAD_PUB_KEY, _l_f(APP_ID)).strip()
    env = json.dumps({
        "timestamp": int(time.time()),
        "packageName": "com.mmi.maps",
        "appFingerPrint": APP_FINGERPRINT,
        "deviceId": "sunny",
        "refreshToken": REFRESH_TOKEN,
    })
    return _l_c(env.encode(), _key_b64, APP_ID).replace(" ", "").replace("\n", "")

def xsa(lat, lon):
    return base64.b64encode(
        f"{uuid.uuid4()}|{lat}|{lon}|0.0|0.0|{int(time.time())}|false".encode()
    ).decode()

# ── Junction database ─────────────────────────────────────────────────
DB_PATH = os.path.join(os.path.dirname(os.path.abspath(__file__)), "..", "public", "signals.json")
junctions = {}  # id -> {id, lat, lon, stages, name}
junc_idx = []   # [(lat, lon, id), ...] for spatial lookup

def load_junctions():
    global junc_idx
    with open(DB_PATH) as f:
        data = json.load(f)
    for j in data["junctions"]:
        junctions[j["id"]] = j
    junc_idx = [(j["lat"], j["lon"], j["id"]) for j in data["junctions"]]
    print(f"  loaded {len(junctions)} junctions from {DB_PATH}")

def junctions_near(lat, lon, radius_m):
    out = []
    for jlat, jlon, jid in junc_idx:
        d = _haversine(lat, lon, jlat, jlon)
        if d <= radius_m:
            out.append(jid)
    return out

def _haversine(lat1, lon1, lat2, lon2):
    from math import radians, sin, cos, sqrt, atan2
    R = 6371000
    la1, la2, lo1, lo2 = radians(lat1), radians(lat2), radians(lon1), radians(lon2)
    dlat, dlon = la2 - la1, lo2 - lo1
    a = sin(dlat/2)**2 + cos(la1)*cos(la2)*sin(dlon/2)**2
    return R * 2 * atan2(sqrt(a), sqrt(1 - a))

# ── Live signal cache ─────────────────────────────────────────────────
# Each entry: {phase, mode, startTime, greenTime, amberTime, redTime,
#              endTime, stages, fetchedAt, lastRequested}
# poll_timers: id -> threading.Timer
cache = {}
poll_timers = {}
lock = threading.Lock()
EVICT_IDLE = 60     # stop polling if not requested for 60s
VAC_INTERVAL = 10   # re-poll VAC junctions every 10s
FIXED_LEAD = 2      # poll FIXED junctions 2s before phase ends

def fetch_signal(jid):
    j = junctions.get(jid)
    if not j:
        return None
    lat, lon = j["lat"], j["lon"]
    stages = ",".join(str(s) for s in j["stages"])
    url = (
        f"https://routem.mappls.com/nav/plan/signal"
        f"?latitude={lat}&longitude={lon}&name={jid}&stage={stages}"
        f"&access_token={STATIC_KEY}&region=ind"
    )
    headers = {
        "Authorization": f"bearer {ACCESS_TOKEN}",
        "Accept": "application/json",
        "User-Agent": UA,
        "payload": payload_hdr(),
        "uuId": UUID_VAL,
        "x-sa": xsa(lat, lon),
    }
    req = Request(url, method="GET")
    for k, v in headers.items():
        req.add_header(k, v)
    try:
        with urlopen(req, timeout=10) as resp:
            body = json.loads(resp.read().decode())
        data = body.get("data")
        if not data:
            return None
        return {
            "phase": (data.get("type") or "none").lower(),
            "mode": data.get("mode", ""),
            "startTime": data.get("startTime"),
            "endTime": data.get("endTime"),
            "greenTime": data.get("greenTime", 0),
            "amberTime": data.get("amberTime", 0),
            "redTime": data.get("redTime", 0),
            "stages": data.get("stage", []),
        }
    except (HTTPError, URLError, json.JSONDecodeError, OSError) as e:
        print(f"  signal fetch error for {jid}: {e}", file=sys.stderr)
        return None

def poll_junction(jid):
    with lock:
        entry = cache.get(jid)
        if entry and time.time() - entry["lastRequested"] > EVICT_IDLE:
            cache.pop(jid, None)
            poll_timers.pop(jid, None)
            return

    result = fetch_signal(jid)
    now = time.time()

    with lock:
        if result:
            result["fetchedAt"] = now
            result["lastRequested"] = cache[jid]["lastRequested"] if jid in cache else now
            cache[jid] = result
        elif jid in cache:
            cache[jid]["fetchedAt"] = now

        entry = cache.get(jid)
        if not entry:
            poll_timers.pop(jid, None)
            return

        delay = _next_poll_delay(entry)
        t = threading.Timer(delay, poll_junction, args=[jid])
        t.daemon = True
        poll_timers[jid] = t
        t.start()

def _next_poll_delay(entry):
    if entry["mode"] == "VAC" or not entry["startTime"]:
        return VAC_INTERVAL
    phase = entry["phase"]
    durations = {"green": entry["greenTime"], "red": entry["redTime"], "yellow": entry["amberTime"]}
    dur = durations.get(phase, 0)
    if dur <= 0:
        return VAC_INTERVAL
    elapsed = time.time() - entry["startTime"]
    remaining = dur - elapsed
    if remaining <= FIXED_LEAD:
        return max(1, remaining)
    return remaining - FIXED_LEAD

def ensure_polling(jid):
    with lock:
        if jid in cache:
            cache[jid]["lastRequested"] = time.time()
        if jid in poll_timers:
            return
    t = threading.Timer(0, poll_junction, args=[jid])
    t.daemon = True
    poll_timers[jid] = t
    t.start()

def get_signal(jid):
    j = junctions.get(jid)
    if not j:
        return None
    ensure_polling(jid)
    with lock:
        entry = cache.get(jid)
    if not entry:
        return {"id": jid, "name": j["name"], "lat": j["lat"], "lon": j["lon"], "phase": "unknown", "mode": ""}
    now = time.time()
    countdown = None
    if entry["startTime"]:
        phase = entry["phase"]
        durations = {"green": entry["greenTime"], "red": entry["redTime"], "yellow": entry["amberTime"]}
        dur = durations.get(phase, 0)
        if dur > 0:
            elapsed = now - entry["startTime"]
            remaining = max(0, round(dur - elapsed))
            if remaining > 0:
                countdown = remaining
    return {
        "id": jid,
        "name": j["name"],
        "lat": j["lat"],
        "lon": j["lon"],
        "phase": entry["phase"],
        "mode": entry["mode"],
        "countdown": countdown,
        "greenTime": entry["greenTime"],
        "amberTime": entry["amberTime"],
        "redTime": entry["redTime"],
        "startTime": entry["startTime"],
        "fetchedAt": entry["fetchedAt"],
    }

# ── HTTP server ───────────────────────────────────────────────────────
class Handler(BaseHTTPRequestHandler):
    def do_GET(self):
        parsed = urlparse(self.path)
        if parsed.path != "/api/signals":
            self.send_error(404)
            return
        params = parse_qs(parsed.query)
        results = []
        if "ids" in params:
            ids = [i.strip() for i in params["ids"][0].split(",") if i.strip()]
            results = [s for jid in ids if (s := get_signal(jid))]
        elif "lat" in params and "lon" in params:
            lat = float(params["lat"][0])
            lon = float(params["lon"][0])
            radius = float(params.get("radius", ["2000"])[0])
            nearby_ids = junctions_near(lat, lon, radius)
            results = [s for jid in nearby_ids if (s := get_signal(jid))]
        self.send_response(200)
        self.send_header("Content-Type", "application/json")
        self.send_header("Cache-Control", "no-store")
        self.send_header("Access-Control-Allow-Origin", "*")
        self.end_headers()
        self.wfile.write(json.dumps({"signals": results}).encode())

    def log_message(self, fmt, *args):
        pass

def main():
    if not HAS_CRYPTO:
        print("ERROR: `cryptography` package required. Install: pip install cryptography", file=sys.stderr)
        sys.exit(1)
    missing = [k for k in ("MAPPLS_ACCESS_TOKEN", "MAPPLS_STATIC_KEY", "MAPPLS_APP_ID", "MAPPLS_PAYLOAD_PUB_KEY") if not os.environ.get(k)]
    if missing:
        print(f"ERROR: missing env vars: {', '.join(missing)}. Set them in .env or pass via Docker.", file=sys.stderr)
        sys.exit(1)
    load_junctions()
    port = int(os.environ.get("SIGNAL_PORT", "3001"))
    server = HTTPServer(("127.0.0.1", port), Handler)
    print(f"  signal sidecar → http://127.0.0.1:{port}/api/signals")
    try:
        server.serve_forever()
    except KeyboardInterrupt:
        pass
    finally:
        with lock:
            for t in poll_timers.values():
                t.cancel()
        server.server_close()

if __name__ == "__main__":
    main()
