package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


//@Component
public class PartialUpdateActorRunner implements CommandLineRunner {
	
	@Autowired
	private RestTemplate template;

	@Override
	public void run(String... args) throws Exception {
		
		String baseURL = "http://localhost:4041/actor-api/pupdate/{id}/{name}";
		//One Jar We Have To Add Because ByDefault Patch Is Not Recognizing. 
		template.setRequestFactory(new HttpComponentsClientHttpRequestFactory());
		String result = template.patchForObject(baseURL,null,String.class,1,"Prabhas");
		System.out.println(result);
		

		
	}

}
