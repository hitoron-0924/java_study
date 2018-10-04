@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		board.draw(g);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}