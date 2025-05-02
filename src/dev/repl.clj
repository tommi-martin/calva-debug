(ns repl
  (:require
   [mini.playground :as pl]
   [clojure.pprint]
   [shadow.cljs.devtools.api :as shadow]))


(defn start
  {:shadow/requires-server true}
  [& args]
  (shadow/watch :frontend)

  (try
    (apply pl/-main args)
    (catch Exception ex
      (clojure.pprint/pprint (Throwable->map ex)))) 
  ::started)

(defn stop []
  (prn "got stop")
  ::stopped)
