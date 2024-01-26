package com.in28minutes.learnspringframework.postconstructpresdestroyannotation;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class Someclass{
	
	private SomeDependency someDependency;
	
	public Someclass(SomeDependency someDependency) {
		this.someDependency =someDependency;
		System.out.println("All Dependencies are ready");
	}
	
	@PostConstruct
	public void initialize() {
		someDependency.getReady();
	}

	@PreDestroy
	public void cleanUp() {
		System.out.println("Cleanup all the connections to the database. ");
	}
	
}

@Component
class SomeDependency{

	public void getReady() {
		// TODO Auto-generated method stub
		System.out.println("Some logic using Some Dependency");
	}
	
}

@Configuration
@ComponentScan
public class PostConductPreDestroyLauncher {

	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(PostConductPreDestroyLauncher.class)){
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
		}
	}
	
}
