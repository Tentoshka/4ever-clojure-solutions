(ns foreverclojure.problem4)

; Lists can be constructed with either a function or a quoted form.
; (= (list __) '(:a :b :c))
(defn -main []
  (println (= (list :a :b :c) '(:a :b :c))))
