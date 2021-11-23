(defn square-of-number([a]
          (* a a)))

(square-of-number 2)

(defn add-two-numbers([a b]
                      (+ a b)))

(add-two-numbers 4 4)

(defn pythogoras-theorem([x y]
 (Math/sqrt (add-two-numbers (square-of-number x) (square-of-number y)))))

(pythogoras-theorem 2 2)