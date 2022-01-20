(ns foreverclojure.problem48)

; The some function takes a predicate function and a collection.
; It returns the first logical true value of (predicate x) where x is an item in the collection.
;
;(= __ (some #{2 7 6} [5 6 7 8]))
;(= __ (some #(when (even? %) %) [5 6 7 8]))

(defn -main []
  (println (= 6 (some #{2 7 6} [5 6 7 8])))
  (println (= 6 (some #(when (even? %) %) [5 6 7 8]))))
