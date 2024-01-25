package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person  (String person, int age, Address address) {};
record Address (String firstLine, String city) {};

@Configuration
public class SpringConfiguration {

	@Bean
	public String name() {
		return "sheru";
	}

	@Bean
	public int age() {
		return 17;
	}
	
	@Bean
	public Person person() {
		return new Person("Ravi",20, new Address("second Home","TX"));
	}
	
	@Bean
	public Person person2() {
		return new Person(name(),age(), address());
	}
	
	@Bean(name="address2")
	public Address address() {
		return new Address("firstHome", "Indiana");
	}
}
