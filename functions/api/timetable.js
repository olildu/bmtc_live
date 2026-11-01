// API handler (served by server.js): BMTC's published bus timetable (scheduled, not live), from data/timetable.json.gz
// (built by scripts/bmtc_timetable.py from the unofficial Vonter/bmtc-gtfs feed, ODbL). Minutes are since midnight IST
// and can pass 1440 for trips after midnight.
//   GET /api/timetable?q=500-D               every service (variant × direction) of that route number
//   GET /api/timetable?key=500-D|0           one service: its stops and every trip's time at each stop
//   GET /api/timetable?flat&flon&tlat&tlon   every direct bus between two places all day, and one-change journeys
//   GET /api/timetable?night=1               trips starting between 23:00 and 04:00
import { readFileSync } from 'node:fs';
import { gunzipSync } from 'node:zlib';
import { dist } from './plan.js';

const FILE = new URL('../../data/timetable.json.gz', import.meta.url);
const BOARD_M = 800, ALIGHT_M = 1200, CHANGE_MIN = 3, MAX_KMH = 60, MAX_CHANGES = 120;
const routeNo = n => (n || '').split(' ')[0].toUpperCase().replace(/-/g, '');
const walkMin = m => Math.max(1, Math.round(m * 1.3 / 80));

let db = null;
function load() {
  if (db) return db;
  const j = JSON.parse(gunzipSync(readFileSync(FILE)).toString());
  const stops = j.stops.map(([name, lat, lon]) => ({ name, lat, lon }));
  const byKey = new Map(), byNo = new Map(), atStop = new Map();
  j.services.forEach((s, i) => {
    const key = `${s.n}|${s.d}`;
    if (!byKey.has(key)) byKey.set(key, []);
    byKey.get(key).push(s);
    const no = routeNo(s.n);
    if (!byNo.has(no)) byNo.set(no, new Set());
    byNo.get(no).add(key);
    s.s.forEach((st, k) => { if (!atStop.has(st)) atStop.set(st, []); atStop.get(st).push([i, k]); });
  });
  return db = { version: j.version, stops, services: j.services, byKey, byNo, atStop, abCache: new Map() };
}

// one route direction (all its stop patterns): the busiest pattern's stops, and each trip's time at each of them
function service(key) {
  const { stops, byKey } = load(), pats = byKey.get(key);
  if (!pats) return null;
  const main = pats[0], idx = new Map(main.s.map((st, k) => [st, k]));
  const trips = [];
  for (const p of pats) for (const [start, prof] of p.t) {
    const row = main.s.map(() => null);
    p.s.forEach((st, k) => { const at = idx.get(st); if (at != null && row[at] == null) row[at] = start + p.o[prof][k]; });
    if (row.some(x => x != null)) trips.push(row);
  }
  const first = r => r.find(x => x != null);
  trips.sort((a, b) => first(a) - first(b));
  const st = main.s.map(i => stops[i]);
  return { key, name: main.n, dir: main.d, headsign: main.h, from: st[0].name, to: st.at(-1).name, stops: st.map(s => [s.name, s.lat, s.lon]), trips };
}

function family(q) {
  const { byNo, byKey, stops } = load(), keys = byNo.get(routeNo(q));
  if (!keys) return [];
  return [...keys].map(key => {
    const pats = byKey.get(key), main = pats[0], starts = pats.flatMap(p => p.t.map(t => t[0])).sort((a, b) => a - b);
    const a = stops[main.s[0]], b = stops[main.s.at(-1)];
    return { key, name: main.n, dir: main.d, from: a.name, to: b.name, fromLL: [a.lat, a.lon], toLL: [b.lat, b.lon], trips: starts.length, first: starts[0], last: starts.at(-1) };
  }).sort((x, y) => (x.name !== y.name ? (routeNo(x.name) === x.name.toUpperCase().replace(/-/g, '') ? -1 : 0) || x.name.localeCompare(y.name) : 0) || y.trips - x.trips);
}

// a ride leg is a timing error if it beats MAX_KMH in a straight line
const plausible = (a, b, ta, tb) => tb > ta && dist(a, b) / ((tb - ta) * 60) * 3.6 <= MAX_KMH;

function fromTo(A, B) {
  const { stops, services, atStop, abCache } = load();
  const ck = [A.lat, A.lon, B.lat, B.lon].map(x => x.toFixed(3)).join(',');
  if (abCache.has(ck)) return abCache.get(ck);
  const near = (p, r) => { const m = new Map(); stops.forEach((s, i) => { const d = dist(p, s); if (d <= r) m.set(i, d); }); return m; };
  const nA = near(A, BOARD_M), nB = near(B, ALIGHT_M);
  const direct = new Map(), legA = new Map(), legB = new Map();
  const seen = new Set();
  for (const st of nA.keys()) for (const [si] of atStop.get(st) || []) {
    if (seen.has(si)) continue;
    seen.add(si);
    const s = services[si];
    // board at the pattern's stop nearest A; get off at its stop nearest B after that
    let ia = -1, ib = -1;
    s.s.forEach((x, k) => { if (nA.has(x) && (ia < 0 || nA.get(x) < nA.get(s.s[ia]))) ia = k; });
    s.s.forEach((x, k) => { if (k > ia && nB.has(x) && (ib < 0 || nB.get(x) < nB.get(s.s[ib]))) ib = k; });
    for (const [start, prof] of s.t) {
      const o = s.o[prof], dep = start + o[ia];
      if (ib > ia && plausible(stops[s.s[ia]], stops[s.s[ib]], dep, start + o[ib])) {
        const k = `${s.n}|${s.s[ia]}|${s.s[ib]}`;
        if (!direct.has(k)) direct.set(k, { route: s.n, b: s.s[ia], a: s.s[ib], times: [] });
        direct.get(k).times.push([dep, start + o[ib] - dep]);
      }
      for (let k = ia + 1; k < s.s.length; k++) {
        const x = s.s[k];
        if (nB.has(x) || !plausible(stops[s.s[ia]], stops[x], dep, start + o[k])) continue;
        if (!legA.has(x)) legA.set(x, []);
        legA.get(x).push([dep, start + o[k], s.n, s.s[ia]]);
      }
    }
  }
  const seenB = new Set();
  for (const st of nB.keys()) for (const [si] of atStop.get(st) || []) {
    if (seenB.has(si)) continue;
    seenB.add(si);
    const s = services[si];
    let ib = -1;
    s.s.forEach((x, k) => { if (nB.has(x) && (ib < 0 || nB.get(x) < nB.get(s.s[ib]))) ib = k; });
    for (const [start, prof] of s.t) {
      const o = s.o[prof], arr = start + o[ib];
      for (let k = 0; k < ib; k++) {
        const x = s.s[k];
        if (nA.has(x) || !legA.has(x) || !plausible(stops[x], stops[s.s[ib]], start + o[k], arr)) continue;
        if (!legB.has(x)) legB.set(x, []);
        legB.get(x).push([start + o[k], arr, s.n, s.s[ib]]);
      }
    }
  }
  // one change: every bus into X, then the first bus out of X at least CHANGE_MIN later; best arrival per leaving time
  const best = new Map();
  for (const [x, outs] of legB) {
    outs.sort((a, b) => a[0] - b[0]);
    for (const [dep, atX, r1, b] of legA.get(x)) {
      let lo = 0, hi = outs.length;
      while (lo < hi) { const m = (lo + hi) >> 1; if (outs[m][0] < atX + CHANGE_MIN) lo = m + 1; else hi = m; }
      const o = outs[lo];
      if (!o || o[2] === r1) continue;
      const c = { leave: dep, r1, b, x, atX, r2: o[2], depX: o[0], arrive: o[1], a: o[3] };
      if (!best.has(dep) || c.arrive < best.get(dep).arrive) best.set(dep, c);
    }
  }
  // drop journeys beaten by one leaving later and arriving no later
  const change = [];
  let soonest = Infinity;
  for (const c of [...best.values()].sort((a, b) => b.leave - a.leave)) if (c.arrive < soonest) { change.push(c); soonest = c.arrive; }
  change.reverse();
  const stopOut = i => ({ name: stops[i].name, lat: stops[i].lat, lon: stops[i].lon });
  const out = {
    direct: [...direct.values()].sort((a, b) => b.times.length - a.times.length).map(d => ({
      route: d.route, board: stopOut(d.b), walkTo: walkMin(nA.get(d.b)), alight: stopOut(d.a), walkFrom: walkMin(nB.get(d.a)), times: d.times.sort((a, b) => a[0] - b[0]),
    })),
    change: change.slice(0, MAX_CHANGES * 3).map(c => ({
      leave: c.leave, r1: c.r1, board: stopOut(c.b), walkTo: walkMin(nA.get(c.b)), change: stops[c.x].name, atX: c.atX,
      r2: c.r2, depX: c.depX, arrive: c.arrive, alight: stopOut(c.a), walkFrom: walkMin(nB.get(c.a)),
    })),
  };
  if (abCache.size > 200) abCache.delete(abCache.keys().next().value);
  abCache.set(ck, out);
  return out;
}

function night() {
  const { stops, services } = load(), out = new Map();
  for (const s of services) for (const [start] of s.t) {
    const m = start % 1440;
    if (m < 23 * 60 && m >= 4 * 60) continue;
    const k = `${s.n}|${s.s[0]}|${s.s.at(-1)}`;
    if (!out.has(k)) out.set(k, { route: s.n, from: stops[s.s[0]].name, to: stops[s.s.at(-1)].name, times: [] });
    out.get(k).times.push(m);
  }
  const order = m => (m - 23 * 60 + 1440) % 1440;
  return [...out.values()].map(r => ({ ...r, times: r.times.sort((a, b) => order(a) - order(b)),
    kind: /^KIA/i.test(r.route) ? 'airport' : /^D\d+/.test(r.route) ? 'depot' : 'city' }))
    .sort((a, b) => b.times.length - a.times.length);
}

export async function onRequestGet({ request }) {
  const q = new URL(request.url).searchParams, num = k => parseFloat(q.get(k));
  try {
    const { version } = load(), headers = { 'cache-control': 'public, max-age=3600' };
    if (q.get('key')) { const s = service(q.get('key')); return s ? Response.json({ version, ...s }, { headers }) : Response.json({ error: 'no such service' }, { status: 404 }); }
    if (q.get('q')) return Response.json({ version, services: family(q.get('q')) }, { headers });
    if (q.get('night')) return Response.json({ version, routes: night() }, { headers });
    if ([num('flat'), num('flon'), num('tlat'), num('tlon')].every(isFinite))
      return Response.json({ version, ...fromTo({ lat: num('flat'), lon: num('flon') }, { lat: num('tlat'), lon: num('tlon') }) }, { headers });
    return Response.json({ error: 'pass q, key, night or flat/flon/tlat/tlon' }, { status: 400 });
  } catch (e) {
    return Response.json({ error: String(e.message || e) }, { status: 500 });
  }
}
