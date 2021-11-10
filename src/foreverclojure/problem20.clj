(ns foreverclojure.problem20)

; Write a function which returns the second to last element from a sequence.
; (= (__ (list 1 2 3 4 5)) 4)
; (= (__ ["a" "b" "c"]) "b")
; (= (__ [[1 2] [3 4]]) [1 2])
(defn -main []
  (println (= (#(last (drop-last %)) (list 1 2 3 4 5)) 4))
  (println (= (#(last (drop-last %)) ["a" "b" "c"]) "b"))
  (println (= (#(last (drop-last %)) [[1 2] [3 4]]) [1 2])))
