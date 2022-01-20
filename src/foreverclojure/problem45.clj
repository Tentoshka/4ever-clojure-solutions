(ns foreverclojure.problem45)

; The iterate function can be used to produce an infinite lazy sequence.
;
;(= __ (take 5 (iterate #(+ 3 %) 1)))

(defn -main []
  (println (= '(1 4 7 10 13) (take 5 (iterate #(+ 3 %) 1)))))
