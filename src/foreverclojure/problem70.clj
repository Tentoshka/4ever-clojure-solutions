(ns foreverclojure.problem70)

; Write a function which splits a sentence up into a sorted list of words.
; Capitalization should not affect sort order and punctuation should be ignored.
;(= (__  "Have a nice day.")
;   ["a" "day" "Have" "nice"])
;(= (__  "Clojure is a fun language!")
;   ["a" "Clojure" "fun" "is" "language"])
;(= (__  "Fools fall for foolish follies.")
;   ["fall" "follies" "foolish" "Fools" "for"])

(defn sort-words
  [s]
  (sort #(.compareToIgnoreCase % %2)
        (re-seq #"\w+" s)))

(defn -main []
  (println
    (= (sort-words "Have a nice day.")
       ["a" "day" "Have" "nice"]))
  (println
    (= (sort-words "Clojure is a fun language!")
       ["a" "Clojure" "fun" "is" "language"]))
  (println
    (= (sort-words "Fools fall for foolish follies.")
       ["fall" "follies" "foolish" "Fools" "for"])))
