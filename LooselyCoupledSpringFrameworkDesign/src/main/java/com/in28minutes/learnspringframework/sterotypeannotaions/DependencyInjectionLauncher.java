package com.in28minutes.learnspringframework.sterotypeannotaions;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBussinessClass{

	// Field Injection starts here.
	@Autowired
	Dependency1 dependency1;

	@Autowired
	Dependency2 dependency2;
	
	// Field Injection ends here.
	
	//Setter Injection starts here.
	@Autowired
	public void setDependency1(Dependency1 dependency1) {
		this.dependency1 = dependency1;
	}

	@Autowired
	public void setDependency2(Dependency2 dependency2) {
		this.dependency2 = dependency2;
	}
	
	//Setter Injection ends here.
	/*
	 * Constructor Based Injection
    public YourBussinessClass(Dependency1 dependency1, Dependency2 dependency2) {
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}
	*/
	public String toString() {
		return dependency1 + " and " + dependency2;
	}
	
}

@Component
class Dependency1{
	
}

@Component
class Dependency2{
	
}

@Configuration
@ComponentScan
public class DependencyInjectionLauncher {

	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(DependencyInjectionLauncher.class)){
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(YourBussinessClass.class));
		}
	}
	
}
