(ns foreverclojure.problem33)

; Write a function which replicates each element of a sequence a variable number of times.
;
;(= (__ [1 2 3] 2) '(1 1 2 2 3 3))
;(= (__ [:a :b] 4) '(:a :a :a :a :b :b :b :b))
;(= (__ [4 5 6] 1) '(4 5 6))
;(= (__ [[1 2] [3 4]] 2) '([1 2] [1 2] [3 4] [3 4]))
;(= (__ [44 33] 2) [44 44 33 33])

(defn -main []
  (println
    (= (#(mapcat (partial repeat %2) %) [1 2 3] 2) '(1 1 2 2 3 3)))
  (println
    (= (#(mapcat (partial repeat %2) %) [:a :b] 4) '(:a :a :a :a :b :b :b :b)))
  (println
    (= (#(mapcat (partial repeat %2) %) [4 5 6] 1) '(4 5 6)))
  (println
    (= (#(mapcat (partial repeat %2) %) [[1 2] [3 4]] 2) '([1 2] [1 2] [3 4] [3 4])))
  (println
    (= (#(mapcat (partial repeat %2) %) [44 33] 2) [44 44 33 33]))
  )
