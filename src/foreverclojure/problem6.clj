(ns foreverclojure.problem6)

; Vectors can be constructed several ways. You can compare them with lists.
; (= [__] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))
(defn -main []
  (println (= [:a :b :c] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))))
