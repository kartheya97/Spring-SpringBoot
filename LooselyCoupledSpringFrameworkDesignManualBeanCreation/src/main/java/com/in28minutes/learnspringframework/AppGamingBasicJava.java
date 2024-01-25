package com.in28minutes.learnspringframework;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.learnspringframework.game.GameRunner;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println); 
	    context.getBean(GameRunner.class).run();
	}

}
