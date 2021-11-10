(ns foreverclojure.problem15)

;Write a function which doubles a number.
; (= (__ 2) 4)
; (= (__ 3) 6)
; (= (__ 11) 22)
; (= (__ 7) 14)
(defn -main []
  (println (= (#(* % 2) 2) 4))
  (println (= (#(* % 2) 3) 6))
  (println (= (#(* % 2) 3) 6))
  (println (= (#(* % 2) 7) 14))
  )