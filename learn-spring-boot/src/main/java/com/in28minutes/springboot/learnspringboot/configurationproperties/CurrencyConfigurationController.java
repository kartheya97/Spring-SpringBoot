package com.in28minutes.springboot.learnspringboot.configurationproperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigurationController {

	@Autowired
	private CurrencyServiceConfiguration configuration;
	
	@RequestMapping("/currency-service")
	public CurrencyServiceConfiguration returnCurrencyService(){
		return configuration;
	}
	
}
