(ns foreverclojure.problem22)

; Write a function which returns the total number of elements in a sequence.
; Special Restrictions : count
; (= (__ '(1 2 3 3 1)) 5)
; (= (__ "Hello World") 11)
; (= (__ [[1 2] [3 4] [5 6]]) 3)
; (= (__ '(13)) 1)
; (= (__ '(:a :b :c)) 3)
(defn -main []
  (println (= (count '(1 2 3 3 1)) 5))
  (println (= (count "Hello World") 11))
  (println (= (count [[1 2] [3 4] [5 6]]) 3))
  (println (= (count '(13)) 1))
  (println (= (count '(:a :b :c)) 3)))
