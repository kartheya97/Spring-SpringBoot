package com.in28minutes.learnspringframework.springxmlconfiguration;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28minutes.learnspringframework.game.GameRunner;

public class XMLConfigurationLauncherApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Launch a Spring Context

		try( var springContext = new ClassPathXmlApplicationContext("contextConfiguration.xml") ) {
			
			Arrays.stream(springContext.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(springContext.getBean("age"));
			springContext.getBean(GameRunner.class).run();
		}
	}

}
