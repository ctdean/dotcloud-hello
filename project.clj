(defproject ctdean-dotcloud-hello "1.0.0"
  :description "hello world on dotcloud"
  :license {:name "MIT License"
            :url "http://www.opensource.org/licenses/mit-license.html"}
  :plugins [[lein-ring "0.6.2"]]
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [noir "1.2.2"]]
  :ring {:handler ctdean.hello/handler})
