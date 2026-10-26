// API handler (served by server.js): GET /api/walk?flat=&flon=&tlat=&tlon=
// A walking route between two points, so the map shows the real footpath instead of a straight line.
// Uses the OSM community OSRM foot router. Returns { polyline (Google-encoded, precision 5), distance }.
const OSRM = 'https://routing.openstreetmap.de/routed-foot/route/v1/foot';

export async function onRequestGet({ request }) {
  const q = new URL(request.url).searchParams;
  const [a, b, c, d] = ['flat', 'flon', 'tlat', 'tlon'].map(k => parseFloat(q.get(k)));
  if (![a, b, c, d].every(isFinite)) return Response.json({ error: 'missing coords' }, { status: 400 });
  try {
    const r = await fetch(`${OSRM}/${b},${a};${d},${c}?overview=full&geometries=polyline`,
      { headers: { 'user-agent': 'bmtc-live' }, signal: AbortSignal.timeout(8000) });
    if (!r.ok) throw new Error(r.status);
    const j = await r.json();
    const rt = j.routes?.[0];
    return Response.json({ polyline: rt?.geometry || '', distance: rt?.distance ?? null },
      { headers: { 'cache-control': 'public, max-age=86400' } });
  } catch (e) {
    return Response.json({ error: String(e.message || e) }, { status: 502 });
  }
}
