#!/usr/bin/env python3
"""Build public/metro.json (Namma Metro lines, stations, scheduled trips, fares) from the unofficial
Vonter/bmrcl-gtfs feed. Standard library only. Run from the repo root: python3 scripts/metro.py

The feed is ODbL (BMRCL timetables + OpenStreetMap). Intermediate-station times are estimates (about 2 min),
so the site labels every metro time as "scheduled".

Output format (compact, read by public/index.html):
  lines[LINE]   = {name, color, stations: [[id, name, lat, lon], ...] in direction-0 order, shape: encoded polyline}
  offsets[LINE] = [dir0 seconds from first station, dir1 ...]  (dir1 runs the station list in reverse)
  trips[service][LINE] = [dir0 trips, dir1 trips], each trip [startIdx, endIdx, departSecs] in that
                  direction's order; time at station j = departSecs + offsets[j] - offsets[startIdx]
  calendar      = {dow: service for Mon..Sun, holidays: [YYYYMMDD, ...]}
  fares         = {stations: [ids], prices: [..], m: one char per station pair, index into prices ('.' = none)}
"""
import csv, io, json, os, sys, urllib.request, zipfile
from collections import defaultdict

URL = 'https://raw.githubusercontent.com/Vonter/bmrcl-gtfs/main/gtfs/bmrcl.zip'
OUT = os.path.join(os.path.dirname(__file__), '..', 'public', 'metro.json')


def secs(t):
    h, m, s = map(int, t.split(':'))
    return h * 3600 + m * 60 + s


def encode(points):
    """Google encoded polyline, 5 decimal places (same as Chalo's, so the page reuses decodePoly)."""
    out, plat, plon = [], 0, 0
    for lat, lon in points:
        ilat, ilon = round(lat * 1e5), round(lon * 1e5)
        for d in (ilat - plat, ilon - plon):
            v = ~(d << 1) if d < 0 else d << 1
            while v >= 0x20:
                out.append(chr((0x20 | (v & 0x1f)) + 63))
                v >>= 5
            out.append(chr(v + 63))
        plat, plon = ilat, ilon
    return ''.join(out)


def main():
    z = zipfile.ZipFile(io.BytesIO(urllib.request.urlopen(URL, timeout=60).read()))
    rows = lambda name: list(csv.DictReader(io.TextIOWrapper(z.open(name), 'utf-8-sig')))

    stops = {r['stop_id']: r for r in rows('stops.txt')}
    station = lambda sid: stops[sid]['parent_station'] or sid
    routes = {r['route_id']: r for r in rows('routes.txt')}
    trips = {r['trip_id']: r for r in rows('trips.txt')}
    times = defaultdict(list)
    for r in rows('stop_times.txt'):
        times[r['trip_id']].append(r)
    for t in times.values():
        t.sort(key=lambda r: int(r['stop_sequence']))

    shapes = defaultdict(list)
    for r in rows('shapes.txt'):
        shapes[r['shape_id']].append((int(r['shape_pt_sequence']), float(r['shape_pt_lat']), float(r['shape_pt_lon'])))

    out = {'attribution': 'Metro timetable: BMRCL via Vonter/bmrcl-gtfs (ODbL). Scheduled times, not live.',
           'lines': {}, 'offsets': {}, 'trips': {}}

    for line, route in routes.items():
        by_dir = {d: [tid for tid, t in trips.items() if t['route_id'] == line and t['direction_id'] == d] for d in '01'}
        longest = {d: max(by_dir[d], key=lambda tid: len(times[tid])) for d in '01'}
        seq = {d: [station(r['stop_id']) for r in times[longest[d]]] for d in '01'}
        if seq['1'] != seq['0'][::-1]:
            sys.exit(f'{line}: direction 1 is not direction 0 reversed')
        out['lines'][line] = {
            'name': route['route_short_name'],
            'color': '#' + route['route_color'],
            'stations': [[s, stops[s]['stop_name'], float(stops[s]['stop_lat']), float(stops[s]['stop_lon'])] for s in seq['0']],
            'shape': encode([(lat, lon) for _, lat, lon in sorted(shapes[trips[longest['0']]['shape_id']])]),
        }
        offs = []
        for d in '01':
            t = times[longest[d]]
            t0 = secs(t[0]['departure_time'])
            offs.append([secs(r['departure_time']) - t0 for r in t])
        out['offsets'][line] = offs
        for d in '01':
            pos = {s: i for i, s in enumerate(seq[d])}
            for tid in by_dir[d]:
                t = times[tid]
                a, b = pos[station(t[0]['stop_id'])], pos[station(t[-1]['stop_id'])]
                svc = trips[tid]['service_id']
                lst = out['trips'].setdefault(svc, {}).setdefault(line, [[], []])[int(d)]
                lst.append([a, b, secs(t[0]['departure_time'])])
    for svc in out['trips'].values():
        for pair in svc.values():
            for lst in pair:
                lst.sort(key=lambda x: x[2])

    days = ['monday', 'tuesday', 'wednesday', 'thursday', 'friday', 'saturday', 'sunday']
    dow = [None] * 7
    for r in rows('calendar.txt'):
        for i, d in enumerate(days):
            if r[d] == '1':
                dow[i] = r['service_id']
    holidays = sorted({r['date'] for r in rows('calendar_dates.txt') if r['service_id'] == 'holiday' and r['exception_type'] == '1'})
    out['calendar'] = {'dow': dow, 'holidays': holidays}

    price = {r['fare_id']: int(float(r['price'])) for r in rows('fare_attributes.txt')}
    ids = sorted({s[0] for l in out['lines'].values() for s in l['stations']})
    prices = sorted(set(price.values()))
    idx = {s: i for i, s in enumerate(ids)}
    m = ['.'] * (len(ids) ** 2)
    for r in rows('fare_rules.txt'):
        a, b = idx.get(r['origin_id']), idx.get(r['destination_id'])
        if a is not None and b is not None:
            m[a * len(ids) + b] = str(prices.index(price[r['fare_id']]))
    out['fares'] = {'stations': ids, 'prices': prices, 'm': ''.join(m)}

    with open(OUT, 'w') as f:
        json.dump(out, f, separators=(',', ':'), ensure_ascii=False)
    n = sum(len(x) for svc in out['trips'].values() for pair in svc.values() for x in pair)
    print(f'wrote {OUT}: {os.path.getsize(OUT) // 1024} KB, {len(out["lines"])} lines, {len(ids)} stations, {n} trips')


if __name__ == '__main__':
    main()
