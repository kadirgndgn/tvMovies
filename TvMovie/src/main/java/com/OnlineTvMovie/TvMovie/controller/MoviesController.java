package com.OnlineTvMovie.TvMovie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.OnlineTvMovie.TvMovie.business.abstracts.MovieService;
import com.OnlineTvMovie.TvMovie.entities.concretes.Movie;
import com.OnlineTvMovie.TvMovie.entities.dto.MovieDto;
import com.OnlineTvMovie.TvMovie.entities.dto.Movie_CommentDto;

@RestController
@RequestMapping("/movie")
public class MoviesController {
	
	private MovieService movieService;
	
	@Autowired
	public MoviesController(MovieService movieService) {
		super();
		this.movieService = movieService;
	}


	@GetMapping("/getAll")
	public ResponseEntity<List<Movie>> getAll() {
		return ResponseEntity.ok(this.movieService.getAll());
	}
	
	@GetMapping("/getByMovieName")
	public ResponseEntity<List<Movie>> getByMovieName(@RequestParam String movieName) {
		return ResponseEntity.ok(this.movieService.getByMovieName(movieName));
	}
	
	@GetMapping("/getByMovieNameStartsWith")
	public ResponseEntity<List<Movie>> getByMovieNameStartsWith(@RequestParam String movieName) {
		return ResponseEntity.ok(this.movieService.getByMovieNameStartsWith(movieName));
	}
	
	@GetMapping("/getByMovieNameContains")
	public ResponseEntity<List<Movie>> getByMovieNameContains(@RequestParam String movieName) {
		return ResponseEntity.ok(this.movieService.getByMovieNameContains(movieName));
	}
	
	@GetMapping("/getByMovieNamePageable")
	public ResponseEntity<List<Movie>> getAllPage(int pageNumber, int pageSize) {
		return ResponseEntity.ok(this.movieService.getAllPage(pageNumber, pageSize));
	}
	
	@GetMapping("/getByMovieNameAndCategoryDetails")
	public List<MovieDto> getByMovieAndCategoryDetails(@RequestParam String movieName) {
		return this.movieService.getByMovieAndCategoryDetails(movieName);
	}

	@GetMapping("/getByMovieToCategory")
	public ResponseEntity<List<MovieDto>> getByMovieNotes(@RequestParam String categoryName) {
		return ResponseEntity.ok(this.movieService.getByMovieCategoryNotes(categoryName));
	}
	
	@GetMapping("/getByMoviesComment")
	public ResponseEntity<List<Movie_CommentDto>> getByMoviesComment(@RequestParam String movieName) {
		return ResponseEntity.ok(this.movieService.getByMoviesComment(movieName));
	}
	
	@PostMapping("/add")
	public ResponseEntity<Movie> add(@RequestBody Movie movie) {
		return ResponseEntity.ok(this.movieService.add(movie));
	}
	

	
}
