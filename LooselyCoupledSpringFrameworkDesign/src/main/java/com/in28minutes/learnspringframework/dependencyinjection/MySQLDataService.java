package com.in28minutes.learnspringframework.dependencyinjection;

import org.springframework.stereotype.Repository;

@Repository
public class MySQLDataService implements DataService{

	public int[] retireiveData() {
		return new int[] {16,17,18,19,20};
	}
	
}
