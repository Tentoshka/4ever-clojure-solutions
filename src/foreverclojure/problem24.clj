(ns foreverclojure.problem24)

; Write a function which returns the sum of a sequence of numbers.
; (= (__ [1 2 3]) 6)
; (= (__ (list 0 -2 5 5)) 8)
; (= (__ #{4 2 1}) 7)
; (= (__ '(0 0 -1)) -1)
; (= (__ '(1 10 3)) 14)
(defn -main []
  (println (= (#(apply + %) [1 2 3]) 6))
  (println (= (#(apply + %) (list 0 -2 5 5)) 8))
  (println (= (#(apply + %) #{4 2 1}) 7))
  (println (= (#(apply + %) '(0 0 -1)) -1))
  (println (= (#(apply + %) '(1 10 3)) 14)))
