(ns foreverclojure.problem28)

; Write a function which flattens a sequence.
; Special Restrictions : flatten
; (= (__ '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))
; (= (__ ["a" ["b"] "c"]) '("a" "b" "c"))
; (= (__ '((((:a))))) '(:a))
(defn -main []
  (println (= (flatten '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6)))
  (println (= (flatten ["a" ["b"] "c"]) '("a" "b" "c")))
  (println (= (flatten '((((:a))))) '(:a))))
