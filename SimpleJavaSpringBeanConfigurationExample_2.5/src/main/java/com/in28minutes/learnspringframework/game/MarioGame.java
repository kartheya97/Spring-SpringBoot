package com.in28minutes.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class MarioGame implements GamingConsole {

	public void up() {
		System.out.println("Jump");
	}
	
	
	public void down() {
		System.out.println("Go into Hole");
	}
	
	public void left() {
		System.out.println("Go Back");
	}
	
	public void right() {
		System.out.println("Accelerate");
	}

}
