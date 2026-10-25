# BMTC 2.0 app: reverse-engineering findings

Source: the official BMTC 2.0 Android app (`com.bmtc.bmtcavls.two`, versionName 1.0.1), pulled from a phone with `adb` as a split APK (`apk/`). Decompiled with jadx 1.5.6 (`jadx -d decompiled --no-res -j 8 apk/base.apk`).

The app is a white-label build of **Chalo**'s Kotlin Multiplatform app (flavor `androidApp_bmtcPrimaryRelease`, packages `app.chalo.*` and `chalo_app_kmm.*`). It talks to Chalo's backend, not a BMTC server. Nothing below needs a login.

Everything here is **unofficial and undocumented**. It worked on 2026-10-22 and can change without notice.

## Hosts

Built in `app/chalo/providers/ChaloUrlProviderImpl.java` from the template `https://env.domain`:

| Purpose | Host |
|---|---|
| Main API (`env` = `production`, domain = `zophop.com` unless the city config overrides it) | `https://production.zophop.com` |
| Geo query service | `https://geoquery.zophop.com` |
| Realtime socket config | `https://production.zophop.com/configuration/crts/live/v2/cities/<city>` |
| Realtime socket | `https://crtslb.chalo.com`, path `/products/live/partitions/0` |

## Request headers

Set in `defpackage/b90.java` (Ktor `defaultRequest`):

```
source: 0
appVer: <app version code>   # any number works, e.g. 1001
deviceId: <any string>
clientId: <optional>
accept: application/json
```

Requests from Cloudflare Workers get a **403 from Chalo's CDN unless a User-Agent is set**. `user-agent: Ktor client` (what the app sends) works.

## REST endpoints that work

City casing matters: `BENGALURU` (upper) for v4 `routedetails` and v5/v6 trip planner, `bengaluru` (lower) is fine for `nearby/stops`.

### Nearby stops
`GET /scheduler_v4/v4/bengaluru/nearby/stops?lat=12.9716&lon=77.5946&transitMode=bus`
→ `[{stop_id, stop_name, stop_lat, stop_lon, station_type, distance}]`

### Trip planner (core of the website)
`GET /scheduler_v4/v5/BENGALURU/tripplanner`
| param | value |
|---|---|
| `from_lat`, `from_lon`, `to_lat`, `to_lon` | coordinates |
| `mode` | **`transit`** (`bus`, `BUS`, `all`, `default` all return `Invalid travel mode`) |
| `start_time` | seconds since midnight, IST |
| `day` | `sun`…`sat` |
| `startTimeMillis` | epoch ms |

→ `payload.itineraries[].legs[]`. A leg with `mode: "BUS"` has `route_id`, `trip_id`, `first_stop` and `last_stop` (each with `stop_id`, `stop_name`, `stop_lat`, `stop_lon`), `travel_time` (s), `displayTags` (e.g. `Vajra`, `Ordinary`) and `polyline`. Walk legs have `mode: "WALK"`.

### Route details
`GET /scheduler_v4/v4/BENGALURU/routedetails?route_id=3xUwYVHP&day=thu`
→ `route.{route_id, serviceCategory, last_stop, stopSequenceWithDetails[]}`. Stops are in travel order, each with `stop_id`, `stop_name`, `stop_lat` and `stop_lon`.

### Search (routes, stops and places by text)
`GET /scheduler_v4/v4/BENGALURU/search?str=500D&day=sun` (both params required)
→ `{routes[], stops[], places[], trips[]}`. Each route has `route_id`, `route_name`, `first_stop_name`, `last_stop_name`, `spf` (service tags) and `match_ratio`. Both directions come back as separate routes with the ends swapped. A place name such as `koramangala` returns `stops[]` (`stop_id`, `stop_name`, `stop_lat`, `stop_lon`). The app builds this URL from config (the autocomplete methods didn't decompile), so it was found by probing: `/search` answered "Missing required request parameter: str", then "day". The v5 variant also wants `location`.

`routedetails` also returns `route.polyline`, the road shape as a Google encoded polyline with 5 decimal places.

### Stop details
`POST /scheduler_v4/v4/bengaluru/stopDetails` body `{"stopIds":["wIF80cnq"]}` → name and location only (no routes).

### Realtime socket config
`GET /configuration/crts/live/v2/cities/BENGALURU`
→ socket `baseUrl`, `path`, and per-service polling and resync settings.

## Realtime (live buses and ETAs)

Code: `app/chalo/livetracking/frameworklivetracking/` (`RealTimeSocketManagerImpl$subscribe$2.java`, `data/model/RealTimeSocketRequest.java`, `RtsServiceType.java`).

- The server runs **Socket.IO v2** (EIO 3). A v3/v4 client is rejected. Use `socket.io-client@2.5.0`.
- It accepts connections from any Origin, so a browser can connect directly.
- Subscribe with `socket.emit('subscribe', JSON.stringify({ ref }))`. **The payload must be a JSON string**; a plain object gets no data. Unsubscribe uses `'unsubscribe'`.
- Data arrives on the `'message'` event as `{"ref": "...", "res": {<vehicleKey>: <payload>}}`. The first message is a snapshot where each payload is a JSON *string*. Later messages are deltas where payloads are objects. Handle both.

| ref | meaning | payload fields |
|---|---|---|
| `routes:<routeId>` | every live bus on a route | `vNo` (plate), `_latitude`, `_longitude`, `bearing`, `_isHalted`, `sId` (next stop id), `lSId` (last stop of the route), `psId`/`psTime` (previous stop and time), `eta`, `tS` (ms) |
| `etas:<stopId>:<routeId>` | every bus's ETA to that stop | `eta` (**seconds**, `-1` means already passed), `dist` (m), `vNo`, `rN` (route name, e.g. `V-335E`), `dest`, `isHalted`, `tS` |
| `etasList` | polled batch form: `{ref:'etasList', etasList:['etas:<stop>:<route>', …]}` | same as `etas` |

### Fares and service type
Each trip-planner itinerary has `total_fare` and `fares[{leg_index:[i], default_fare}]`, where `leg_index` points into `legs`. Service type comes from `displayTags` / `spf`: `Ordinary`, `Vajra` (AC) or `Vayu Vajra` (AC airport).

## Metro (Namma Metro)
Chalo has the metro lines as routes. `search?str=purple` returns `Purple line (West-East Corridor)` (`hJctbMVG`) and others with `transport_type: metro`, and `nearby/stops?transitMode=metro` returns stations. But `routedetails` says `isLive: false` with empty `trips` and `timings`, and the socket sends nothing for `routes:<metroRouteId>` or `etas:<station>:<metroRouteId>`. **There's no live metro data in Chalo.** The site uses the unofficial Vonter/bmrcl-gtfs timetable (`scripts/metro.py`) and labels times "scheduled".

## What did NOT work (and still open)

- `GET /scheduler_v4/v4/<city>/summary` (stop summary used by the stop screen) always returned `NO_TRIPS_FOR_ANY_STOPS_NEARBY` or a 500, whatever params I tried. The app sends `lat, lon, time, day, radius, cards` (from `LocationSummaryRequestDataHolder`). Seconds since midnight for `time` gives `NO_TRIPS_FOR_ANY_STOPS_NEARBY`, and epoch ms gives a 500.
- `POST https://geoquery.zophop.com/nearbybus/v2/city/BENGALURU`, body `{"metaData":{"locale":"en","appVer":"1001","userId":"x"},"requiredFields":{"nearbyBuses":{"lat":..,"lng":..,"radius":..}}}`, answers 200 with `{"buses":[]}` for any radius, even while BMTC buses are live. Its response fields (`_operatorId`, `_mode`, `_streamId`) suggest it covers Chalo's own buses only. The website's "Nearby" tab works around this with `/api/nearby`, which plans trips to the city's hubs and keeps the routes that board close by.
- `GET /scheduler_v4/v4/<city>/stops/id?mode=…` (full city stop list) returned 500 for every casing and mode combination.
- `POST /scheduler_v4/v5/<city>/routedetails` (bulk route sync, body `{meta, routeIdsToVersionMap, location:{lat,lng}}`) returned 500.
- The live vehicle payload has no occupancy or crowding fields (`vNo, _latitude, _longitude, bearing, sId, psId, psTime, lSId, eta, opId, tS`), and search results carry no `seatOccupancy` for BMTC.
- **Not found yet: "all routes that serve a given stop".** (The search endpoint above turns a place name into stop IDs, which is one half of it.) That would allow a destination-only mode (every bus going to X, from anywhere). Candidates not yet tested: `scheduler_v4/v1/{city}/routes/corridors`, `scheduler_v4/v6/{CITY}/tripplanner/bus-wise`, `scheduler_v4/v5/{CITY}/routesbetweenstops`.

## Other endpoint paths seen in the code (untested)

`scheduler_v4/v5/{CITY}/stopPairsBetweenPoints`, `scheduler_v4/v5/place/details`, `scheduler_v4/geocode/reverse?lat&lon`, `scheduler_v4/v4/cityName/stopImages`, `nearbybus/v2/city/{CITY_NAME}` (POST, on the geoquery host), `vasudha/location/<city>/<agency>/bus/<busNo>` (single bus GPS), `seat/availability`, plus ticketing, passes and payments under `mticketing/`, `payments/` and `chaukidar/` (auth).

## Where to look in the decompiled code

| Topic | Path under `decompiled/sources/` |
|---|---|
| Base URLs | `app/chalo/providers/ChaloUrlProviderImpl.java` |
| Common headers | `defpackage/b90.java`, `app/chalo/network/CommonHeaderProviderImpl.java` |
| Stops and routes REST | `app/chalo/citydata/repository/remote/CityDataRemoteDataSourceImpl.java` |
| Request body field names | `app/chalo/citydata/data/model/api/request/*$$serializer.java` (look for `.j("field")`) |
| Trip planner | `app/chalo/livetracking/tripplanner/data/remote/TripPlannerRemoteDataSourceImpl.java` |
| Realtime socket | `app/chalo/livetracking/frameworklivetracking/` |
| Transit mode enum | `app/chalo/providers/cityprovider/impl/data/models/app/ChaloTransitMode.java` |

Tip: kotlinx.serialization field names are easiest to read from the generated `$$serializer` classes. Endpoint paths are plain string literals, so `grep -rhoE '"scheduler_v4[^"]*"'` lists them.
