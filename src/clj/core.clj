(ns clj.core
  (:require [datomic.api :as d]
            [io.rkn.conformity :as c]))

(def uri "datomic:mem://defheap")
(d/create-database uri)
(def conn (d/connect uri))

(defn load-resource [filename] (read-string (slurp (clojure.java.io/reader (clojure.java.io/resource filename)))))
(def norms-map (load-resource "data/schema.edn"))

(println (str "Has attribute? " (c/has-attribute? (d/db conn) :data/code)))
(c/ensure-conforms conn norms-map [:defheap/schema])
(println (str "Has attribute? " (c/has-attribute? (d/db conn) :data/code)))
