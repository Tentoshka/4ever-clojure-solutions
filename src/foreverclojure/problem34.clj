(ns foreverclojure.problem34)

; Write a function which creates a list of all integers in a given range.
;
;(= (__ 1 4) '(1 2 3))
;(= (__ -2 2) '(-2 -1 0 1))
;(= (__ 5 8) '(5 6 7))

(defn -main []
  (println (= (range 1 4) '(1 2 3)))
  (println (= (range -2 2) '(-2 -1 0 1)))
  (println (= (range 5 8) '(5 6 7))))
