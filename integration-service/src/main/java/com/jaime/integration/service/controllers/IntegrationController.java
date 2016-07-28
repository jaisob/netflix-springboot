package com.jaime.integration.service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jaime.integration.service.IntegrationService;

@RestController
public class IntegrationController {
	
	@Autowired
	private IntegrationService service;
	
	@RequestMapping(path="/integration/{name}", method=RequestMethod.GET)
	public String integrationHello(@PathVariable String name){
		return service.helloIntegration(name);
	}

}
