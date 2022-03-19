package com.OnlineTvMovie.TvMovie.business.abstracts;

import java.util.List;

import com.OnlineTvMovie.TvMovie.entities.concretes.Movie;
import com.OnlineTvMovie.TvMovie.entities.dto.MovieDto;
import com.OnlineTvMovie.TvMovie.entities.dto.Movie_CommentDto;

public interface MovieService {
	
	Movie add(Movie movie);
	
	List<Movie> getByMovieName(String movieName);
	List<Movie> getByMovieNameStartsWith(String movieName);
	List<Movie> getByMovieNameContains(String movieName);
	List<MovieDto> getByMovieAndCategoryDetails(String movieName);
	List<MovieDto> getByMovieCategoryNotes(String categoryName);
	List<Movie_CommentDto> getByMoviesComment(String movieName);
	
	List<Movie> getAll();
	List<Movie> getAllPage(int pageNumber, int pageSize);
	
}
