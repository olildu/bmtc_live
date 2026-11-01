# AGENTS.md

BMTC Live: a website where you pick a destination in Bengaluru and see every BMTC bus that gets you there, moving live on a map, with an ETA to your boarding stop. It runs on Chalo's **unofficial** backend, the same one the official BMTC 2.0 app uses.

Live: https://bmtc.olildu.dpdns.org (self-hosted on oci-arm, Docker). The old Cloudflare Pages project `bmtc-live` was deleted on 2026-10-26; don't redeploy there.

## Layout

| Path | What |
|---|---|
| `public/index.html` | The whole frontend in one file: HTML, CSS and JS. Leaflet, with MapLibre rendering OpenFreeMap's `dark` vector style. Socket.IO v2 client from jsDelivr. |
| `functions/api/plan.js` | `GET /api/plan?flat&flon&tlat&tlon`. Calls Chalo's trip planner from your point and from nearby stops, and returns `{journeys: [{legs: walk/bus/metro, totalTime, fare, night?}], stops: {routeId: [...]}, night}`. Metro legs are kept. |
| `functions/api/tometro.js` | `GET /api/tometro?flat&flon&st=lat,lon,id;…` returns direct buses from stops near you to stops beside up to 3 metro stations the page chose (`routesbetweenstops`, about 34 subrequests). Used for bus → metro journeys. |
| `functions/api/route.js` | `GET /api/route?q=<route number>` searches routes (both directions). `GET /api/route?id=<routeId>` returns `{name, from, to, tags, polyline, stops[]}`. Used by the "Track a route" tab. |
| `functions/api/nearby.js` | `GET /api/nearby?lat&lon` returns the routes that board within 1.5 km, with headsign and boarding stop. Chalo has no working buses-near-a-point call for BMTC, so it unions two sources for both directions: `routesbetweenstops` over pairs of your nearby stops (catches routes threading through in either direction) and trip-planning to 16 hubs (catches routes serving a single nearby stop). Used by the "Nearby" tab. |
| `scripts/metro.py` | Builds `public/metro.json` (Namma Metro lines, stations, scheduled trips, fares) from the unofficial [Vonter/bmrcl-gtfs](https://github.com/Vonter/bmrcl-gtfs) feed (ODbL; attribution is on the map). Standard library only. |
| `public/metro.json` | Generated, about 57 KB. Times are **scheduled**, not live: Chalo has the metro lines but no live or timetable data. Each line also carries an encoded `shape` and per-direction station `offsets`/`trips`, which the page uses to **schedule-simulate** moving trains (see below). |
| `functions/api/group.js` | `GET /api/group?p=<board>><alight>,…` returns, for up to 30 stop pairs, every route ID that runs from the first stop to the second (`routesbetweenstops`). Plan trip and Track route use it to group a route's duplicate and variant IDs. |
| `functions/api/direct.js` | `GET /api/direct?flat&flon&tlat&tlon` returns direct routes between up to 6 distinctly named stops near each end (`routesbetweenstops`, 38 subrequests). Used in night mode only. |
| `scripts/fare_check.py` | Rapido fare estimator and accuracy checker (standard library). Estimates are a formula over OSRM road distance and time; `add` records real app quotes, `report` shows the error and `fit` tunes the formula into `scripts/fare_params.json`. It never calls Rapido: their fare API is signed against outside use. |
| `server.js` | Node server (local dev and the Docker image). Serves `public/`, `/api/*` (same Function code) and `/healthz`. No dependencies. Needs **Node 22** (it `import()`s the ESM Functions from CommonJS). |
| `Dockerfile`, `.github/workflows/release.yml`, `deploy/docker-compose.prod.yml` | Self-hosting on oci-arm; see "Self-hosting" below. |
| `reverse-engineering/FINDINGS.md` | **Read this before touching anything API-related.** Every endpoint, header, param quirk and socket protocol detail, plus what failed. |
| `reverse-engineering/apk/` | The original split APK pulled from a phone. |
| `reverse-engineering/decompiled/` | jadx output (Chalo's own packages). |

## How the app works

1. **Place search:** the user picks a destination with Photon geocoding (`photon.komoot.io`, biased to Bengaluru) or by clicking the map. The start is the browser's GPS (`watchPosition`, blue dot with an accuracy circle), a typed place, or a shift+click.
2. **Planning:** `/api/plan` returns the bus routes connecting the two points, with direct routes first. From the exact point the planner often returns only trips with transfers, so the Function also plans from up to 8 nearby stops around the start and to 4 around the destination. That turns up direct buses a short walk away. Each route carries walk minutes (straight line ×1.3 at 80 m/min), and the page filters by "Walk up to" (25 min by default).
3. **Live data:** the browser opens Chalo's socket directly (`crtslb.chalo.com`, path `/products/live/partitions/0`). It subscribes to `routes:<routeId>` for positions and `etas:<boardStopId>:<routeId>` for ETAs to the boarding stop.
4. **Drawing:** the map shows only the ridden segment (boarding stop to alighting stop) plus dashed walking legs. A bus is "passed" when its ETA is `-1` or its next stop is beyond the boarding stop in the route's stop sequence. Passed buses are hidden by default.

## Plan trip: the journey engine

Plan trip ranks every way to get there by **live arrival time**. `plan()` calls `/api/plan`, `/api/direct` and `/api/tometro` (stations picked in the browser by `boardingStations()`) in parallel. `buildOptions()` turns everything into legs:
- **one bus**
- **bus + metro**
- **metro**: walk to a station within 1.5 km
- **two buses**: behind the "2 buses" toggle

`prune()` keeps the best per kind (`KEEP`), and `computeForks()` adds a "get off at the metro station" branch to direct buses that pass a station at least 1.5 km from you.

**Route groups (duplicate IDs):** Chalo has several route IDs for one route (stale duplicates, depot and short-run variants such as `500-D HBLB-BTM`) and puts live buses on any of them, not necessarily the ID the planner returned. Compared against BMTC's own portal (2026-11-01), the planner's ID alone missed about half of a route's live buses. So, like BMTC's site, which shows every variant of a route number together, `plan()` asks `/api/group` for every ID running each ride's boarding → drop-off stops and keeps those with the same route number (`routeNo()`, the name before the first space) as the leg's `group`. `connectTrip()` subscribes to all of them, `catchBus()` takes a bus from any ID in the group (ETA keys use the bus's own route ID, `v.routeId`), and `dedupeOptions()` drops options that became the same ride. Duplicates share stop IDs, so the stop pair check works across them.

`scoreLegs()` works out the arrival:
- **Walking:** straight-line distance × 1.3 at 80 m/min.
- **Bus legs:** use `catchBus()`, the first live bus whose ETA at your stop is at least your walk time. The ride lasts until **that same bus's live ETA at your drop-off stop**: `etas:<dropStop>:<route>` reports each vehicle far down the route. If that's missing, it falls back to the planner's travel time or stop distances at 15 km/h.
- **Metro legs:** use `scheduleMetro()` (paths with ≤ 2 interchanges, next scheduled train after a 3 min station entry, 4 min per change). No train within the hour means service has ended.

Sorting: Fastest (metro wins ties within 3 min), Least walking or Cheapest (`saved.prefs`). After 6 s of live data, options with no catchable bus collapse.

The UI is a "Best way" hero card, then groups, a fork row, and an expanded step list with 🔔 / Track this bus. The map draws each leg (bus along its stops, metro in its line colour, dashed walks).

## Track a route

The second tab searches a route number, draws the whole route along its road shape (decoded from `polyline`) with every stop, and shows each live bus from `routes:<routeId>`. Tapping a bus follows it: the map pans with it until the user drags, and the sidebar lists its upcoming stops. ETAs come from `etas:<stopId>:<routeId>` for its next 10 stops, re-subscribed as it moves. The ETA and position feeds share vehicle keys. `#route=<routeId>` in the URL opens a route directly. Both tabs share `liveSocket()`. Like Plan trip, a route shows the buses of its whole **group**: `loadTrackGroup()` asks `/api/group` for every ID of the same route number running along three stretches of the route (first half, second half, middle) in this direction, subscribes to them, and shows a bus from another ID while its next stop is on this route, labelled with its variant name (e.g. `500-D HBLB-BTM`). Your-stop ETAs and alerts cover every ID in the group (`a.routeIds`). This replaced the old "no buses after 6 s → switch to a sibling ID" fallback.

## Nearby and your location

The page watches GPS from load in every tab, and the map has a "my location" button. The Nearby tab calls `/api/nearby` with your position, subscribes to `routes:` and `etas:<stop>:<route>` for every route found, and shows buses within the chosen radius (500 m, 1 km or 2 km) sorted by distance. It reloads if you move 400 m, and reuses the last route lookup for 5 minutes. Tapping a bus stays in Nearby: it draws that bus's route, fades the other buses, and lists its upcoming stops with ETAs. Your nearby stop is marked. "← All nearby buses" or tapping the map goes back. "Open in Track route" is optional. In Track route, the stop nearest to you is marked "your stop", with walk time and the next bus's ETA.

**Live metro trains (schedule-sim):** there is no public live BMRCL feed (confirmed by reverse-engineering Where Is My Train — its live metro is a gated Google gRPC API, `wimt-pa.googleapis.com`, fed by crowdsourced telemetry; not consumable). So the page simulates train positions from `metro.json` (offsets + trips advanced against the IST clock, interpolated along each line's `shape`) and draws them as **MapLibre GL layers** on the basemap — each train is a short, thick segment of the line itself, so it stays locked to the track and scales with zoom (`setMetroView(lineSet, faint)` in `public/index.html`; the GL map comes from the leaflet-maplibre-gl layer's `getMaplibreMap()`). Nearby shows all lines at full strength; Plan trip shows only the line(s) a journey uses, dimmed. Nearby also shows a BMRCL daily-ridership factoid (open data from thecont1/namma-metro-ridership-tracker, 0BSD, cached 3 h): the latest day's total vs the median of the same weekday.

## Alerts, saved places, metro and stop view

- **Alerts** (`alerts` in the page): "Notify me" on trip cards, Track route's followed bus and your stop, Nearby buses and stop-view rows. Live alerts open their **own** socket for `etas:<stop>:<route>`, so they survive tab switches. They fire within N min (2, 5 or 10, set in the 🔔 pill) with a toast, vibration, beep and Notification. Metro "Remind me" uses a timer against the scheduled time. The page must stay open; there's no push backend.
- **Saved** (`localStorage['bmtc.saved']`): place chips under "To" and favourite routes (☆ in Track route; listed when the Track tab is empty).
- **Nearby back stack** (`near.stack`): tapping opens a bus (route + next stops), a stop (everything arriving, via `/api/nearby?r=300`), a metro station (next scheduled trains each way) or a metro train (scheduled timeline with fares). "← Back" pops one level, and tapping the map clears it. `syncNearRefs()` diffs the socket subscriptions against what the open views need.
- **Fares**: `plan.js` adds `fare` (per bus leg) and `totalFare` from the planner's `fares[].leg_index`.
- **Service type**: `serviceTags()` maps Chalo tags (Vajra → AC, Vayu Vajra → AC · Airport, Ordinary → Non-AC, `MF-` → Metro feeder). BMTC sends **no crowding/occupancy data**.

## Night mode

Late at night the planner has little or nothing for "now". When the normal pass finds fewer than 5 routes, `/api/plan` runs a second pass planned for tomorrow 09:00 (`istTomorrow9()`) and marks routes found only that way `night: true`. It keeps at most 20 routes, to keep a night plan to about 48 upstream calls (a budget left over from Cloudflare's 50-subrequest limit; still worth keeping to go easy on Chalo). The page then:
- adds `/api/direct` routes
- shows a 🌙 banner
- once the live snapshot has had 6 s, lists routes with a bus coming to the boarding stop first and collapses night routes with nothing running behind "N more routes… show"
- warns on transfers whose connecting route (`connects`) has no live bus

`/api/nearby` does the same second pass (32 subrequests).

## Self-hosting (oci-arm)

Same pattern as linkup-backend on the same box:
- **CI:** pushing a tag `v*.*.*` runs `.github/workflows/release.yml`. It builds `linux/amd64,linux/arm64` with QEMU and pushes `ghcr.io/olildu/bmtc-live:<tag>` and `:latest` with `GITHUB_TOKEN`. Pushes to main don't deploy. The GHCR package must stay **public** (the server has no GHCR login).
- **CD:** on oci-arm, `~/dev/bmtc-live/docker-compose.prod.yml` (a copy of `deploy/docker-compose.prod.yml`) runs the image on host port **8010** with the Watchtower label. linkup's Watchtower (`linkup-backend-watchtower-1`, `--label-enable --interval 60`) pulls new `:latest` images and recreates the container. Docker needs `sudo` there.
- **Ingress:** the Cloudflare Tunnel in `/etc/cloudflared/config.yml` maps `bmtc.olildu.dpdns.org → http://localhost:8010`. It's shared with linkup, finance-dashboard, route-26 and cogni-anchor, so back it up and run `cloudflared tunnel ingress validate` before restarting.
- **Release:** `git tag v1.2.3 && git push origin v1.2.3`, then check `curl https://bmtc.olildu.dpdns.org/healthz` shows the new version within about 2 minutes. **Roll back:** pin `image: ghcr.io/olildu/bmtc-live:v1.2.2` in the server compose file and run `sudo docker compose -f docker-compose.prod.yml up -d`.

## Commands

```
node server.js                                                          # local, http://localhost:3000
python3 scripts/fare_check.py estimate "Koramangala" "MG Road"          # Rapido fare estimate (add / report / fit to check accuracy)
python3 scripts/metro.py                                                # refresh public/metro.json from the metro GTFS
git tag v1.2.3 && git push origin v1.2.3                                # release to oci-arm (bmtc.olildu.dpdns.org)
```

There are no tests or build step. To check page JS syntax:
`awk '/<script>$/{f=1;next}/<\/script>/{f=0}f' public/index.html > /tmp/p.js && node --check /tmp/p.js`

## Gotchas (each cost time once)

- **Socket.IO must be v2** (`socket.io-client@2.5.0`). Subscribe payloads must be **JSON strings**. The snapshot message has string payloads and deltas have object payloads.
- The trip planner needs **`mode=transit`** and an **upper-case city** (`BENGALURU`). `start_time` is seconds since midnight **IST**, and `day` is `sun`…`sat`.
- Chalo's CDN returned **403 to Cloudflare Workers without a `user-agent`**. Keep `user-agent: Ktor client` in `plan.js`.
- ETAs are in **seconds**.
- The page script runs as a classic script, so a top-level `let`/`const`/`class` must **not** be named after a protected browser global (`top`, `window`, `document`, `location`). It throws "redeclaration of non-configurable global property" and nothing loads. `node --check` and jsdom don't catch this; a real browser does.
- Upstream call budgets per request (plan ≤ ~48, direct 38, tometro 34) come from the old Cloudflare 50-subrequest limit. The Node server has no such limit, but keep them: fewer calls means less chance of Chalo blocking the server's IP.
- **Every Chalo call is cached in memory** by `getJson()` in `plan.js`: `routedetails`, `search` and `routesbetweenstops` for 6 h, `nearby/stops` for 24 h, `tripplanner` for 10 min (its start time is rounded to the minute so repeats hit). Identical calls in flight share one request, errors aren't cached, and it's capped at 50 MB. `/healthz` shows `cache: {entries, mb, hits, misses}`. A restart (each release) empties it. Chalo calls made any other way bypass it.
- CARTO basemaps now need an API key, so don't switch back to them. OpenFreeMap needs no key.
- The repo's code and commits must **not** mention Claude or AI, and must not include co-author trailers.

## Product preferences (from the owner)

- **Dark theme only**, styled like Google Maps.
- Show only what matters: the ride segment, the user's walk, and buses that are still coming. Don't show full routes.
- Speed over ceremony. Small, direct changes in the existing single-file style.

## Open work

- **Destination-only mode** (every route serving the destination stop, from anywhere) needs a stop-to-routes endpoint. See "What did NOT work" in `FINDINGS.md` for candidates.
- **Transfers:** routes needing a transfer show as separate legs, not one planned journey.
- **Recovering from blocks:** if Chalo blocks the oci-arm IP, try other headers first, then a different host (oci-amd is free).

## Regenerating the decompiled code

```
jadx -d decompiled --no-res -j 8 reverse-engineering/apk/base.apk
```
The repo keeps only Chalo's own packages (`app/`, `chalo_app_kmm/`, `com/bmtc/`, `defpackage/`). Third-party libraries (androidx, kotlin, okhttp, etc.) are left out. Re-run jadx if you need them.
