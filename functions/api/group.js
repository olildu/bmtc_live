// API handler (served by server.js): GET /api/group?p=<boardStopId>><alightStopId>,...
// For each stop pair, every Chalo route ID that runs from the first stop to the second (routesbetweenstops).
// Chalo often has several IDs for one route (stale duplicates, depot and short-run variants) and puts live buses on
// any of them, so the page watches all IDs of the same route number for a ride, the way BMTC's own site groups a
// route's variants. At most MAX pairs per request; each pair is cached 6 h by getJson.
import { API, getJson } from './plan.js';

const MAX = 30;

export async function onRequestGet({ request }) {
  const p = new URL(request.url).searchParams.get('p') || '';
  const pairs = [...new Set(p.split(',').filter(x => /^[\w-]+>[\w-]+$/.test(x)))].slice(0, MAX);
  const out = {};
  await Promise.all(pairs.map(async pair => {
    const [a, b] = pair.split('>');
    try {
      const j = await getJson(`${API}/v5/BENGALURU/routesbetweenstops?fromStopId=${a}&toStopId=${b}&mTicketEnabled=true`, 8000);
      out[pair] = (Array.isArray(j) ? j : []).filter(r => r.routeId).map(r => ({ routeId: r.routeId, name: r.routeName || r.routeId }));
    } catch {
      out[pair] = null; // unknown: the page keeps the planner's single route ID
    }
  }));
  return Response.json(out, { headers: { 'cache-control': 'no-store' } });
}
