#!/usr/bin/env python3
"""Rapido fare estimator + accuracy checker. Standard library only. Run from the repo root.

Estimates come from a formula, never from Rapido:  fare = max(minimum, base + per_km * km + per_min * minutes)
km and minutes are the road distance and driving time from the public OSRM router; places are looked up with
Photon (OpenStreetMap), biased to Bengaluru. You record what the Rapido app actually quoted, and `fit` tunes the
formula to those quotes.

  python3 scripts/fare_check.py estimate "Koramangala" "MG Road"
  python3 scripts/fare_check.py add "Koramangala" "MG Road" --bike 62 --auto 140 --cab 260 [--when "2026-10-26 18:30"] [--note surge]
  python3 scripts/fare_check.py report          # estimate vs actual for every saved quote
  python3 scripts/fare_check.py fit             # tune the formula to your quotes (saves scripts/fare_params.json)

Places can be names or "lat,lon". Quotes go to scripts/fare_samples.csv (you can edit it by hand).
"""
import argparse, csv, datetime, json, math, os, sys, urllib.parse, urllib.request

HERE = os.path.dirname(os.path.abspath(__file__))
SAMPLES = os.path.join(HERE, 'fare_samples.csv')
PARAMS = os.path.join(HERE, 'fare_params.json')
VEHICLES = ('bike', 'auto', 'cab')
UA = {'user-agent': 'bmtc-live-fare-check/1.0'}
# Starting guesses only, until `fit` has your real quotes. Rupees; per_min is per minute of driving time.
DEFAULT = {
    'bike': {'minimum': 25, 'base': 15, 'per_km': 7.5, 'per_min': 0.5},
    'auto': {'minimum': 40, 'base': 25, 'per_km': 15, 'per_min': 1.0},
    'cab':  {'minimum': 80, 'base': 50, 'per_km': 15, 'per_min': 1.5},
}
FIELDS = ['when', 'from', 'to', 'from_lat', 'from_lon', 'to_lat', 'to_lon', 'km', 'minutes', 'bike', 'auto', 'cab', 'note']


def get_json(url):
    return json.load(urllib.request.urlopen(urllib.request.Request(url, headers=UA), timeout=20))


def place(q):
    """'lat,lon' or a place name -> (lat, lon, label)."""
    parts = q.split(',')
    if len(parts) == 2:
        try:
            return float(parts[0]), float(parts[1]), q
        except ValueError:
            pass
    j = get_json('https://photon.komoot.io/api/?' + urllib.parse.urlencode(
        {'q': q, 'lat': 12.9716, 'lon': 77.5946, 'bbox': '77.3,12.7,77.95,13.25', 'limit': 1}))
    if not j.get('features'):
        sys.exit(f'Could not find "{q}". Try a fuller name or "lat,lon".')
    f = j['features'][0]
    p = f['properties']
    label = ', '.join(x for x in [p.get('name'), p.get('district') or p.get('locality')] if x)
    lon, lat = f['geometry']['coordinates']
    return lat, lon, label or q


def road(a, b):
    """Road distance (km) and driving time (min) from the public OSRM demo router."""
    j = get_json(f'https://router.project-osrm.org/route/v1/driving/{a[1]},{a[0]};{b[1]},{b[0]}?overview=false')
    if j.get('code') != 'Ok':
        sys.exit(f'Routing failed: {j.get("message", j.get("code"))}')
    r = j['routes'][0]
    return r['distance'] / 1000, r['duration'] / 60


def params():
    p = json.loads(json.dumps(DEFAULT))
    if os.path.exists(PARAMS):
        for v, vals in json.load(open(PARAMS)).items():
            p.setdefault(v, {}).update(vals)
    return p


def estimate(p, v, km, minutes):
    c = p[v]
    return max(c['minimum'], c['base'] + c['per_km'] * km + c['per_min'] * minutes)


def load():
    if not os.path.exists(SAMPLES):
        return []
    with open(SAMPLES, newline='') as f:
        return list(csv.DictReader(f))


def cmd_estimate(a):
    f, t = place(a.origin), place(a.dest)
    km, mins = road(f, t)
    p = params()
    print(f'{f[2]} -> {t[2]}')
    print(f'road: {km:.1f} km, about {mins:.0f} min driving (no traffic; real time is often longer)')
    for v in VEHICLES:
        e = estimate(p, v, km, mins)
        print(f'  {v:5} ≈ ₹{e:.0f}   (range ₹{e * 0.9:.0f}–{e * 1.15:.0f}, before surge)')
    print('source:', 'fitted to your quotes' if os.path.exists(PARAMS) else 'starting guesses: add real quotes, then run `fit`')


def cmd_add(a):
    if not any(getattr(a, v) is not None for v in VEHICLES):
        sys.exit('Give at least one actual price: --bike, --auto or --cab')
    f, t = place(a.origin), place(a.dest)
    km, mins = road(f, t)
    when = a.when or datetime.datetime.now().strftime('%Y-%m-%d %H:%M')
    row = {'when': when, 'from': f[2], 'to': t[2], 'from_lat': f'{f[0]:.5f}', 'from_lon': f'{f[1]:.5f}', 'to_lat': f'{t[0]:.5f}',
           'to_lon': f'{t[1]:.5f}', 'km': f'{km:.2f}', 'minutes': f'{mins:.1f}', 'note': a.note or ''}
    for v in VEHICLES:
        row[v] = '' if getattr(a, v) is None else str(getattr(a, v))
    new = not os.path.exists(SAMPLES)
    with open(SAMPLES, 'a', newline='') as fh:
        w = csv.DictWriter(fh, fieldnames=FIELDS)
        if new:
            w.writeheader()
        w.writerow(row)
    p = params()
    print(f'saved: {f[2]} -> {t[2]}, {km:.1f} km, {mins:.0f} min')
    for v in VEHICLES:
        if row[v]:
            e = estimate(p, v, km, mins)
            actual = float(row[v])
            print(f'  {v:5} actual ₹{actual:.0f}   estimate ₹{e:.0f}   ({(e - actual) / actual * 100:+.0f}%)')


def cmd_report(a):
    rows, p = load(), params()
    if not rows:
        sys.exit('No quotes yet. Add some with: fare_check.py add "<from>" "<to>" --bike 62 --auto 140')
    print('source:', 'fitted' if os.path.exists(PARAMS) else 'starting guesses', '\n')
    for v in VEHICLES:
        errs = []
        lines = []
        for r in rows:
            if not r.get(v):
                continue
            km, mins, actual = float(r['km']), float(r['minutes']), float(r[v])
            e = estimate(p, v, km, mins)
            errs.append((e - actual) / actual)
            lines.append(f'   {r["when"][:16]:16} {r["from"][:22]:22} -> {r["to"][:22]:22} {km:5.1f} km  actual ₹{actual:5.0f}  est ₹{e:5.0f}  {errs[-1] * 100:+5.0f}%{"  (" + r["note"] + ")" if r.get("note") else ""}')
        if not errs:
            continue
        mape = sum(abs(x) for x in errs) / len(errs) * 100
        within = sum(abs(x) <= 0.10 for x in errs)
        print(f'{v.upper()}: {len(errs)} quotes · average error {mape:.0f}% · {within}/{len(errs)} within ±10%')
        print('\n'.join(lines), '\n')


def solve(A, y):
    """Least squares for small systems via the normal equations (Gaussian elimination)."""
    n = len(A[0])
    M = [[sum(A[k][i] * A[k][j] for k in range(len(A))) for j in range(n)] + [sum(A[k][i] * y[k] for k in range(len(A)))] for i in range(n)]
    for c in range(n):
        piv = max(range(c, n), key=lambda r: abs(M[r][c]))
        if abs(M[piv][c]) < 1e-9:
            return None
        M[c], M[piv] = M[piv], M[c]
        for r in range(n):
            if r != c:
                f = M[r][c] / M[c][c]
                M[r] = [M[r][k] - f * M[c][k] for k in range(n + 1)]
    return [M[i][n] / M[i][i] for i in range(n)]


def cmd_fit(a):
    rows, p, out = load(), params(), {}
    for v in VEHICLES:
        data = [(float(r['km']), float(r['minutes']), float(r[v])) for r in rows if r.get(v) and 'surge' not in r.get('note', '').lower()]
        if len(data) < 3:
            print(f'{v}: {len(data)} quotes, need at least 3 (surge quotes are skipped)')
            continue
        minimum = min(min(x[2] for x in data), p[v]['minimum'])
        fit = solve([[1, km, m] for km, m, _ in data], [y for *_, y in data]) if len(data) >= 4 else None
        if not fit or min(fit) < 0:  # too few points or a negative term: fit base + per-km only
            b = solve([[1, km] for km, _, _ in data], [y for *_, y in data])
            fit = [b[0], b[1], 0.0] if b else None
        if not fit:
            print(f'{v}: could not fit (quotes too similar); try trips of different lengths')
            continue
        out[v] = {'minimum': round(minimum), 'base': round(fit[0], 2), 'per_km': round(fit[1], 2), 'per_min': round(fit[2], 2)}
        print(f'{v}: base ₹{fit[0]:.1f} + ₹{fit[1]:.2f}/km + ₹{fit[2]:.2f}/min, minimum ₹{minimum:.0f}  ({len(data)} quotes)')
    if out:
        merged = json.load(open(PARAMS)) if os.path.exists(PARAMS) else {}
        merged.update(out)
        json.dump(merged, open(PARAMS, 'w'), indent=2)
        print(f'\nsaved {PARAMS}. Run `report` to see the new accuracy.')


def main():
    ap = argparse.ArgumentParser(description=__doc__, formatter_class=argparse.RawDescriptionHelpFormatter)
    sub = ap.add_subparsers(dest='cmd', required=True)
    e = sub.add_parser('estimate', help='estimate bike/auto/cab fares for a trip')
    e.add_argument('origin'); e.add_argument('dest')
    d = sub.add_parser('add', help='save what the Rapido app actually quoted')
    d.add_argument('origin'); d.add_argument('dest')
    for v in VEHICLES:
        d.add_argument('--' + v, type=float)
    d.add_argument('--when', help='"YYYY-MM-DD HH:MM" (default: now)')
    d.add_argument('--note', help='e.g. "surge" or "rain" (surge quotes are left out of fit)')
    sub.add_parser('report', help='estimate vs actual for every saved quote')
    sub.add_parser('fit', help='tune the formula to your quotes')
    a = ap.parse_args()
    {'estimate': cmd_estimate, 'add': cmd_add, 'report': cmd_report, 'fit': cmd_fit}[a.cmd](a)


if __name__ == '__main__':
    main()
