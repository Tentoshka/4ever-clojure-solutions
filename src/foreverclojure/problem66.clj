(ns foreverclojure.problem66)

; Given two integers, write a function which returns the greatest common divisor.
;
;(= (__ 2 4) 2)
;(= (__ 10 5) 5)
;(= (__ 5 7) 1)
;(= (__ 1023 858) 33)

(defn gcd [a b]
  (let [as (remove nil? (map #(if (zero? (mod a %)) %) ((comp rest range inc) a))),
        bs (remove nil? (map #(if (zero? (mod b %)) %) ((comp rest range inc) b)))]
       (apply max (filter (set bs) as))))


(defn -main []
  (println (= (gcd 2 4) 2))
  (println (= (gcd 10 5) 5))
  (println (= (gcd 5 7) 1))
  (println (= (gcd 1023 858) 33)))
