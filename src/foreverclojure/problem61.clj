(ns foreverclojure.problem61)

; Write a function which takes a vector of keys and a vector of values and constructs a map from them.
;
;(= (__ [:a :b :c] [1 2 3]) {:a 1, :b 2, :c 3})
;(= (__ [1 2 3 4] ["one" "two" "three"]) {1 "one", 2 "two", 3 "three"})
;(= (__ [:foo :bar] ["foo" "bar" "baz"]) {:foo "foo", :bar "bar"})

(defn -main []
  (println (= (zipmap [:a :b :c] [1 2 3]) {:a 1, :b 2, :c 3}))
  (println (= (zipmap [1 2 3 4] ["one" "two" "three"]) {1 "one", 2 "two", 3 "three"}))
  (println (= (zipmap [:foo :bar] ["foo" "bar" "baz"]) {:foo "foo", :bar "bar"})))
