# BMTC Live

Pick where you're going in Bengaluru and see every BMTC bus that gets you there, moving live on a map, with an ETA to your boarding stop.

Live at https://bmtc-live.pages.dev

## How it works

- `public/index.html`: the whole frontend (Leaflet with OpenFreeMap dark tiles). Place search uses Photon (OSM).
- `functions/api/plan.js`: Cloudflare Pages Function that proxies Chalo's trip planner and adds stop lists for each route.
- Live bus positions and ETAs come straight from Chalo's realtime Socket.IO (v2) feed in the browser:
  - `routes:<routeId>` gives the position, bearing and next stop of every bus on the route.
  - `etas:<stopId>:<routeId>` gives the seconds until each bus reaches the stop (`-1` means it has passed).

The BMTC/Chalo API used here is unofficial and undocumented, so it can change or break at any time.

## Run locally

```
node server.js   # http://localhost:3000
```

## Deploy

```
npx wrangler pages deploy public --project-name bmtc-live --branch main
```
