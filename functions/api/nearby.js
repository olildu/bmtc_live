// Cloudflare Pages Function: GET /api/nearby?lat=&lon=
// Chalo has no working "buses near a point" call for BMTC (geoquery's nearbybus returns nothing, /summary returns
// NO_TRIPS_FOR_ANY_STOPS_NEARBY). So: plan trips from the point to the city's main hubs and keep every route that
// boards close by. Returns [{routeId, name, towards, tags, stop, d}] nearest stop first; the page subscribes to them live.
import { istNow, tripPlans, legStop, dist } from './plan.js';

const MAX_STOP_DIST = 1500; // m from the point to the boarding stop
const HUBS = [
  [12.9767, 77.5713], // Kempegowda Bus Station (Majestic)
  [12.9857, 77.6057], // Shivajinagar
  [12.9634, 77.5770], // KR Market
  [12.9177, 77.6238], // Central Silk Board
  [13.0358, 77.5970], // Hebbal
  [12.9856, 77.7351], // ITPL / Whitefield
  [12.8452, 77.6602], // Electronic City
  [12.9255, 77.5468], // Banashankari
  [13.0237, 77.5500], // Yeshwanthpur
  [13.0076, 77.6951], // KR Puram
  [12.9081, 77.4826], // Kengeri
  [12.9250, 77.5938], // Jayanagar
  [12.9569, 77.7011], // Marathahalli
  [13.1007, 77.5963], // Yelahanka
  [12.9116, 77.6474], // HSR Layout
  [12.9784, 77.6408], // Indiranagar
];

export async function onRequestGet({ request }) {
  const q = new URL(request.url).searchParams;
  const p = { lat: parseFloat(q.get('lat')), lon: parseFloat(q.get('lon')) };
  if (!isFinite(p.lat) || !isFinite(p.lon)) return Response.json({ error: 'missing lat/lon' }, { status: 400 });
  const { secs, day } = istNow();
  const targets = HUBS.map(([lat, lon]) => ({ lat, lon })).filter(h => dist(p, h) > 1500);
  const results = await Promise.allSettled(targets.map(t => tripPlans(p, t, secs, day, 8000)));
  if (results.every(r => r.status === 'rejected')) return Response.json({ error: String(results[0].reason?.message || results[0].reason) }, { status: 502 });
  const routes = new Map();
  for (const it of results.flatMap(r => r.status === 'fulfilled' ? r.value : [])) {
    for (const l of it.legs || []) {
      if (l.mode !== 'BUS' || !l.route_id) continue;
      const stop = legStop(l, 'first'), d = dist(p, stop);
      if (!(d <= MAX_STOP_DIST) || (routes.get(l.route_id)?.d ?? Infinity) <= d) continue;
      routes.set(l.route_id, {
        routeId: l.route_id,
        name: l.route_name || l.routeName || l.route_id,
        towards: l.direction_stop?.stop_name || l.end_place_name,
        tags: l.displayTags || [],
        stop, d: Math.round(d),
      });
    }
  }
  return Response.json([...routes.values()].sort((a, b) => a.d - b.d), { headers: { 'cache-control': 'no-store' } });
}
