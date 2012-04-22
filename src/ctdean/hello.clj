;;;;
;;;; hello - a simple hello world web server
;;;;
;;;; Chris Dean

(ns ctdean.hello
  (:use noir.core hiccup.core)
  (:require [noir.server :as server]))

;; The only page
(defpage "/" []
  "<html><body>Hello dotcloud</body></html>")

;; The handler for ring and the war file
(def handler (server/gen-handler {:mode :dev
                                  :ns 'ctdean.hello}))



