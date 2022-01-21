(ns foreverclojure.problem67)

; Write a function which returns the first x number of prime numbers.
;
;(= (__ 2) [2 3])
;(= (__ 5) [2 3 5 7 11])
;(= (last (__ 100)) 541)

(defn get-n-prime-numbers [n]
  (take n (remove
            (fn [n]
              (some #(= 0 (mod n %)) (range 2 (inc (int (Math/sqrt n))))))
            (iterate inc 2))))

(defn -main []
  (println (= (get-n-prime-numbers 2) [2 3]))
  (println (= (get-n-prime-numbers 5) [2 3 5 7 11]))
  (println (= (last (get-n-prime-numbers 100)) 541)))
