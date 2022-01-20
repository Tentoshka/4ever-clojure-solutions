(ns foreverclojure.problem42)

; Write a function which calculates factorials.
;
;(= (__ 1) 1)
;(= (__ 3) 6)
;(= (__ 5) 120)
;(= (__ 8) 40320)

(defn factorial [n]
  ((fn [n result]
     (cond
       (= n 1) result
       :else (recur (dec n) (* result n)))
     ) n 1))

(defn -main []
  (println (= (factorial 1) 1))
  (println (= (factorial 3) 6))
  (println (= (factorial 5) 120))
  (println (= (factorial 8) 40320)))
