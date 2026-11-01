// Node server: serves public/ and the /api/* handlers in functions/api/. Used for local dev (`node server.js`)
// and in the Docker image that runs on oci-arm (the only deployment). No dependencies.
// Live bus data is fetched by the browser directly from Chalo's socket.
const http = require('http');
const fs = require('fs');
const path = require('path');
const { spawn } = require('child_process');

const PORT = process.env.PORT || 3000;
const SIGNAL_PORT = process.env.SIGNAL_PORT || 3001;
const VERSION = process.env.APP_VERSION || 'dev';
const PUBLIC = path.join(__dirname, 'public');
const TYPES = { '.html': 'text/html; charset=utf-8', '.js': 'text/javascript', '.css': 'text/css', '.json': 'application/json' };
const API = ['/api/plan', '/api/route', '/api/nearby', '/api/direct', '/api/tometro', '/api/walk', '/api/group', '/api/timetable'];
// Local builds only (release images set APP_VERSION to the tag): log every request, and accept the page's debug
// logs at POST /api/_log, written to logs/client.log.
const DEV = VERSION === 'dev';
const LOG_DIR = path.join(__dirname, 'logs');
function clientLog(req, res) {
  let body = '';
  req.on('data', c => { if ((body += c).length > 2e6) req.destroy(); });
  req.on('end', () => {
    let lines = [];
    try { lines = JSON.parse(body); } catch {}
    if (!Array.isArray(lines)) lines = [];
    fs.mkdirSync(LOG_DIR, { recursive: true });
    fs.appendFile(path.join(LOG_DIR, 'client.log'), lines.map(l => JSON.stringify(l) + '\n').join(''), () => {});
    for (const l of lines) console.log(`[page:${l.tag}] ${l.msg}`);
    res.writeHead(204); res.end();
  });
}

// spawn the Python signal sidecar (best-effort; the app works without it)
const signalScript = path.join(__dirname, 'scripts', 'signal_server.py');
let signalProc = null;
function startSignalSidecar() {
  if (!fs.existsSync(signalScript)) return;
  signalProc = spawn('python3', [signalScript], {
    env: { ...process.env, SIGNAL_PORT: String(SIGNAL_PORT) },
    stdio: ['ignore', 'inherit', 'inherit'],
  });
  signalProc.on('exit', (code) => {
    console.log(`signal sidecar exited (${code})`);
    signalProc = null;
    setTimeout(startSignalSidecar, 5000);
  });
}
startSignalSidecar();

function proxySignal(qs, res) {
  const opts = { hostname: '127.0.0.1', port: SIGNAL_PORT, path: '/api/signals' + qs, timeout: 8000 };
  const pr = http.get(opts, upstream => {
    res.writeHead(upstream.statusCode, { 'content-type': 'application/json', 'cache-control': 'no-store', 'access-control-allow-origin': '*' });
    upstream.pipe(res);
  });
  pr.on('error', () => {
    if (!res.headersSent) res.writeHead(502, { 'content-type': 'application/json' });
    res.end(JSON.stringify({ error: 'signal sidecar unavailable' }));
  });
}

http.createServer(async (req, res) => {
  try {
    const u = new URL(req.url, 'http://x');
    if (DEV && u.pathname === '/api/_log' && req.method === 'POST') return clientLog(req, res);
    if (DEV) { const t0 = Date.now(); res.on('finish', () => console.log(`[http] ${req.method} ${req.url} ${res.statusCode} ${Date.now() - t0}ms`)); }
    if (u.pathname === '/healthz') {
      res.writeHead(200, { 'content-type': 'application/json', 'cache-control': 'no-store' });
      const { cacheStats } = await import('./functions/api/plan.js');
      return res.end(JSON.stringify({ ok: true, version: VERSION, cache: cacheStats() }));
    }
    if (u.pathname === '/api/signals') {
      return proxySignal(u.search, res);
    }
    if (API.includes(u.pathname)) {
      const { onRequestGet } = await import(`./functions${u.pathname}.js`);
      const r = await onRequestGet({ request: new Request('http://x' + req.url) });
      res.writeHead(r.status, { 'content-type': 'application/json', 'cache-control': r.headers.get('cache-control') || 'no-store' });
      const text = await r.text();
      if (DEV && r.status >= 400) console.log(`[http] ${u.pathname} error body: ${text.slice(0, 300)}`);
      return res.end(text);
    }
    const file = path.join(PUBLIC, u.pathname === '/' ? 'index.html' : path.normalize(u.pathname));
    if (!file.startsWith(PUBLIC + path.sep)) { res.writeHead(403); return res.end(); }
    fs.readFile(file, (err, buf) => {
      if (err) { res.writeHead(404); return res.end('not found'); }
      // the page is one file that changes every release; metro.json changes rarely
      const cache = file.endsWith('.html') ? 'no-cache' : 'public, max-age=3600';
      res.writeHead(200, { 'content-type': TYPES[path.extname(file)] || 'application/octet-stream', 'cache-control': cache });
      res.end(buf);
    });
  } catch (e) {
    console.error(req.url, e);
    if (!res.headersSent) res.writeHead(500, { 'content-type': 'application/json' });
    res.end(JSON.stringify({ error: 'internal error' }));
  }
}).listen(PORT, '0.0.0.0', () => console.log(`BMTC Live ${VERSION} → http://localhost:${PORT}`));
