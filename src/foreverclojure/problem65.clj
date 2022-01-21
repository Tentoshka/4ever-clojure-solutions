(ns foreverclojure.problem65)

; Clojure has many collection types, which act in subtly different ways.
; The core functions typically convert them into a uniform "sequence" type and work with them that way,
; but it can be important to understand the behavioral and performance differences
; so that you know which kind is appropriate for your application.
; Write a function which takes a collection and returns one of: map, :set, :list, or :vector - describing the type of collection it was given.
; You won't be allowed to inspect their class or use the built-in predicates like list? - the point is to poke at them and understand their behavior.
;
;(= :map (__ {:a 1, :b 2}))
;(= :list (__ (range (rand-int 20))))
;(= :vector (__ [1 2 3 4 5 6]))
;(= :set (__ #{10 (rand-int 5)}))
;(= [:map :set :vector :list] (map __ [{} #{} [] ()]))

(defn get-keyword-of-type [x] (let [s (first (pr-str x))]
            (cond (= s \() :list
                  (= s \[) :vector
                  (= s \#) :set
                  (= s \{) :map)))

(defn -main []
  (println (= :map (get-keyword-of-type {:a 1, :b 2})))
  (println (= :list (get-keyword-of-type (range (rand-int 20)))))
  (println (= :vector (get-keyword-of-type [1 2 3 4 5 6])))
  (println (= :set (get-keyword-of-type #{10 (rand-int 5)})))
  (println (= [:map :set :vector :list] (map get-keyword-of-type [{} #{} [] ()]))))