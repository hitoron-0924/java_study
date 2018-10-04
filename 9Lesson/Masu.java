public void draw(Graphics g) {
		g.setColor(backgroundColor);
		g.fillRect(gX, gY, gSize, gSize);
		g.setColor(frameColor);
		g.drawRect(gX, gY, gSize, gSize);

		if (stone != null) {
			stone.draw(g, (int) (gSize * stoneCoefficient), gX + (gSize / 2),
					gY + (gSize / 2));
		}
	}