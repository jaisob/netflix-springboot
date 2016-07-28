package com.jaime.service2.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping(path= "/hello/{name}", method=RequestMethod.GET)
	public String hello(@PathVariable String name){
		
		return "Hola desde el servicio 2bis, "+name;
	}

}
