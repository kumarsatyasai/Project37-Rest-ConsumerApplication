package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.boot.CommandLineRunner; 
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


//@Component
public class SelectActorRunner implements CommandLineRunner {
	
	@Autowired
	private RestTemplate template;

	@Override
	public void run(String... args) throws Exception {
		
		String baseURL = "http://localhost:4041/actor-api/select";
		
		String msg = template.getForObject(baseURL, String.class);//getForEntity() instead getForObject.
		System.out.println(msg);
		

		
	}

}
