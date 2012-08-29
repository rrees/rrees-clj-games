(ns snakes.core
	(:import
		(javax.swing JPanel JFrame Timer)
		(java.awt Dimension)
		(java.awt.event ActionListener KeyListener)))

(def width 400)
(def height 400)

(defn game-panel []
	(proxy [JPanel KeyListener] []
		(paintComponent [g]
			(.drawString g "Hello world" 50 50))

		(keyPressed [e])
		(keyReleased [e])
		(keyTyped [e])

		(getPreferredSize []
			(Dimension. width height))))

(defn -main [& args]
	(let [frame (JFrame. "Snake")
		panel (game-panel)]
	(doto panel
		(.setFocusable true)
		(.addKeyListener panel))
	(doto frame
		(.setDefaultCloseOperation JFrame/EXIT_ON_CLOSE)
		(.add panel)
		(.pack)
		(.setVisible true))))