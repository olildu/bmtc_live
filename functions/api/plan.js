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

// In-memory cache for every Chalo call (one long-running Node process). Fewer upstream calls means less chance of
// Chalo blocking the server's IP. Identical calls in flight share one request; errors aren't cached. Bodies are
// stored as text and parsed per hit, so callers can't change each other's results.
const TTL = [
  [/\/routedetails\?|\/search\?|\/routesbetweenstops\?/, 6 * 3600e3], // static per route/stop pair (and day)
  [/\/nearby\/stops\?/, 24 * 3600e3],                                 // stops don't move
  [/\/tripplanner\?/, 10 * 60e3],                                     // keyed on the start minute
];
const MAX_BYTES = 50e6;
const cache = new Map(); // url -> {exp, text?, p?}; Map order = oldest first
let bytes = 0, hits = 0, misses = 0;
export const cacheStats = () => ({ entries: cache.size, mb: +(bytes / 1e6).toFixed(1), hits, misses });

async function fetchText(url, timeoutMs) {
  const r = await fetch(url, { headers: HEADERS, signal: AbortSignal.timeout(timeoutMs) });
  const text = await r.text();
  if (!r.ok) throw new Error(`${r.status} ${text.slice(0, 200)}`);
  return text;
}

// local builds only (release images set APP_VERSION to the tag): one line per upstream call
const DEV = (globalThis.process?.env?.APP_VERSION || 'dev') === 'dev';
const dlog = DEV ? (how, url, t0, extra = '') => console.log(`[chalo] ${how} ${Date.now() - t0}ms ${url.replace(API, '')}${extra}`) : () => {};

export async function getJson(url, timeoutMs = 20000) {
  const ttl = TTL.find(([re]) => re.test(url))?.[1], t0 = Date.now();
  if (!ttl) {
    try { const j = JSON.parse(await fetchText(url, timeoutMs)); dlog('FETCH', url, t0); return j; }
    catch (err) { dlog('ERROR', url, t0, ` → ${err.message || err}`); throw err; }
  }
  const e = cache.get(url);
  if (e && e.exp > Date.now()) { hits++; const j = JSON.parse(e.text ?? await e.p); dlog(e.text ? 'HIT' : 'SHARED', url, t0); return j; }
  if (e) { cache.delete(url); bytes -= e.text?.length || 0; }
  misses++;
  const entry = { exp: Date.now() + ttl, p: fetchText(url, timeoutMs) };
  cache.set(url, entry);
  try {
    entry.text = await entry.p;
    dlog('MISS', url, t0);
  } catch (err) {
    if (cache.get(url) === entry) cache.delete(url);
    dlog('ERROR', url, t0, ` → ${err.message || err}`);
    throw err;
  }
  delete entry.p;
  bytes += entry.text.length;
  for (const [k, v] of cache) {
    if (bytes <= MAX_BYTES) break;
    if (v.text === undefined) continue;
    cache.delete(k); bytes -= v.text.length;
  }
  return JSON.parse(entry.text);
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
  // start on the minute so repeat plans within a minute hit the cache (IST is a whole number of minutes from UTC)
  const secs = when.secs - when.secs % 60, ms = when.ms - when.ms % 60e3;
  const j = await getJson(`${API}/v5/BENGALURU/tripplanner?from_lat=${f.lat}&from_lon=${f.lon}&to_lat=${t.lat}&to_lon=${t.lon}` +
    `&mode=transit&start_time=${secs}&day=${when.day}&startTimeMillis=${ms}`, timeoutMs);
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
  // probe stops ~4 km around the destination (started early so they resolve while the main plan runs)
  const probeStops = Promise.allSettled([
    { lat: to.lat + 0.04, lon: to.lon }, { lat: to.lat - 0.04, lon: to.lon },
    { lat: to.lat, lon: to.lon + 0.04 }, { lat: to.lat, lon: to.lon - 0.04 },
    { lat: to.lat + 0.028, lon: to.lon + 0.028 }, { lat: to.lat + 0.028, lon: to.lon - 0.028 },
    { lat: to.lat - 0.028, lon: to.lon + 0.028 }, { lat: to.lat - 0.028, lon: to.lon - 0.028 },
  ].map(p => nearbyStops(p)));
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
  // "gets you closer" partial options: plan to stops ~4 km around the destination
  // (probeStops was started in parallel with the main plan, so it's already resolved)
  let partial = [];
  const totalDist = dist(from, to);
  const seen = new Set();
  const wideStops = (await probeStops)
    .flatMap(r => r.status === 'fulfilled' ? r.value : [])
    .filter(s => seen.has(s.id) ? false : (seen.add(s.id), true))
    .filter(s => dist(s, to) < totalDist * 0.7);
  const targets = spread(to, wideStops, 6, 400);
  if (targets.length) {
    const times = [now]; if (!planned) times.push(istTomorrow9());
    const probeIts = (await Promise.allSettled(
      targets.flatMap(t => times.map(when => tripPlans(from, t, when, 8000)))
    )).flatMap(r => r.status === 'fulfilled' ? r.value : []);
    for (const it of probeIts) it._dayStart = now.ms - now.secs * 1000;
    const mainRouteKeys = new Set([...journeys.values()].map(j =>
      j.legs.filter(l => l.mode !== 'walk').map(l => l.routeId).join('|')));
    const pMap = new Map();
    for (const it of probeIts) {
      const legs = (it.legs || []).filter(l => l.mode === 'WALK' || ((l.mode === 'BUS' || l.mode === 'METRO') && l.route_id));
      const rides = legs.filter(l => l.mode !== 'WALK');
      if (!rides.length) continue;
      const rkey = rides.map(l => l.route_id).join('|');
      if (mainRouteKeys.has(rkey)) continue;
      const alight = legStop(rides.at(-1), 'last');
      const remainingM = Math.round(dist(alight, to));
      if (remainingM > totalDist * 0.7) continue;
      const firstBoard = legStop(rides[0], 'first');
      if (walkM(from, firstBoard) / WALK_SPEED > MAX_WALK_MIN) continue;
      const prev = pMap.get(rkey);
      if (!prev || prev.remainingM > remainingM) {
        const pLegs = legs.map(l => legOut(it, l));
        if (pLegs.at(-1)?.mode === 'walk') pLegs.pop();
        pMap.set(rkey, { key: rkey, legs: pLegs, remainingM, fare: it.total_fare ?? null });
      }
    }
    partial = [...pMap.values()].sort((a, b) => a.remainingM - b.remainingM).slice(0, 10);
  }
  // stop lists for every bus route used, so the page can tell where each bus is relative to your stops
  const busIds = [...new Set([...list, ...partial].flatMap(j => j.legs.filter(l => l.mode === 'bus').map(l => l.routeId)))].slice(0, (night ? MAX_ROUTES_NIGHT : MAX_ROUTES) + 10);
  const stopLists = {};
  await Promise.all(busIds.map(async id => { try { stopLists[id] = (await routeDetails(id, day)).stops; } catch { stopLists[id] = []; } }));
  return { journeys: list, stops: stopLists, night, ...(partial.length && { partial }) };
}

export async function onRequestGet({ request }) {
  const q = Object.fromEntries(new URL(request.url).searchParams);
  try {
    return Response.json(await plan(q), { headers: { 'cache-control': 'no-store' } });
  } catch (e) {
    return Response.json({ error: String(e.message || e) }, { status: 502 });
  }
}
