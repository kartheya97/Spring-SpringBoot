package com.in28minutes.learnspringframework.jakartainjectannotationsexample;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
class BussinessService{
	
	DataService dataService;
	
	@Inject
	public void setDataService(DataService dataService) {
		this.dataService = dataService;
	}
	public DataService getDataService() {
		return dataService;
	}
	
}

@Named
class DataService{
	
}

@Configuration
@ComponentScan
public class JakartaInjectAnnotationsExample {

	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(JakartaInjectAnnotationsExample.class)){
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(BussinessService.class).getDataService());
		}
	}
	
}
