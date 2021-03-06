(ns foreverclojure.problem21)

; Write a function which returns the Nth element from a sequence.
; Special Restrictions : nth
; (= (__ '(4 5 6 7) 2) 6)
; (= (__ [:a :b :c] 0) :a)
; (= (__ [1 2 3 4] 1) 2)
; (= (__ '([1 2] [3 4] [5 6]) 2) [5 6])
(defn -main []
  (println (= (nth '(4 5 6 7) 2) 6))
  (println (= (nth [:a :b :c] 0) :a))
  (println (= (nth [1 2 3 4] 1) 2))
  (println (= (nth '([1 2] [3 4] [5 6]) 2) [5 6]))
  )
