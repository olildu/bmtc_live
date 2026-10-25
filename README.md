# BMTC Live

Pick where you're going in Bengaluru and see every BMTC bus that gets you there, moving live on a map, with an ETA to your boarding stop.

Live at https://bmtc.olildu.dpdns.org and https://bmtc-live.pages.dev

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

## Release (self-hosted on oci-arm)

```
git tag v1.2.3 && git push origin v1.2.3
```

GitHub Actions builds the Docker image and pushes it to `ghcr.io/olildu/bmtc-live`. Watchtower on the server picks it up within about a minute. It's served at https://bmtc.olildu.dpdns.org. Check with `/healthz`.

## Deploy (Cloudflare Pages)

```
npx wrangler pages deploy public --project-name bmtc-live --branch main
```
