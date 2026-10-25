// Local dev server: serves public/ and /api/plan (same code the Cloudflare Pages Function runs).
// Live bus data is fetched by the browser directly from Chalo's socket.
const http = require('http');
const fs = require('fs');
const path = require('path');

const PORT = process.env.PORT || 3000;
const PUBLIC = path.join(__dirname, 'public');
const TYPES = { '.html': 'text/html', '.js': 'text/javascript', '.css': 'text/css' };

http.createServer(async (req, res) => {
  const u = new URL(req.url, 'http://x');
  if (u.pathname === '/api/plan') {
    const { onRequestGet } = await import('./functions/api/plan.js');
    const r = await onRequestGet({ request: new Request('http://x' + req.url) });
    res.writeHead(r.status, { 'content-type': 'application/json' });
    return res.end(await r.text());
  }
  const file = path.join(PUBLIC, u.pathname === '/' ? 'index.html' : path.normalize(u.pathname));
  if (!file.startsWith(PUBLIC)) { res.writeHead(403); return res.end(); }
  fs.readFile(file, (err, buf) => {
    if (err) { res.writeHead(404); return res.end('not found'); }
    res.writeHead(200, { 'content-type': TYPES[path.extname(file)] || 'application/octet-stream' });
    res.end(buf);
  });
}).listen(PORT, () => console.log(`BMTC live → http://localhost:${PORT}`));
