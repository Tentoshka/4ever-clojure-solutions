(ns foreverclojure.problem11)

;When operating on a map, the conj function returns a new map with one or more key-value pairs "added".
; (= {:a 1, :b 2, :c 3} (conj {:a 1} __ [:c 3]))
(defn -main []
  (println (= {:a 1, :b 2, :c 3} (conj {:a 1} {:b 2} [:c 3]))))
