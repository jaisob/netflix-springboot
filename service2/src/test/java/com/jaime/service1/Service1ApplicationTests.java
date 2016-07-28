package com.jaime.service1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jaime.service2.Service2Application;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Service2Application.class)
public class Service1ApplicationTests {

	@Test
	public void contextLoads() {
	}

}
