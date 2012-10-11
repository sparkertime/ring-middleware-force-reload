# ring-middleware-force-reload

An extremely simple Ring middleware that forces a reload of given namespaces prior to every request. Based on the old behavior of ring.middleware.wrap-reload prior to [https://github.com/mmcgrana/ring/commit/f39e24da7e97dd7354f47c16f160322cca35986d#ring-devel/src/ring/middleware/reload.clj](f39e24da7). Intended primarily to force reloading of cached, non-Clojure assets such as Enlive templates.

## Usage

```
(defroutes my-routes
  ...)

(def app
  (wrap-force-reload my-routes ['myapp.namespace]))
```

## License

Distributed under the Eclipse Public License, the same as Clojure.
