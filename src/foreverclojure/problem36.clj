(ns foreverclojure.problem36)

; Can you bind x, y, and z so that these are all true?
;
;(= 10 (let __ (+ x y)))
;(= 4 (let __ (+ y z)))
;(= 1 (let __ z))

(defn -main []
  (println (= 10 (let [x 7, y 3, z 1] (+ x y))))
  (println (= 4 (let [x 7, y 3, z 1] (+ y z))))
  (println (= 1 (let [x 7, y 3, z 1] z))))
