package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.h2.server.web.WebServlet;

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
		return new RestTemplateBuilder().defaultHeader("Authorization", "Bearer "+apiToken)
									  	.rootUri(apiRoot)
									  	.build();
	}
	@Bean
    ServletRegistrationBean h2servletRegistration(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean( new WebServlet());
        registrationBean.addUrlMappings("/console/*");
        return registrationBean;
	}

	

}
