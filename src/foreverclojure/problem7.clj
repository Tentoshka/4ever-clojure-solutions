(ns foreverclojure.problem7)

; When operating on a Vector, the conj function will return a new vector with one or more items "added" to the end.
; (= __ (conj [1 2 3] 4))
; (= __ (conj [1 2] 3 4))
(defn -main []
  (println (= [1 2 3 4] (conj [1 2 3] 4)))
  (println (= [1 2 3 4] (conj [1 2] 3 4))))
