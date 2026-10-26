// API handler (served by server.js): GET /api/nearby?lat=&lon=[&r=metres]
// Every route serving the stops near you, in BOTH directions. Two sources merged:
//   1. routesbetweenstops over pairs of nearby stops — catches both directions of routes serving >=2 nearby stops
//      (fixes "the bus going the other way wasn't shown"), and works at any time of day.
//   2. trip-planning to 16 hubs — catches routes that serve only one nearby stop (which pair queries miss).
// Each route carries its nearest boarding stop so ETAs work. Returns [{routeId, name, towards, tags, stop, d}].
import { API, getJson, istNow, tripPlans, nearbyStopsFull, legStop, dist } from './plan.js';

const HUBS = [
  [12.9767, 77.5713], [12.9857, 77.6057], [12.9634, 77.5770], [12.9177, 77.6238],
  [13.0358, 77.5970], [12.9856, 77.7351], [12.8452, 77.6602], [12.9255, 77.5468],
  [13.0237, 77.5500], [13.0076, 77.6951], [12.9081, 77.4826], [12.9250, 77.5938],
  [12.9569, 77.7011], [13.1007, 77.5963], [12.9116, 77.6474], [12.9784, 77.6408],
];
const STOPS = 6, MAX_ROUTES = 80, DEFAULT_R = 1500;

function distinctByName(stops, n) {
  const seen = new Set(), out = [];
  for (const s of stops) if (!seen.has(s.name) && out.length < n) { seen.add(s.name); out.push(s); }
  return out;
}
const stop = s => s && { id: s.id, name: s.name, lat: s.lat, lon: s.lon };

export async function onRequestGet({ request }) {
  const q = new URL(request.url).searchParams;
  const p = { lat: parseFloat(q.get('lat')), lon: parseFloat(q.get('lon')) };
  if (!isFinite(p.lat) || !isFinite(p.lon)) return Response.json({ error: 'missing lat/lon' }, { status: 400 });
  const maxDist = Math.min(DEFAULT_R, Math.max(150, parseFloat(q.get('r')) || DEFAULT_R));
  try {
    const near = distinctByName((await nearbyStopsFull(p)).map(s => ({ ...s, d: dist(p, s) })), STOPS);
    const routes = new Map();
    const add = (routeId, name, towards, tags, board) => {
      if (!routeId || !board || !isFinite(board.lat)) return;
      const d = dist(p, board);
      if (d > maxDist || (routes.get(routeId)?.dM ?? Infinity) <= d) return;
      routes.set(routeId, { routeId, name: name || routeId, towards: towards || '', tags: tags || [], stop: board, dM: d, d: Math.round(d) });
    };
    const pairs = near.length >= 2 ? near.flatMap(a => near.filter(b => b !== a).map(b => [a, b])) : [];
    const when = istNow();
    const hubs = HUBS.map(([lat, lon]) => ({ lat, lon })).filter(h => dist(p, h) > 1500);
    const [rbs, hub] = await Promise.all([
      Promise.allSettled(pairs.map(([a, b]) => getJson(`${API}/v5/BENGALURU/routesbetweenstops?fromStopId=${a.id}&toStopId=${b.id}&mTicketEnabled=true`, 8000))),
      Promise.allSettled(hubs.map(t => tripPlans(p, t, when, 8000))),
    ]);
    for (const r of rbs.flatMap(x => x.status === 'fulfilled' && Array.isArray(x.value) ? x.value : []))
      add(r.routeId, r.routeName, r.lastStop?.name || r.toStop?.name, r.spf, stop(r.fromStop));
    for (const it of hub.flatMap(x => x.status === 'fulfilled' ? x.value : []))
      for (const l of it.legs || []) if (l.mode === 'BUS' && l.route_id)
        add(l.route_id, l.route_name || l.routeName, l.direction_stop?.stop_name || l.end_place_name, l.displayTags, legStop(l, 'first'));
    if (!routes.size && rbs.every(r => r.status === 'rejected') && hub.every(r => r.status === 'rejected'))
      return Response.json({ error: 'upstream failed' }, { status: 502 });
    return Response.json([...routes.values()].sort((a, b) => a.dM - b.dM).slice(0, MAX_ROUTES).map(({ dM, ...r }) => r),
      { headers: { 'cache-control': 'no-store' } });
  } catch (e) {
    return Response.json({ error: String(e.message || e) }, { status: 502 });
  }
}
