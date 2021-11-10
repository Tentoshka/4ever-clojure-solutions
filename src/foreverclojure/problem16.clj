(ns foreverclojure.problem16)

; Write a function which returns a personalized greeting.
; (= (__ "Dave") "Hello, Dave!")
; (= (__ "Jenn") "Hello, Jenn!")
; (= (__ "Rhea") "Hello, Rhea!")
(defn -main []
  (println (= (#(str "Hello, " % "!") "Dave") "Hello, Dave!"))
  (println (= (#(str "Hello, " % "!") "Jenn") "Hello, Jenn!"))
  (println (= (#(str "Hello, " % "!") "Rhea") "Hello, Rhea!"))
  )
