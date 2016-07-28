package com.jaime.integration.service.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="Service2", fallback=FallbackService2.class)
public interface Service2 {

	@RequestMapping(path= "/hello/{name}", method=RequestMethod.GET)
	public String hello(@PathVariable("name") String name);
}
