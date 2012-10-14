(ns snakes.rules)

(defn win? [win-length {body :body}]
  (>= (count body) win-length))