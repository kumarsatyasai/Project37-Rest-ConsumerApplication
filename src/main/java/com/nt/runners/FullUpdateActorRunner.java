package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;


//@Component
public class FullUpdateActorRunner implements CommandLineRunner {
	
	@Autowired
	private RestTemplate template;

	@Override
	public void run(String... args) throws Exception {
		
		String baseURL = "http://localhost:4041/actor-api/fupdate";
		
		String jsonBody = "{\"actorId\":4,\"actorName\" : \"SatyaSaiApuroop\",\"actorAddrs\" : \"Chityala\",\"actorFee\":680000.0,\"actorLocation\":\"AndhraPradesh\",\"actorSoftSwitch\":\"active\" }";
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<String> entity = new HttpEntity(jsonBody, headers); 
		
		template.put(baseURL,entity);
		System.out.println("Actor Is Successfuly Upadated.");
				
		

		
	}

}
