// API handler (served by server.js / Pages functions): GET /api/jcstl?action=live|routes|route|track|stop|between
// Proxies Omnificent's backend for Jaipur (JCSTL) bus tracking. Every upstream call is a POST; we expose them as GET.
export const API = 'https://www.omnificent.co.in/OMB/';
const LOGIN_BODY = { req_type: '1', country_code: '+91', mobile: '9000090000', ph_brand: 'web', ph_mdl: 'web', os_ver: '14', dev_id: 'jcstl_web', ver_nm: '1.5.1', ver_cd: '30', fcm_token: 'web' };
const CORS = { 'access-control-allow-origin': '*' };
const DEV = (globalThis.process?.env?.APP_VERSION || 'dev') === 'dev';
const dlog = DEV ? (msg) => console.log(`[jcstl] ${msg}`) : () => {};

let session = null; // { token, userId }
let routesCache = null; // { exp, data }
let liveCache = null; // { exp, data }
const ROUTES_TTL = 6 * 3600e3;
const LIVE_TTL = 15e3;

const json = (body, status = 200) => Response.json(body, { status, headers: CORS });

async function post(path, body, auth) {
  const headers = { 'content-type': 'application/json', accept: 'application/json', ...(auth && { 'Auth-token': auth.token, 'User-ID': auth.userId }) };
  const t0 = Date.now();
  const r = await fetch(API + path, { method: 'POST', headers, body: JSON.stringify(body), signal: AbortSignal.timeout(15000) });
  dlog(`${r.status} ${path} ${Date.now() - t0}ms`);
  return r;
}

async function login() {
  const r = await post('log/usr', LOGIN_BODY);
  const j = await r.json().catch(() => null);
  const token = j?.respData?.authToken, userId = j?.respData?.userId;
  if (!r.ok || j?.respCode !== '200' || !token || !userId) throw new Error(`login failed: ${r.status} ${j?.respCode ?? ''}`);
  session = { token, userId: String(userId) };
  return session;
}

// Calls an authenticated upstream endpoint; on 401 or no session, logs in again and retries once.
async function call(path, body) {
  const attempt = async () => {
    const auth = session ?? (await login());
    const r = await post(path, body, auth);
    return r;
  };
  let r = await attempt();
  if (r.status === 401) {
    session = null;
    r = await attempt();
  }
  const j = await r.json().catch(() => null);
  if (!r.ok) throw new Error(`upstream ${r.status} on ${path}`);
  return j;
}

export async function onRequestGet({ request }) {
  const url = new URL(request.url);
  const p = url.searchParams;
  const action = p.get('action');
  try {
    if (action === 'live') {
      if (!liveCache || liveCache.exp <= Date.now()) {
        const j = await call('allvehloc', { org_id: '1' });
        liveCache = { exp: Date.now() + LIVE_TTL, data: j?.respData ?? [] };
      }
      return json(liveCache.data);
    }

    if (action === 'routes') {
      if (!routesCache || routesCache.exp <= Date.now()) {
        const j = await call('Log/getAvailableroutes', { city_id: '1' });
        routesCache = { exp: Date.now() + ROUTES_TTL, data: j?.respData ?? [] };
      }
      return json(routesCache.data);
    }

    if (action === 'route') {
      const id = p.get('id');
      if (!id) return json({ error: 'missing id' }, 400);
      const j = await call('rt/rvsearching', { route_id: id });
      return json(j?.respData?.route ?? []);
    }

    if (action === 'track') {
      const route = p.get('route'), veh = p.get('veh');
      if (!route || !veh) return json({ error: 'missing route or veh' }, 400);
      const j = await call('rt/bstrack', { route_number: route, vehicle_number: veh, order_id: '' });
      return json(j?.respData ?? null);
    }

    if (action === 'stop') {
      const code = p.get('code');
      if (!code) return json({ error: 'missing code' }, 400);
      const j = await call('log/vehnearstop', { bus_stop_cd: code, ver_nm: '1.5.1', ver_cd: '30' });
      return json(j?.respData ?? []);
    }

    if (action === 'between') {
      const from = p.get('from'), to = p.get('to');
      if (!from || !to) return json({ error: 'missing from or to' }, 400);
      const j = await call('log/vehfromtostop', { from_bus_stop_id: from, to_bus_stop_id: to });
      return json(j?.respData ?? []);
    }

    return json({ error: 'unknown action' }, 400);
  } catch (err) {
    dlog(`ERROR ${action}: ${err.message}`);
    return json({ error: err.message || 'upstream failure' }, err.status || 502);
  }
}
