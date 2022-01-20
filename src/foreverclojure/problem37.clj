(ns foreverclojure.problem37)

; Regex patterns are supported with a special reader macro.
;
;(= __ (apply str (re-seq #"[A-Z]+" "bA1B3Ce ")))

(defn -main []
  (println (= "ABC" (apply str (re-seq #"[A-Z]+" "bA1B3Ce ")))))
