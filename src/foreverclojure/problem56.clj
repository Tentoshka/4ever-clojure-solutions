(ns foreverclojure.problem56)

; Write a function which removes the duplicates from a sequence. Order of the items must be maintained.
;
;(= (__ [1 2 1 3 1 2 4]) [1 2 3 4])
;(= (__ [:a :a :b :b :c :c]) [:a :b :c])
;(= (__ '([2 4] [1 2] [1 3] [1 3])) '([2 4] [1 2] [1 3]))
;(= (__ (range 50)) (range 50))

(defn -main []
  (println (= (distinct [1 2 1 3 1 2 4]) [1 2 3 4]))
  (println (= (distinct [:a :a :b :b :c :c]) [:a :b :c]))
  (println (= (distinct '([2 4] [1 2] [1 3] [1 3])) '([2 4] [1 2] [1 3])))
  (println (= (distinct (range 50)) (range 50))))
