#!/usr/bin/env python3
"""Build data/timetable.json.gz (BMTC's published bus timetable) from the unofficial Vonter/bmtc-gtfs feed.

    python3 scripts/bmtc_timetable.py              # download the latest feed
    python3 scripts/bmtc_timetable.py bmtc.zip     # or use a local copy

The feed (ODbL, https://github.com/Vonter/bmtc-gtfs) is scraped from the Namma BMTC app, refreshed about every two
months. Its times are BMTC's schedule, not live: on 2026-10-31 about 80% of running 500-D buses started at a listed
time (93% within 5 min), but late-night city trips are often listed and not run. Test routes are dropped.
The feed lists about 120 of the day's last trips (18:00–24:00) with only their first stop; each is attached to the
usual stop pattern of its route and direction from that stop, with that pattern's most common timings.

Output (compact JSON, gzipped; served by functions/api/timetable.js, never sent to the page whole):
  version   feed version (yyyymmdd)
  stops     [[name, lat, lon], ...]                       referenced by index
  services  one per stop pattern of a route direction:
            {n: route name, d: direction 0/1, h: headsign, s: [stop index, ...],
             o: [[minutes after the first stop, per stop], ...]   distinct timing profiles
             t: [[start minute at the first stop, profile index], ...]}   minutes may pass 1440 (after midnight)
Standard library only.
"""
import collections, csv, gzip, io, json, os, sys, urllib.request, zipfile

URL = 'https://github.com/Vonter/bmtc-gtfs/raw/refs/heads/main/gtfs/bmtc.zip'
OUT = os.path.join(os.path.dirname(__file__), '..', 'data', 'timetable.json.gz')


def rows(z, name):
    with z.open(name) as f:
        yield from csv.DictReader(io.TextIOWrapper(f, encoding='utf-8-sig'))


def secs(t):
    h, m, s = t.split(':')
    return int(h) * 3600 + int(m) * 60 + int(s)


def main():
    src = sys.argv[1] if len(sys.argv) > 1 else None
    if not src:
        print('downloading', URL)
        data = urllib.request.urlopen(URL, timeout=120).read()
        z = zipfile.ZipFile(io.BytesIO(data))
    else:
        z = zipfile.ZipFile(src)
    version = next(rows(z, 'feed_info.txt'))['feed_version']
    routes = {r['route_id']: r for r in rows(z, 'routes.txt')
              if 'test' not in (r['route_short_name'] + r['route_long_name']).lower()}
    trips = {t['trip_id']: t for t in rows(z, 'trips.txt') if t['route_id'] in routes}
    seqs = collections.defaultdict(list)
    for st in rows(z, 'stop_times.txt'):
        if st['trip_id'] in trips:
            seqs[st['trip_id']].append((int(st['stop_sequence']), st['stop_id'], secs(st['departure_time'])))
    stop_rows = {s['stop_id']: s for s in rows(z, 'stops.txt')}

    stop_idx, stops = {}, []
    def stop(sid):
        if sid not in stop_idx:
            s = stop_rows[sid]
            stop_idx[sid] = len(stops)
            stops.append([s['stop_name'], round(float(s['stop_lat']), 5), round(float(s['stop_lon']), 5)])
        return stop_idx[sid]

    pats, single = {}, []
    for tid, seq in seqs.items():
        if len(seq) < 2:
            single.append(tid)
            continue
        seq.sort()
        t = trips[tid]
        key = (t['route_id'], t['direction_id'], tuple(s for _, s, _ in seq))
        p = pats.get(key)
        if not p:
            p = pats[key] = {'n': routes[t['route_id']]['route_short_name'], 'd': int(t['direction_id'] or 0),
                             'h': collections.Counter(), 's': [stop(s) for _, s, _ in seq], 'o': {}, 't': [], 'oc': collections.Counter()}
        p['h'][t['trip_headsign']] += 1
        start = seq[0][2]
        offs = tuple(round((x - start) / 60) for _, _, x in seq)
        prof = p['o'].setdefault(offs, len(p['o']))
        p['t'].append([start // 60, prof])
        p['oc'][prof] += 1

    # trips listed with only their first stop: the busiest pattern of the same route and direction starting there
    attached = 0
    for tid in single:
        t, (_, sid, start) = trips[tid], seqs[tid][0]
        cands = [(k, p) for k, p in pats.items() if k[0] == t['route_id'] and k[1] == t['direction_id'] and k[2][0] == sid]
        if not cands:
            continue
        p = max(cands, key=lambda kp: len(kp[1]['t']))[1]
        p['t'].append([start // 60, p['oc'].most_common(1)[0][0]])
        attached += 1

    services = []
    for p in pats.values():
        services.append({'n': p['n'], 'd': p['d'], 'h': p['h'].most_common(1)[0][0], 's': p['s'],
                         'o': [list(o) for o, _ in sorted(p['o'].items(), key=lambda kv: kv[1])],
                         't': sorted(p['t'])})
    services.sort(key=lambda x: (x['n'], x['d'], -len(x['t'])))
    out = {'version': version, 'stops': stops, 'services': services}
    os.makedirs(os.path.dirname(OUT), exist_ok=True)
    raw = json.dumps(out, separators=(',', ':'), ensure_ascii=False).encode()
    with gzip.open(OUT, 'wb', compresslevel=9) as f:
        f.write(raw)
    print(f'{attached} of {len(single)} first-stop-only trips attached to their route\'s pattern')
    print(f'feed {version}: {len(routes)} routes, {sum(len(s["t"]) for s in services)} trips, {len(services)} stop patterns, '
          f'{len(stops)} stops → {os.path.relpath(OUT)} ({len(raw) / 1e6:.1f} MB JSON, {os.path.getsize(OUT) / 1e6:.2f} MB gzipped)')


if __name__ == '__main__':
    main()
