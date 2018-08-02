package com.example.ctech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitServiceConfigurationController {

	@Autowired
	Configuration configutration;
	
	
	@GetMapping("/limits")
	public LimitConfiguration retriewLimitConfiguration() {
		return new LimitConfiguration(configutration.getMinimum(), configutration.getMaximum()); 
	}
}
