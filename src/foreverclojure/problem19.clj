(ns foreverclojure.problem19)

; Write a function which returns the last element in a sequence.
; Special Restrictions : last
; (= (__ [1 2 3 4 5]) 5)
; (= (__ '(5 4 3)) 3)
; (= (__ ["b" "c" "d"]) "d")
(defn -main []
  (println (= (last [1 2 3 4 5]) 5))
  (println (= (last '(5 4 3)) 3))
  (println (= (last ["b" "c" "d"]) "d")))
