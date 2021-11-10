(ns foreverclojure.problem12)

; All Clojure collections support sequencing. You can operate on sequences with functions like first, second, and last.
; (= __ (first '(3 2 1)))
; (= __ (second [2 3 4]))
; (= __ (last (list 1 2 3)))
(defn -main []
  (println (= 3 (first '(3 2 1))))
  (println (= 3 (second [2 3 4])))
  (println (= 3 (last (list 1 2 3)))))
