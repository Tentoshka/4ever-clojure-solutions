(ns foreverclojure.problem30)

; Write a function which removes consecutive duplicates from a sequence.
; (= (apply str (__ "Leeeeeerrroyyy")) "Leroy")
; (= (__ [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))
; (= (__ [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))

(defn -main []
  (println (= (apply str (#(map first (partition-by identity %)) "Leeeeeerrroyyy")) "Leroy"))
  (println (= (#(map first (partition-by identity %)) [1 1 2 3 3 2 2 3]) '(1 2 3 2 3)))
  (println (= (#(map first (partition-by identity %)) [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))))
