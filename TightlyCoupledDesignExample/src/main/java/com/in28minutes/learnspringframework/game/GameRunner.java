package com.in28minutes.learnspringframework.game;

public class GameRunner {
	
	//MarioGame game;
	private SuperContraGame game;
	public GameRunner(SuperContraGame game) {
		this.game = game;
	}
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Game Running is "+game);
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
