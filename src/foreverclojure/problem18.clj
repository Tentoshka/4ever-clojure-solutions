(ns foreverclojure.problem18)

; The filter function takes two arguments: a predicate function (f) and a sequence (s).
; Filter returns a new sequence consisting of all the items of s for which (f item) returns true.
; (= __ (filter #(> % 5) '(3 4 5 6 7)))
(defn -main []
  (println (= [6 7] (filter #(> % 5) '(3 4 5 6 7)))))
