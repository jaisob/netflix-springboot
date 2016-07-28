package com.jaime.integration.service.remote;

import org.springframework.stereotype.Component;

@Component
public class FallbackService1 implements Service1 {

	@Override
	public String hello(String name) {
		
		return "Hola desde el servicio 1(FallBack), "+name;
	}

}
