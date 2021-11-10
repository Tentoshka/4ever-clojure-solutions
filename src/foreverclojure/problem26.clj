(ns foreverclojure.problem26)

; Write a function which returns the first X fibonacci numbers.
; (= (__ 3) '(1 1 2))
; (= (__ 6) '(1 1 2 3 5 8))
; (= (__ 8) '(1 1 2 3 5 8 13 21))

(defn fib
  ([x] (fib x '(1 1)))
  ([x acc]
   (cond
     (neg? x) "Error"
     (zero? x) 0
     (= x 1) 1
     (= x 2) (reverse acc)
     :else (recur (dec x) (conj acc (+ (second acc) (first acc)))))))

(defn -main []
  (println (= (fib 3) '(1 1 2)))
  (println (= (fib 6) '(1 1 2 3 5 8)))
  (println (= (fib 8) '(1 1 2 3 5 8 13 21))))
