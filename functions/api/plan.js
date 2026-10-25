// API handler (served by server.js): GET /api/plan?flat=&flon=&tlat=&tlon=
// Proxies Chalo's (unofficial) trip planner. Returns {journeys: [{legs: walk/bus/metro, totalTime, fare, night?}],
// stops: {routeId: [stop list]}, night}. The page ranks journeys by live arrival time.
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
// a given moment (epoch ms), for "leave at" / "arrive by" planning
export function istAt(ms) {
  const d = new Date(ms + 5.5 * 3600e3);
  return { secs: d.getUTCHours() * 3600 + d.getUTCMinutes() * 60 + d.getUTCSeconds(), day: DAYS[d.getUTCDay()], ms };
}
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
// Upstream call budget (originally Cloudflare's 50-subrequest limit; kept to go easy on Chalo): a normal plan uses 15 + one routedetails per route; a night plan
// adds a second 13-call pass (nearby stops are reused), so it keeps fewer routes.
const MAX_WALK_MIN = 35, MAX_ROUTES = 30, MAX_ROUTES_NIGHT = 20, MIN_ROUTES = 5, MAX_JOURNEYS = 25;

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
  const at = parseFloat(q.at), planned = isFinite(at) && at > Date.now() - 60e3;
  const now = planned ? istAt(at) : istNow();
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
    const list = [...(mainRes.value || []), ...extraIts];
    for (const it of list) it._dayStart = when.ms - when.secs * 1000; // to turn leg start/end (secs since midnight) into times
    return list;
  };
  // Thin results (late at night) get a second pass planned for tomorrow 09:00; routes only found that way are
  // marked `night` and the page shows them only while a bus is actually running.
  const busRoutes = list => new Set(list.flatMap(it => (it.legs || []).filter(l => l.mode === 'BUS').map(l => l.route_id)));
  let its = await pass(now), nightIts = [];
  if (!planned && busRoutes(its).size < MIN_ROUTES) nightIts = await pass(istTomorrow9()).catch(() => []);
  const nowRoutes = busRoutes(its), night = nightIts.length > 0;
  its = [...its, ...nightIts];
  const day = now.day;

  // Whole journeys (walk / bus / metro legs) so the page can rank them by live arrival time. Metro legs are kept now:
  // the planner sometimes picks the metro, e.g. Indiranagar -> Majestic on the Purple line.
  const nightSet = new Set(nightIts);
  const legOut = (it, l) => {
    if (l.mode === 'WALK') return { mode: 'walk', m: l.distance || 0 };
    const fare = (it.fares || []).find(f => (f.leg_index || []).includes(it.legs.indexOf(l)))?.default_fare ?? null;
    const base = { routeId: l.route_id, name: l.route_name || l.routeName || l.route_id, board: legStop(l, 'first'), alight: legStop(l, 'last'), travelTime: l.travel_time || null, fare,
      // scheduled departure/arrival of this leg (epoch ms), used when planning for a later time
      ...(isFinite(l.start_time) && isFinite(l.end_time) && { dep: it._dayStart + l.start_time * 1000, arr: it._dayStart + l.end_time * 1000 }) };
    return l.mode === 'METRO'
      ? { mode: 'metro', ...base, color: l.routeColorValue || null, stations: (l.intermediateStops || []).map(x => x.stop_name), frequency: l.frequency || null }
      : { mode: 'bus', ...base, tags: l.displayTags || [] };
  };
  const journeys = new Map(), nowKeys = new Set();
  for (const it of its) {
    const legs = (it.legs || []).filter(l => l.mode === 'WALK' || ((l.mode === 'BUS' || l.mode === 'METRO') && l.route_id));
    const rides = legs.filter(l => l.mode !== 'WALK');
    if (!rides.length) continue;
    const key = rides.map(l => `${l.route_id}@${legStop(l, 'first').id}>${legStop(l, 'last').id}`).join('|');
    if (!nightSet.has(it)) nowKeys.add(key);
    // walks measured from the user's real start/end, plus any transfer walks in between
    const walkStart = walkM(from, legStop(rides[0], 'first')), walkEnd = walkM(legStop(rides.at(-1), 'last'), to);
    const i0 = legs.indexOf(rides[0]), i1 = legs.indexOf(rides.at(-1));
    const walkMid = legs.slice(i0, i1).filter(l => l.mode === 'WALK').reduce((a, l) => a + (l.distance || 0), 0);
    const walk = walkStart + walkMid + walkEnd;
    if (walk / WALK_SPEED > MAX_WALK_MIN) continue;
    const totalTime = Math.round(walk / WALK_SPEED * 60) + rides.reduce((a, l) => a + (l.travel_time || 0), 0);
    if ((journeys.get(key)?.totalTime ?? Infinity) <= totalTime) continue;
    journeys.set(key, { key, legs: legs.map(l => legOut(it, l)), totalTime, fare: it.total_fare ?? null, walkStart, walkEnd, nightPass: nightSet.has(it) });
  }
  const list = [...journeys.values()].sort((a, b) => a.totalTime - b.totalTime).slice(0, MAX_JOURNEYS)
    .map(({ nightPass, ...j }) => ({ ...j, ...(nightPass && !nowKeys.has(j.key) && { night: true }) }));
  // stop lists for every bus route used, so the page can tell where each bus is relative to your stops
  const busIds = [...new Set(list.flatMap(j => j.legs.filter(l => l.mode === 'bus').map(l => l.routeId)))].slice(0, night ? MAX_ROUTES_NIGHT : MAX_ROUTES);
  const stopLists = {};
  await Promise.all(busIds.map(async id => { try { stopLists[id] = (await routeDetails(id, day)).stops; } catch { stopLists[id] = []; } }));
  return { journeys: list, stops: stopLists, night };
}

export async function onRequestGet({ request }) {
  const q = Object.fromEntries(new URL(request.url).searchParams);
  try {
    return Response.json(await plan(q), { headers: { 'cache-control': 'no-store' } });
  } catch (e) {
    return Response.json({ error: String(e.message || e) }, { status: 502 });
  }
}
