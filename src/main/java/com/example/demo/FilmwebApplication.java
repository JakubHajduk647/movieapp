package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class FilmwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilmwebApplication.class, args);
		
	}
	@Value("${api.root}")
	private String apiRoot;
	@Value("${api.token}")
	private String apiToken;
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplateBuilder().rootUri(apiRoot)
										.defaultHeader("Authorization", "Bearer "+apiToken)
										.build();
		
	}
}
