(ns foreverclojure.problem27)

; Write a function which returns true if the given sequence is a palindrome.
; Hint: "racecar" does not equal '(\r \a \c \e \c \a \r)
; (false? (__ '(1 2 3 4 5)))
; (true? (__ "racecar"))
; (true? (__ [:foo :bar :foo]))
; (true? (__ '(1 1 3 3 1 1)))
; (false? (__ '(:a :b :c)))

(defn palindrome?
  ([x] (palindrome? x (reverse x) (dec (count x))))
  ([x y n] (cond
             (zero? n) true
             (not= (nth x n) (nth y n)) false
             :else (recur x y (dec n)))))

(defn -main []
  (println (false? (palindrome? '(1 2 3 4 5))))
  (println (true? (palindrome? "racecar")))
  (println (true? (palindrome? [:foo :bar :foo])))
  (println (true? (palindrome? '(1 1 3 3 1 1))))
  (println (false? (palindrome? '(:a :b :c)))))
