(ns foreverclojure.problem54)

; Write a function which returns a sequence of lists of x items each. Lists of less than x items should not be returned.
;
;(= (__ 3 (range 9)) '((0 1 2) (3 4 5) (6 7 8)))
;(= (__ 2 (range 8)) '((0 1) (2 3) (4 5) (6 7)))
;(= (__ 3 (range 8)) '((0 1 2) (3 4 5)))

(defn -main []
  (println (= (partition 3 (range 9)) '((0 1 2) (3 4 5) (6 7 8))))
  (println (= (partition 2 (range 8)) '((0 1) (2 3) (4 5) (6 7))))
  (println (= (partition 3 (range 8)) '((0 1 2) (3 4 5)))))