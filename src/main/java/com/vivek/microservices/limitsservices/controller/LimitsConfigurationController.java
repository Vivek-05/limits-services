package com.vivek.microservices.limitsservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vivek.microservices.limitsservices.bean.LimitConfiguration;
import com.vivek.microservices.limitsservices.config.Configuration;

@RestController
public class LimitsConfigurationController {

	@Autowired
	private Configuration config;

	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromComfiguration() {
		return new LimitConfiguration(config.getMaximum(), config.getMinimum());
	}
}