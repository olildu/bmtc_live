// Cloudflare Pages Function: GET /api/plan?flat=&flon=&tlat=&tlon=
// Proxies Chalo's (unofficial) trip planner and enriches each bus route with its stop list.
export const API = 'https://production.zophop.com/scheduler_v4';
const HEADERS = { source: '0', appVer: '1001', deviceId: 'bmtc-web', accept: 'application/json', 'user-agent': 'Ktor client' };
const DAYS = ['sun', 'mon', 'tue', 'wed', 'thu', 'fri', 'sat'];

// when to plan for: seconds since IST midnight, day name, and the matching epoch ms
export function istNow() {
  const d = new Date(Date.now() + 5.5 * 3600e3);
  return { secs: d.getUTCHours() * 3600 + d.getUTCMinutes() * 60 + d.getUTCSeconds(), day: DAYS[d.getUTCDay()], ms: Date.now() };
}
// Late at night the planner returns nothing for "leaving now" (it plans from the timetable). Planning for tomorrow
// 09:00 still discovers the routes; the page then shows only the buses actually running. The epoch ms must match:
// "today 09:00" sent with the current time returns nothing.
export function istTomorrow9() {
  const d = new Date(Date.now() + 5.5 * 3600e3);
  const ms = Date.UTC(d.getUTCFullYear(), d.getUTCMonth(), d.getUTCDate() + 1, 9, 0) - 5.5 * 3600e3;
  return { secs: 9 * 3600, day: DAYS[new Date(ms + 5.5 * 3600e3).getUTCDay()], ms };
}

export async function getJson(url, timeoutMs = 20000) {
  const r = await fetch(url, { headers: HEADERS, signal: AbortSignal.timeout(timeoutMs) });
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
export const legStop = (l, end) => stop(l[`${end}_stop`]) ||
  { id: l[`${end}_stop_id`], name: l[end === 'first' ? 'start_place_name' : 'end_place_name'], lat: l[end === 'first' ? 'from_lat' : 'to_lat'], lon: l[end === 'first' ? 'from_lon' : 'to_lon'] };

// straight-line metres; walking estimates use x1.3 for the street grid at 80 m/min
export function dist(a, b) {
  const R = 6371e3, r = Math.PI / 180, dLat = (b.lat - a.lat) * r, dLon = (b.lon - a.lon) * r;
  const h = Math.sin(dLat / 2) ** 2 + Math.cos(a.lat * r) * Math.cos(b.lat * r) * Math.sin(dLon / 2) ** 2;
  return 2 * R * Math.asin(Math.sqrt(h));
}
export const walkM = (a, b) => Math.round(dist(a, b) * 1.3);
export const WALK_SPEED = 80; // m/min
// Workers allow 50 subrequests per request: a normal plan uses 15 + one routedetails per route; a night plan
// adds a second 13-call pass (nearby stops are reused), so it keeps fewer routes.
const MAX_WALK_MIN = 35, MAX_ROUTES = 30, MAX_ROUTES_NIGHT = 20, MIN_ROUTES = 5;

export async function tripPlans(f, t, when, timeoutMs) {
  const j = await getJson(`${API}/v5/BENGALURU/tripplanner?from_lat=${f.lat}&from_lon=${f.lon}&to_lat=${t.lat}&to_lon=${t.lon}` +
    `&mode=transit&start_time=${when.secs}&day=${when.day}&startTimeMillis=${when.ms}`, timeoutMs);
  return [...(j.payload?.itineraries || []), ...(j.payload?.nearbyItineraries || [])];
}
// the up-to-20 bus stops nearest a point (about 1 km), nearest first
export async function nearbyStopsFull(p) {
  const j = await getJson(`${API}/v4/bengaluru/nearby/stops?lat=${p.lat}&lon=${p.lon}&transitMode=bus`, 4000);
  return (j || []).map(s => ({ id: s.stop_id, name: s.stop_name, lat: s.stop_lat, lon: s.stop_lon }));
}
const nearbyStops = nearbyStopsFull;
// up to n stops, at least `gap` m from each other and from the point itself
function spread(p, stops, n, gap = 200) {
  const out = [p];
  for (const s of stops) if (out.length <= n && out.every(o => dist(o, s) > gap)) out.push(s);
  return out.slice(1);
}

export async function plan(q) {
  for (const k of ['flat', 'flon', 'tlat', 'tlon']) if (!isFinite(parseFloat(q[k]))) throw new Error(`missing ${k}`);
  const from = { lat: +q.flat, lon: +q.flon }, to = { lat: +q.tlat, lon: +q.tlon };
  const now = istNow();
  // The planner only returns a few itineraries from the exact point, often all with transfers. Planning again
  // from the stops a short walk away (and to stops near the destination) turns up direct buses worth walking to.
  // These extra lookups are best-effort and time-boxed, so a slow one can't hold up the main plan.
  const stops = Promise.all([nearbyStops(from).catch(() => []), nearbyStops(to).catch(() => [])]);
  const pass = async when => {
    const main = tripPlans(from, to, when);
    const extra = stops.then(([fs, ts]) =>
      Promise.allSettled([...spread(from, fs, 8).map(s => [s, to]), ...spread(to, ts, 4).map(s => [from, s])]
        .map(([f, t]) => tripPlans(f, t, when, 6000))));
    const [mainRes, extraRes] = await Promise.all([main.then(v => ({ value: v }), e => ({ error: e })), extra]);
    const extraIts = extraRes.flatMap(r => r.status === 'fulfilled' ? r.value : []);
    if (mainRes.error && !extraIts.length) throw mainRes.error;
    return [...(mainRes.value || []), ...extraIts];
  };
  // Thin results (late at night) get a second pass planned for tomorrow 09:00; routes only found that way are
  // marked `night` and the page shows them only while a bus is actually running.
  const busRoutes = list => new Set(list.flatMap(it => (it.legs || []).filter(l => l.mode === 'BUS').map(l => l.route_id)));
  let its = await pass(now), nightIts = [];
  if (busRoutes(its).size < MIN_ROUTES) nightIts = await pass(istTomorrow9()).catch(() => []);
  const nowRoutes = busRoutes(its), night = nightIts.length > 0;
  its = [...its, ...nightIts];
  const day = now.day;

  const routes = new Map();
  for (const it of its) {
    const legs = it.legs || [];
    const busLegs = legs.filter(l => l.mode === 'BUS' && l.route_id);
    if (!busLegs.length) continue;
    const first = legStop(busLegs[0], 'first'), last = legStop(busLegs.at(-1), 'last');
    // walks measured from the user's real start/end, plus any transfer walks in between
    const walkStart = walkM(from, first), walkEnd = walkM(last, to);
    const i0 = legs.indexOf(busLegs[0]), i1 = legs.indexOf(busLegs.at(-1));
    const walkMid = legs.slice(i0, i1).filter(l => l.mode === 'WALK').reduce((a, l) => a + (l.distance || 0), 0);
    const walkTotal = walkStart + walkMid + walkEnd;
    if (walkTotal / WALK_SPEED > MAX_WALK_MIN) continue;
    const totalTime = Math.round(walkTotal / WALK_SPEED * 60) + busLegs.reduce((a, l) => a + (l.travel_time || 0), 0);
    const direct = busLegs.length === 1;
    for (const [k, l] of busLegs.entries()) {
      const prev = routes.get(l.route_id);
      if (prev && (prev.direct > direct || (prev.direct === direct && prev.totalTime <= totalTime))) continue;
      const board = legStop(l, 'first'), alight = legStop(l, 'last');
      routes.set(l.route_id, {
        routeId: l.route_id,
        direct,
        legName: l.route_name || l.routeName || l.route_short_name,
        tags: l.displayTags || [],
        board, alight,
        travelTime: l.travel_time,
        totalTime,
        // walk to this leg's boarding stop / from its alighting stop (only the first/last leg touch your start/end)
        walkToBoard: k === 0 ? Math.round(walkStart / WALK_SPEED) : null,
        walkFromAlight: k === busLegs.length - 1 ? Math.round(walkEnd / WALK_SPEED) : null,
        walkTotal: Math.round(walkTotal / WALK_SPEED),
        // fares come per leg (fares[].leg_index points into it.legs) plus a total for the whole itinerary
        fare: (it.fares || []).find(f => (f.leg_index || []).includes(legs.indexOf(l)))?.default_fare ?? null,
        totalFare: it.total_fare ?? null,
        // the other buses of this itinerary, so the page can tell whether a transfer's connection is running
        connects: busLegs.filter(x => x !== l).map(x => ({ routeId: x.route_id, name: x.route_name || x.routeName || x.route_id })),
        ...(!nowRoutes.has(l.route_id) && { night: true }),
      });
    }
  }
  const picked = [...routes.values()].sort((a, b) => (b.direct - a.direct) || (a.totalTime - b.totalTime)).slice(0, night ? MAX_ROUTES_NIGHT : MAX_ROUTES);
  const out = await Promise.all(picked.map(async r => {
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
