(ns foreverclojure.problem41)

; Write a function which drops every Nth item from a sequence.
;
;(= (__ [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8])
;(= (__ [:a :b :c :d :e :f] 2) [:a :c :e])
;(= (__ [1 2 3 4 5 6] 4) [1 2 3 5 6])

(defn drop-every-nth [a n]
  ((fn [a n m size result]
     (cond
       (> m size) (reverse result)
       (zero? (mod m n)) (recur (rest a) n (inc m) size result)
       :else (recur (rest a) n (inc m) size (conj result (first a))))
     ) a n 1 (count a) '()))

(defn -main []
  (println (= (drop-every-nth [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8]))
  (println (= (drop-every-nth [:a :b :c :d :e :f] 2) [:a :c :e]))
  (println (= (drop-every-nth [1 2 3 4 5 6] 4) [1 2 3 5 6])))
