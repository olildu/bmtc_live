// Cloudflare Pages Function for route tracking.
//   GET /api/route?q=500D       -> routes matching a route number (both directions)
//   GET /api/route?id=<routeId> -> that route's stops in order and its road shape (encoded polyline)
import { API, getJson, istNow } from './plan.js';

const CACHE = { 'cache-control': 'public, max-age=3600' };

export async function onRequestGet({ request }) {
  const q = new URL(request.url).searchParams;
  const { day } = istNow();
  try {
    const id = q.get('id');
    if (id) {
      const r = (await getJson(`${API}/v4/BENGALURU/routedetails?route_id=${encodeURIComponent(id)}&day=${day}`)).route || {};
      return Response.json({
        routeId: r.route_id || id,
        name: r.route_name || id,
        from: r.first_stop?.stop_name,
        to: r.last_stop?.stop_name,
        tags: r.spf || [],
        polyline: r.polyline || '',
        stops: (r.stopSequenceWithDetails || []).map(s => ({ id: s.stop_id, name: s.stop_name, lat: s.stop_lat, lon: s.stop_lon })),
      }, { headers: CACHE });
    }
    const str = (q.get('q') || '').trim();
    if (!str) return Response.json([]);
    const j = await getJson(`${API}/v4/BENGALURU/search?str=${encodeURIComponent(str)}&day=${day}`);
    return Response.json((j.routes || []).slice(0, 20).map(r => ({
      routeId: r.route_id, name: r.route_name, from: r.first_stop_name, to: r.last_stop_name, tags: r.spf || [],
    })), { headers: CACHE });
  } catch (e) {
    return Response.json({ error: String(e.message || e) }, { status: 502 });
  }
}
