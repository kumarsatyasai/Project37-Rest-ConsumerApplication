package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class SaveActorRunner implements CommandLineRunner {
	
	@Autowired
	private RestTemplate template;

	@Override
	public void run(String... args) throws Exception {
		
		String baseURL = "http://localhost:4041/actor-api/save";
		
		String jsonBody = "{\"actorName\" : \"Jr.Ntr\",\"actorAddrs\" : \"Nandyala-Colony\",\"actorFee\":7800.0,\"actorLocation\":\"Hyderbad\",\"actorSoftSwitch\":\"active\" }";
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<String> entity = new HttpEntity(jsonBody, headers);
		
		ResponseEntity<String> response = template.postForEntity(baseURL,entity,String.class);
		System.out.println(response.getBody());
		

		
	}

}
