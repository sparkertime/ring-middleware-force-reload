(ns ring.middleware.force-reload)

(defn wrap-force-reload
  "Forces the reloading of each namespace in reloadables on each request. Functionally equivalent to ring.middleware.reload prior to f39e24da7"
  [app reloadables]
  (fn [req]
    (doseq [ns-sym reloadables]
      (require ns-sym :reload))
    (app req)))
