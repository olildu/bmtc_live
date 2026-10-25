# BMTC Live: the page (public/) plus the /api/* Functions, served by server.js. No dependencies.
# Node 22 is required: server.js is CommonJS and loads the ESM files in functions/api/ with import(),
# which needs Node's automatic module-syntax detection (Node 20 fails on `export`).
FROM node:22-alpine

WORKDIR /app
ARG APP_VERSION=dev
ENV APP_VERSION=${APP_VERSION} \
    PORT=3000 \
    NODE_ENV=production

COPY package.json server.js ./
COPY functions ./functions
COPY public ./public

USER node
EXPOSE 3000
HEALTHCHECK --interval=30s --timeout=5s --start-period=10s --retries=3 \
  CMD wget -qO- http://127.0.0.1:3000/healthz >/dev/null || exit 1
CMD ["node", "server.js"]
