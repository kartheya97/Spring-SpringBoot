package com.in28minutes.learnspringframework.dependencyinjection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class MongoDBDataService implements DataService {

	public int[] retireiveData() {
		return new int[] {11,12,13,14,15};
	}
}
