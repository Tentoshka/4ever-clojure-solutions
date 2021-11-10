(ns foreverclojure.problem29)

; Write a function which takes a string and returns a new string containing only the capital letters.
; (= (__ "HeLlO, WoRlD!") "HLOWRD")
; (empty? (__ "nothing"))
; (= (__ "$#A(*&987Zf") "AZ")

(defn remove-non-upper [s] (apply str (re-seq #"[A-Z]" s)))

(defn -main []
  (println (= (remove-non-upper "HeLlO, WoRlD!") "HLOWRD"))
  (println (empty? (remove-non-upper "nothing")))
  (println (= (remove-non-upper "$#A(*&987Zf") "AZ")))
