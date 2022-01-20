(ns foreverclojure.problem44)

; Write a function which can rotate a sequence in either direction.
;
;(= (__ 2 [1 2 3 4 5]) '(3 4 5 1 2))
;(= (__ -2 [1 2 3 4 5]) '(4 5 1 2 3))
;(= (__ 6 [1 2 3 4 5]) '(2 3 4 5 1))
;(= (__ 1 '(:a :b :c)) '(:b :c :a))
;(= (__ -4 '(:a :b :c)) '(:c :a :b))

(defn rotate
  [n xs]
  (cond
    (zero? n) xs
    (pos? n) (recur (dec n) (conj (vec (rest xs)) (first xs)))
    (neg? n) (recur (inc n) (conj (drop-last xs) (last xs)))))

(defn -main []
  (println (= (rotate 2 [1 2 3 4 5]) '(3 4 5 1 2)))
  (println (= (rotate -2 [1 2 3 4 5]) '(4 5 1 2 3)))
  (println (= (rotate 6 [1 2 3 4 5]) '(2 3 4 5 1)))
  (println (= (rotate 1 '(:a :b :c)) '(:b :c :a)))
  (println (= (rotate -4 '(:a :b :c)) '(:c :a :b))))
