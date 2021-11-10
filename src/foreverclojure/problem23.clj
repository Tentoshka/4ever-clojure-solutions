(ns foreverclojure.problem23)

; Write a function which reverses a sequence.
; Special Restrictions : reverse
; (= (__ [1 2 3 4 5]) [5 4 3 2 1])
; (= (__ (sorted-set 5 7 2 7)) '(7 5 2))
; (= (__ [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])
(defn -main []
  (println (= (reverse [1 2 3 4 5]) [5 4 3 2 1]))
  (println (= (reverse (sorted-set 5 7 2 7)) '(7 5 2)))
  (println (= (reverse (sorted-set 5 7 2 7)) '(7 5 2))))
