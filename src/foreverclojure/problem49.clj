(ns foreverclojure.problem49)

; Write a function which will split a sequence into two parts.
;
;(= (__ 3 [1 2 3 4 5 6]) [[1 2 3] [4 5 6]])
;(= (__ 1 [:a :b :c :d]) [[:a] [:b :c :d]])
;(= (__ 2 [[1 2] [3 4] [5 6]]) [[[1 2] [3 4]] [[5 6]]])

(defn -main []
  (println (= (split-at 3 [1 2 3 4 5 6]) [[1 2 3] [4 5 6]]))
  (println (= (split-at 1 [:a :b :c :d]) [[:a] [:b :c :d]]))
  (println (= (split-at 2 [[1 2] [3 4] [5 6]]) [[[1 2] [3 4]] [[5 6]]])))
