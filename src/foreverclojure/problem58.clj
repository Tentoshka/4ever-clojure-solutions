(ns foreverclojure.problem58)

; Write a function which allows you to create function compositions. The parameter list should take a variable number of functions, and create a function applies them from right-to-left.
;
;(= [3 2 1] ((__ rest reverse) [1 2 3 4]))
;(= 5 ((__ (partial + 3) second) [1 2 3 4]))
;(= true ((__ zero? #(mod % 8) +) 3 5 7 9))
;(= "HELLO" ((__ #(.toUpperCase %) #(apply str %) take) 5 "hello world"))

(defn -main []
  (println (= [3 2 1] ((comp rest reverse) [1 2 3 4])))
  (println (= 5 ((comp (partial + 3) second) [1 2 3 4])))
  (println (= true ((comp zero? #(mod % 8) +) 3 5 7 9)))
  (println (= "HELLO" ((comp #(.toUpperCase %) #(apply str %) take) 5 "hello world"))))
