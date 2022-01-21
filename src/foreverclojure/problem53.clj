(ns foreverclojure.problem53)

; Given a vector of integers, find the longest consecutive sub-sequence of increasing numbers.
; If two sub-sequences have the same length, use the one that occurs first.
; An increasing sub-sequence must have a length of 2 or greater to qualify.
;
;(= (__ [1 0 1 2 3 0 4 5]) [0 1 2 3])
;(= (__ [5 6 1 3 2 7]) [5 6])
;(= (__ [2 3 3 4 5]) [3 4 5])
;(= (__ [7 6 5 4]) [])

(defn longest-consecutive-subseq [xs]
  ((fn [xs temp result]
     (cond
       (= 1 (count xs)) (if (empty? temp)
                          (if (= 1 (count result)) '() (reverse result))
                          (if (and (< (first temp) (first xs)) (> (count (conj temp (first xs))) (count result)))
                            (reverse (conj temp (first xs)))
                            (reverse result)))
       (< (first xs) (second xs)) (recur (rest xs) (conj temp (first xs)) result)
       :else (cond
               (> (count (conj temp (first xs))) (count result)) (recur (rest xs) '() (conj temp (first xs)))
               :else (recur (rest xs) '() result))
       )
     ) xs '() '()))

(defn -main []
  (println (= (longest-consecutive-subseq [1 0 1 2 3 0 4 5]) [0 1 2 3]))
  (println (= (longest-consecutive-subseq [5 6 1 3 2 7]) [5 6]))
  (println (= (longest-consecutive-subseq [2 3 3 4 5]) [3 4 5]))
  (println (= (longest-consecutive-subseq [7 6 5 4]) [])))

