// API handler (served by server.js): GET /api/tometro?flat=&flon=&st=lat,lon,stationId;...
// Direct buses from the stops near the start to the stops beside up to 3 metro stations, for "bus, then metro"
// journeys. The page picks the stations (it has public/metro.json) by how quickly bus + metro reach the destination.
// Uses routesbetweenstops, which works at any hour. Returns [{routeId, name, tags, board, alight, stationId, walkToBoard}].
import { API, getJson, nearbyStopsFull, walkM, WALK_SPEED } from './plan.js';

const ORIGIN_STOPS = 5, STATION_STOPS = 2, MAX_STATIONS = 3, STATION_RADIUS = 350; // 1 + 3 + 5*6 = 34 upstream calls

function distinctByName(stops, n) {
  const seen = new Set(), out = [];
  for (const s of stops) if (!seen.has(s.name) && out.length < n) { seen.add(s.name); out.push(s); }
  return out;
}
const stop = s => s && { id: s.id, name: s.name, lat: s.lat, lon: s.lon };

export async function onRequestGet({ request }) {
  const q = Object.fromEntries(new URL(request.url).searchParams);
  if (!isFinite(parseFloat(q.flat)) || !isFinite(parseFloat(q.flon))) return Response.json({ error: 'missing flat/flon' }, { status: 400 });
  const from = { lat: +q.flat, lon: +q.flon };
  const stations = (q.st || '').split(';').map(x => x.split(',')).filter(x => x.length >= 3 && isFinite(+x[0]) && isFinite(+x[1]))
    .slice(0, MAX_STATIONS).map(([lat, lon, id]) => ({ lat: +lat, lon: +lon, id }));
  if (!stations.length) return Response.json([]);
  try {
    const [origin, ...near] = await Promise.all([nearbyStopsFull(from), ...stations.map(s => nearbyStopsFull(s).catch(() => []))]);
    const os = distinctByName(origin, ORIGIN_STOPS);
    const targets = stations.flatMap((st, i) => distinctByName(near[i].filter(x => walkM(st, x) / 1.3 <= STATION_RADIUS), STATION_STOPS).map(x => ({ ...x, stationId: st.id })));
    const pairs = os.flatMap(a => targets.map(b => [a, b]));
    const results = await Promise.allSettled(pairs.map(([a, b]) =>
      getJson(`${API}/v5/BENGALURU/routesbetweenstops?fromStopId=${a.id}&toStopId=${b.id}&mTicketEnabled=true`, 8000)));
    const out = new Map();
    results.forEach((x, i) => {
      if (x.status !== 'fulfilled' || !Array.isArray(x.value)) return;
      const target = pairs[i][1];
      for (const r of x.value) {
        const board = stop(r.fromStop), alight = stop(r.toStop);
        if (!r.routeId || !board || !alight) continue;
        const key = r.routeId + '|' + target.stationId, walk = walkM(from, board);
        if ((out.get(key)?.walkM ?? Infinity) <= walk) continue;
        out.set(key, { routeId: r.routeId, name: r.routeName || r.routeId, tags: r.spf || [], board, alight, stationId: target.stationId,
          walkM: walk, walkToBoard: Math.round(walk / WALK_SPEED) });
      }
    });
    return Response.json([...out.values()].sort((a, b) => a.walkM - b.walkM), { headers: { 'cache-control': 'no-store' } });
  } catch (e) {
    return Response.json({ error: String(e.message || e) }, { status: 502 });
  }
}
