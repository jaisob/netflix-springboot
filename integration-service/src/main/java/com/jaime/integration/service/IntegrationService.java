package com.jaime.integration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaime.integration.service.remote.Service1;
import com.jaime.integration.service.remote.Service2;

@Service
public class IntegrationService {
	
	@Autowired
	private Service1 service1;
	@Autowired
	private Service2 service2;
	
	
	public String helloIntegration(String name){
		String st1 = service1.hello(name);
		String st2 = service2.hello(name);
		
		return st1 + " ____ " + st2;
	}

}
