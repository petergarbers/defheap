(defproject defheap "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :dependencies [[io.rkn/conformity "0.3.2"]
                 [com.datomic/datomic-free "0.9.4815.12"]
                 [org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2311"]
                 [org.clojure/core.async "0.1.267.0-0d7780-alpha"]
                 [racehub/om-bootstrap "0.3.0"]
                 [om "0.7.1"]
                 [sablono "0.2.22"]]

  :plugins [[lein-cljsbuild "1.0.4-SNAPSHOT"]]

  :source-paths ["src/cljs"]
  :resource-paths ["resources"]
  :cljsbuild {
    :builds [{:id "dev"
              :source-paths ["src/cljs"]
              :compiler {
                :output-to "resources/public/html/js/defheap.js"
                :output-dir "resources/public/html/js/out"
                :optimizations :none
                :source-map true}}]})
