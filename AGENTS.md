# AGENTS.md

BMTC Live: a website where you pick a destination in Bengaluru and see every BMTC bus that gets you there, moving live on a map, with an ETA to your boarding stop. It runs on Chalo's **unofficial** backend, the same one the official BMTC 2.0 app uses.

Live: https://bmtc-live.pages.dev (Cloudflare Pages project `bmtc-live`).

## Layout

| Path | What |
|---|---|
| `public/index.html` | The whole frontend in one file: HTML, CSS and JS. Leaflet, with MapLibre rendering OpenFreeMap's `dark` vector style. Socket.IO v2 client from jsDelivr. |
| `functions/api/plan.js` | Cloudflare Pages Function, `GET /api/plan?flat&flon&tlat&tlon`. Calls Chalo's trip planner, keeps the bus legs, adds each route's stop list, and returns `[{routeId, name, direct, board, alight, stops[], travelTime, tags}]`. |
| `server.js` | Local dev server. Serves `public/` and runs the same `plan.js`. No dependencies. |
| `reverse-engineering/FINDINGS.md` | **Read this before touching anything API-related.** Every endpoint, header, param quirk and socket protocol detail, plus what failed. |
| `reverse-engineering/apk/` | The original split APK pulled from a phone. |
| `reverse-engineering/decompiled/` | jadx output (Chalo's own packages). |

## How the app works

1. **Place search:** the user picks a destination with Photon geocoding (`photon.komoot.io`, biased to Bengaluru) or by clicking the map. The start is the browser's GPS (`watchPosition`, blue dot with an accuracy circle), a typed place, or a shift+click.
2. **Planning:** `/api/plan` returns the bus routes connecting the two points, with direct routes first.
3. **Live data:** the browser opens Chalo's socket directly (`crtslb.chalo.com`, path `/products/live/partitions/0`). It subscribes to `routes:<routeId>` for positions and `etas:<boardStopId>:<routeId>` for ETAs to the boarding stop.
4. **Drawing:** the map shows only the ridden segment (boarding stop to alighting stop) plus dashed walking legs. A bus is "passed" when its ETA is `-1` or its next stop is beyond the boarding stop in the route's stop sequence. Passed buses are hidden by default.

## Commands

```
node server.js                                                          # local, http://localhost:3000
npx wrangler pages deploy public --project-name bmtc-live --branch main # deploy (wrangler picks up functions/)
```

There are no tests or build step. To check page JS syntax:
`awk '/<script>$/{f=1;next}/<\/script>/{f=0}f' public/index.html > /tmp/p.js && node --check /tmp/p.js`

## Gotchas (each cost time once)

- **Socket.IO must be v2** (`socket.io-client@2.5.0`). Subscribe payloads must be **JSON strings**. The snapshot message has string payloads and deltas have object payloads.
- The trip planner needs **`mode=transit`** and an **upper-case city** (`BENGALURU`). `start_time` is seconds since midnight **IST**, and `day` is `sun`…`sat`.
- Chalo's CDN returns **403 to Cloudflare Workers without a `user-agent`**. Keep `user-agent: Ktor client` in `plan.js`.
- ETAs are in **seconds**.
- CARTO basemaps now need an API key, so don't switch back to them. OpenFreeMap needs no key.
- The repo's code and commits must **not** mention Claude or AI, and must not include co-author trailers.

## Product preferences (from the owner)

- **Dark theme only**, styled like Google Maps.
- Show only what matters: the ride segment, the user's walk, and buses that are still coming. Don't show full routes.
- Speed over ceremony. Small, direct changes in the existing single-file style.

## Open work

- **Destination-only mode** (every route serving the destination stop, from anywhere) needs a stop-to-routes endpoint. See "What did NOT work" in `FINDINGS.md` for candidates.
- **Transfers:** routes needing a transfer show as separate legs, not one planned journey.
- **No caching:** `routedetails` responses aren't cached in the Function (they could go in KV or the Cache API).
- **Recovering from blocks:** if Chalo blocks Cloudflare IPs again, try other headers first, then a different host for the proxy.

## Regenerating the decompiled code

```
jadx -d decompiled --no-res -j 8 reverse-engineering/apk/base.apk
```
The repo keeps only Chalo's own packages (`app/`, `chalo_app_kmm/`, `com/bmtc/`, `defpackage/`). Third-party libraries (androidx, kotlin, okhttp, etc.) are left out. Re-run jadx if you need them.
