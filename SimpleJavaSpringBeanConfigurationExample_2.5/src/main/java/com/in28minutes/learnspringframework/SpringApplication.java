package com.in28minutes.learnspringframework;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Launch a Spring Context

		try( var springContext = new AnnotationConfigApplicationContext(SpringConfiguration.class)) {
			System.out.println(springContext.getBean("name"));
			System.out.println(springContext.getBean("age"));
			System.out.println(springContext.getBean("person"));
			System.out.println(springContext.getBean("address2"));
			System.out.println(springContext.getBean("person2"));
			String beanNames [] = springContext.getBeanDefinitionNames();
			Arrays.stream(beanNames).forEach(System.out :: println);
			//Configure the things that we want Spring to manage.
		}
	}

}
