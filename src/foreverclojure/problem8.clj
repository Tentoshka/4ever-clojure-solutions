(ns foreverclojure.problem8
  (:require [clojure.set :as set]))

; Sets are collections of unique values.
; (= __ (set '(:a :a :b :c :c :c :c :d :d)))
; (= __ (set/union #{:a :b :c} #{:b :c :d}))
(defn -main []
  (println (= #{:a :b :c :d} (set '(:a :a :b :c :c :c :c :d :d))))
  (println (= #{:a :b :c :d} (set/union #{:a :b :c} #{:b :c :d}))))
