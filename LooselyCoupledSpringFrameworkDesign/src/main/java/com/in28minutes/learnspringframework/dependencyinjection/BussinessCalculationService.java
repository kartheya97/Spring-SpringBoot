package com.in28minutes.learnspringframework.dependencyinjection;

import java.util.Arrays;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class BussinessCalculationService {

	private DataService dataService;
	
	public BussinessCalculationService(DataService dataService) {
		this.dataService = dataService;
	}
	
	public int findMax() {
		return Arrays.stream(dataService.retireiveData()).max().orElse(0);
	}
	
}
