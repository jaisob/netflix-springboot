package com.jaime.integration.service.remote;

import org.springframework.stereotype.Component;

@Component
public class FallbackService2 implements Service2 {

	@Override
	public String hello(String name) {
		
		return "Hola desde el servicio 2(FallBack), "+name;
	}

}
