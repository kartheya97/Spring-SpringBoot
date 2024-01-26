package com.in28minutes.learnspringframework.dependencyinjection;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BussinessServiceLauncherApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try( var context = new AnnotationConfigApplicationContext(BussinessServiceLauncherApplication.class) ){
        	Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        	System.out.println(context.getBean(BussinessCalculationService.class).findMax());
        }
	}

}
