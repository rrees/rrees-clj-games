(ns snakes.entities)

(defn create-apple [width height]
  {:location [(rand-int width) (rand-int height)]
   :type :apple})

(defn create-snake []
  {:body (list [1 1])
   :dir [1 0]
   :type :snake})