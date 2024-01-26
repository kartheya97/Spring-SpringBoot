package com.in28minutes.learnspringframework.lazyInitialization;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class A{

}

@Component
@Lazy
class B{

	A a;
	public B(A a) {
		System.out.println("Some Initialization logic");
		this.a = a;
	}
	public void doSomething() {
		System.out.println("Do Something");
	}
	
}



@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication {

	public static void main(String[] args) {
			try(var context = new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class)){
			System.out.println("Initialization is completed");	
			context.getBean(B.class).doSomething();
		}
	}

}
