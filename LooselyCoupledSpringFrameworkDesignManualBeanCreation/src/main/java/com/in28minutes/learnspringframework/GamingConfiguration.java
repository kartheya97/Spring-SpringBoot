package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;
import com.in28minutes.learnspringframework.game.PackManGame;

@Configuration
public class GamingConfiguration {


	@Bean
	public GamingConsole game() {
		return new PackManGame();
	}

	@Bean
	public GameRunner gameRunner() {
		return new GameRunner(game());
	}
}
