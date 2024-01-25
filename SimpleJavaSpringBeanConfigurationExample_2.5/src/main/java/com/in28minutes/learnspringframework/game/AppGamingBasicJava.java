package com.in28minutes.learnspringframework.game;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class AppGamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var context = new AnnotationConfigApplicationContext(AppGamingBasicJava.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println); 
	    context.getBean(GameRunner.class).run();
	}

}
