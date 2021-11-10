(ns foreverclojure.problem2)

; Innermost forms are evaluated first.
; (= (- 10 (* 2 3)) __)
(defn -main []
  (println (= (- 10 (* 2 3)) 4)))
