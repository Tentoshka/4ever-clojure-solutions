(ns foreverclojure.problem51)

; Here is an example of some more sophisticated destructuring.
;
;(= [1 2 [3 4 5] [1 2 3 4 5]] (let [[a b & c :as d] __] [a b c d]))

(defn -main []
  (println (= [1 2 [3 4 5] [1 2 3 4 5]] (let [[a b & c :as d] [1 2 3 4 5]] [a b c d]))))
