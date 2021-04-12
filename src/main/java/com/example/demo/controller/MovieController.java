package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.movie.Credits;
import com.example.demo.model.movie.Movie;
import com.example.demo.model.movie.Review;
import com.example.demo.model.result.ResultPage;

@RestController
@RequestMapping("/movie")
public class MovieController {
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/{movieId}")
	public ResponseEntity<Movie> getMovieByID(@PathVariable("movieId") String movieId) {

		ResponseEntity<Movie> response = restTemplate.getForEntity("/movie/" + movieId, Movie.class);
		if (response.getStatusCode().equals(HttpStatus.OK)) {
			return ResponseEntity.ok(response.getBody());
		} else {
			return ResponseEntity.notFound().build();
		}

	}
	@GetMapping("/{movieId}/credits")
	public ResponseEntity<Credits> getMovieCredits(@PathVariable("movieId") String movieId) {

		ResponseEntity<Credits> response = restTemplate.getForEntity("/movie/" + movieId +"/credits", Credits.class);
		if (response.getStatusCode().equals(HttpStatus.OK)) {
			return ResponseEntity.ok(response.getBody());
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	@GetMapping("/popular")
	public ResponseEntity<ResultPage<Movie>> getMoviePopularMovies() {

		ResponseEntity<ResultPage> response = restTemplate.getForEntity("/movie/popular", ResultPage.class);
		if (response.getStatusCode().equals(HttpStatus.OK)) {
			return ResponseEntity.ok(response.getBody());
		} else {
			return ResponseEntity.notFound().build();
		}

	}
	@GetMapping("/{movieId}/reviews")
	public ResponseEntity<ResultPage<Review>> getMovieReview(@PathVariable("movieId") String movieId) {

		ResponseEntity<ResultPage> response = restTemplate.getForEntity("/movie/" + movieId +"/reviews", ResultPage.class);
		if (response.getStatusCode().equals(HttpStatus.OK)) {
			return ResponseEntity.ok(response.getBody());
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	/*
	 * @GetMapping("{movieId}/watch/providers") public
	 * ResponseEntity<ResultPage<Movie>>
	 * getMovieWatchProviders(@PathVariable("movieId") String movieId) {
	 * 
	 * ResponseEntity<ResultPage> response = restTemplate.getForEntity("/movie/" +
	 * movieId + "/watch/providers", ResultPage.class); if
	 * (response.getStatusCode().equals(HttpStatus.OK)) { return
	 * ResponseEntity.ok(response.getBody()); } else { return
	 * ResponseEntity.notFound().build(); }
	 * 
	 * }
	 */

}
