(ns foreverclojure.problem31)

; Write a function which packs consecutive duplicates into sub-lists.
;
; (= (__ [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3)))
; (= (__ [:a :a :b :b :c]) '((:a :a) (:b :b) (:c)))
; (= (__ [[1 2] [1 2] [3 4]]) '(([1 2] [1 2]) ([3 4])))

(defn -main []
  (println (= (#(partition-by identity %)  [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3))))
  (println (= (#(partition-by identity %) [:a :a :b :b :c]) '((:a :a) (:b :b) (:c))))
  (println (= (#(partition-by identity %) [[1 2] [1 2] [3 4]]) '(([1 2] [1 2]) ([3 4])))))