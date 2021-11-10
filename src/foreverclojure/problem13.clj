(ns foreverclojure.problem13)

; The rest function will return all the items of a sequence except the first.
; (= __ (rest [10 20 30 40]))
(defn -main []
  (println (= [20 30 40] (rest [10 20 30 40]))))
