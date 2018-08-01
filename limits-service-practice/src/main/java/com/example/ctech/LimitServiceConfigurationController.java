package com.example.ctech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitServiceConfigurationController {

	@Autowired
	LimitConfiguration limitConfigutration;
	
	
	@GetMapping("/limits")
	public LimitConfiguration retriewLimitConfiguration() {
		return new LimitConfiguration(limitConfigutration.getMinimum(), limitConfigutration.getMaximum()); 
	}
}
