package com.example.demo.controller;


import java.net.URI;
import java.net.http.HttpHeaders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.movie.Movie;

@RestController
@RequestMapping("/movie")
public class MovieController {
	

	
	@Autowired
	private RestTemplate restTemplate;
	
	private String uri = "/movie";
private HttpEntity<String> entity;
	
	
	
	
	@GetMapping("/{movieId}")
	public ResponseEntity<Movie> getMovieByID(@PathVariable("movieId")String movieId){
	
		ResponseEntity<Movie> response = restTemplate.exchange(uri+"/"+movieId,HttpMethod.GET,entity,Movie.class);
			 	if(response.getStatusCode().equals(HttpStatus.OK)) {
			 		return ResponseEntity.ok(response.getBody());
			 	}else{
			 		return ResponseEntity.notFound().build();
			 	}
			 	
	
		
	}
	//restTemplate.getForObject("https://api.themoviedb.org/3/movie/550",Movie.class, params).getU
	
}
