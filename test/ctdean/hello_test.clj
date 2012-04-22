;;;;
;;;; hello-test
;;;;
;;;; Chris Dean

(ns ctdean.hello-test
  (:use clojure.test
        ctdean.hello
        noir.core
        noir.util.test))

(defn contains-string? [big small]
  (not= -1
        (.indexOf big small)))

(deftest root-test
  (let [rsp (send-request "/")]
    (has-status rsp 200)
    (is (contains-string? (:body rsp) "Hello"))))

(deftest missing-test
  (let [rsp (send-request "/missing")]
    (has-status rsp 404)
    (is (not (contains-string? (:body rsp) "Hello")))))

