// API handler (served by server.js): GET /api/direct?flat=&flon=&tlat=&tlon=
// Direct bus routes between the stops near the start and the stops near the destination, from Chalo's
// routesbetweenstops. Unlike the trip planner it doesn't depend on the time of day, so the page uses it at night,
// when the planner has nothing for "leaving now". Returns [{routeId, name, tags, board, alight, walk...}].
import { API, getJson, nearbyStopsFull, dist, walkM, WALK_SPEED } from './plan.js';

const PER_SIDE = 6; // 2 nearby calls + 6 x 6 pair calls = 38 upstream calls (kept small to go easy on Chalo)

// routesbetweenstops matches stops by name, so one stop per distinct name is enough
function distinctByName(stops, n) {
  const seen = new Set(), out = [];
  for (const s of stops) if (!seen.has(s.name) && out.length < n) { seen.add(s.name); out.push(s); }
  return out;
}
const stop = s => s && { id: s.id, name: s.name, lat: s.lat, lon: s.lon };

export async function onRequestGet({ request }) {
  const q = Object.fromEntries(new URL(request.url).searchParams);
  for (const k of ['flat', 'flon', 'tlat', 'tlon']) if (!isFinite(parseFloat(q[k]))) return Response.json({ error: `missing ${k}` }, { status: 400 });
  const from = { lat: +q.flat, lon: +q.flon }, to = { lat: +q.tlat, lon: +q.tlon };
  try {
    const [fs, ts] = await Promise.all([nearbyStopsFull(from), nearbyStopsFull(to)]);
    const pairs = distinctByName(fs, PER_SIDE).flatMap(a => distinctByName(ts, PER_SIDE).map(b => [a, b]));
    const results = await Promise.allSettled(pairs.map(([a, b]) =>
      getJson(`${API}/v5/BENGALURU/routesbetweenstops?fromStopId=${a.id}&toStopId=${b.id}&mTicketEnabled=true`, 8000)));
    const routes = new Map();
    for (const r of results.flatMap(x => x.status === 'fulfilled' && Array.isArray(x.value) ? x.value : [])) {
      const board = stop(r.fromStop), alight = stop(r.toStop);
      if (!r.routeId || !board || !alight) continue;
      const walkStart = walkM(from, board), walkEnd = walkM(alight, to), walkTotal = walkStart + walkEnd;
      if ((routes.get(r.routeId)?.walkM ?? Infinity) <= walkTotal) continue;
      routes.set(r.routeId, {
        routeId: r.routeId, name: r.routeName || r.routeId, tags: r.spf || [], board, alight, direct: true, walkM: walkTotal,
        walkToBoard: Math.round(walkStart / WALK_SPEED), walkFromAlight: Math.round(walkEnd / WALK_SPEED), walkTotal: Math.round(walkTotal / WALK_SPEED),
      });
    }
    return Response.json([...routes.values()].sort((a, b) => a.walkM - b.walkM), { headers: { 'cache-control': 'no-store' } });
  } catch (e) {
    return Response.json({ error: String(e.message || e) }, { status: 502 });
  }
}
