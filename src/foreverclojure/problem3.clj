(ns foreverclojure.problem3)

; Clojure strings are Java strings, so you can use Java string methods on them.
; (= __ (.toUpperCase "hello world"))
(defn -main []
  (println (= "HELLO WORLD" (.toUpperCase "hello world"))))
