(ns foreverclojure.problem46)

; Write a higher-order function which flips the order of the arguments of an input function.
;
;(= 3 ((__ nth) 2 [1 2 3 4 5]))
;(= true ((__ >) 7 8))
;(= 4 ((__ quot) 2 8))
;(= [1 2 3] ((__ take) [1 2 3 4 5] 3))

(defn -main []
  (println (= 3 (((fn [f] (fn [x y] (f y x))) nth) 2 [1 2 3 4 5])))
  (println (= true (((fn [f] (fn [x y] (f y x))) >) 7 8)))
  (println (= 4 (((fn [f] (fn [x y] (f y x))) quot) 2 8)))
  (println (= [1 2 3] (((fn [f] (fn [x y] (f y x))) take) [1 2 3 4 5] 3))))
