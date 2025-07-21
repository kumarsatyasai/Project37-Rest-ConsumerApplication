package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


//@Component
public class DeleteActorRunner implements CommandLineRunner {
	
	@Autowired
	private RestTemplate template;

	@Override
	public void run(String... args) throws Exception {
		
		String baseURL = "http://localhost:4041/actor-api/delete/{id}";
	    template.delete(baseURL,4);
		System.out.println("Actor Get Deleted");
		

		
	}

}
