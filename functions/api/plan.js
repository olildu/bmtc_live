// Cloudflare Pages Function: GET /api/plan?flat=&flon=&tlat=&tlon=
// Proxies Chalo's (unofficial) trip planner and enriches each bus route with its stop list.
const API = 'https://production.zophop.com/scheduler_v4';
const HEADERS = { source: '0', appVer: '1001', deviceId: 'bmtc-web', accept: 'application/json', 'user-agent': 'Ktor client' };
const DAYS = ['sun', 'mon', 'tue', 'wed', 'thu', 'fri', 'sat'];

function istNow() {
  const d = new Date(Date.now() + 5.5 * 3600e3);
  return { secs: d.getUTCHours() * 3600 + d.getUTCMinutes() * 60 + d.getUTCSeconds(), day: DAYS[d.getUTCDay()] };
}

async function getJson(url) {
  const r = await fetch(url, { headers: HEADERS });
  if (!r.ok) throw new Error(`${r.status} ${(await r.text()).slice(0, 200)}`);
  return r.json();
}

async function routeDetails(routeId, day) {
  const j = await getJson(`${API}/v4/BENGALURU/routedetails?route_id=${routeId}&day=${day}`);
  const r = j.route || {};
  return {
    name: r.route_name || r.routeName || r.name || r.agency_route_name || routeId,
    category: r.serviceCategory,
    stops: (r.stopSequenceWithDetails || []).map(s => ({ id: s.stop_id, name: s.stop_name, lat: s.stop_lat, lon: s.stop_lon })),
  };
}

const stop = s => s && { id: s.stop_id, name: s.stop_name, lat: s.stop_lat, lon: s.stop_lon };

export async function plan(q) {
  for (const k of ['flat', 'flon', 'tlat', 'tlon']) if (!isFinite(parseFloat(q[k]))) throw new Error(`missing ${k}`);
  const { secs, day } = istNow();
  const url = `${API}/v5/BENGALURU/tripplanner?from_lat=${q.flat}&from_lon=${q.flon}&to_lat=${q.tlat}&to_lon=${q.tlon}` +
    `&mode=transit&start_time=${secs}&day=${day}&startTimeMillis=${Date.now()}`;
  const j = await getJson(url);
  const its = [...(j.payload?.itineraries || []), ...(j.payload?.nearbyItineraries || [])];
  const routes = new Map();
  for (const it of its) {
    const busLegs = (it.legs || []).filter(l => l.mode === 'BUS' && l.route_id);
    for (const l of busLegs) {
      const prev = routes.get(l.route_id);
      if (prev && prev.direct) continue;
      routes.set(l.route_id, {
        routeId: l.route_id,
        direct: busLegs.length === 1,
        legName: l.route_name || l.routeName || l.route_short_name,
        tags: l.displayTags || [],
        board: stop(l.first_stop),
        alight: stop(l.last_stop),
        travelTime: l.travel_time,
        totalTime: it.legs.reduce((a, x) => a + (x.travel_time || 0), 0),
      });
    }
  }
  const out = await Promise.all([...routes.values()].map(async r => {
    try {
      const d = await routeDetails(r.routeId, day);
      return { ...r, name: r.legName || d.name, category: d.category, stops: d.stops };
    } catch { return { ...r, name: r.legName || r.routeId, stops: [] }; }
  }));
  out.sort((a, b) => (b.direct - a.direct) || (a.totalTime - b.totalTime));
  return out;
}

export async function onRequestGet({ request }) {
  const q = Object.fromEntries(new URL(request.url).searchParams);
  try {
    return Response.json(await plan(q), { headers: { 'cache-control': 'no-store' } });
  } catch (e) {
    return Response.json({ error: String(e.message || e) }, { status: 502 });
  }
}
