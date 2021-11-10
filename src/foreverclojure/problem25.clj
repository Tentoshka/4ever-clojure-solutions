(ns foreverclojure.problem25)

; Write a function which returns only the odd numbers from a sequence.
; (= (__ #{1 2 3 4 5}) '(1 3 5))
; (= (__ [4 2 1 6]) '(1))
; (= (__ [2 2 4 6]) '())
; (= (__ [1 1 1 3]) '(1 1 1 3))
(defn -main []
  (println (= (#(filter odd? %) #{1 2 3 4 5}) '(1 3 5)))
  (println (= (#(filter odd? %) [4 2 1 6]) '(1)))
  (println (= (#(filter odd? %) [2 2 4 6]) '()))
  (println (= (#(filter odd? %) [1 1 1 3]) '(1 1 1 3))))
