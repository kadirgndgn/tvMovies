package com.OnlineTvMovie.TvMovie.dataAccess;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.OnlineTvMovie.TvMovie.entities.concretes.Movie;
import com.OnlineTvMovie.TvMovie.entities.dto.MovieDto;
import com.OnlineTvMovie.TvMovie.entities.dto.Movie_CommentDto;

public interface MovieDao extends JpaRepository<Movie, Integer>{
	
	@Query("From Movie where movieName=:movieName")
	List<Movie> getByMovieName(String movieName);
	
	List<Movie> getByMovieNameStartsWith(String movieName);
	
	List<Movie> getByMovieNameContains(String movieName);
	
	@Query("Select new com.OnlineTvMovie.TvMovie.entities.dto.MovieDto(m.movieId, m.movieName, c.categoryName, m.explanation) from Category as c inner join c.movies m where m.movieName=:movieName")
	List<MovieDto> getByMovieAndCategoryDetails(String movieName);
	
	@Query("Select new com.OnlineTvMovie.TvMovie.entities.dto.Movie_CommentDto(m.movieId, m.movieName, c.movieComment) from Comments as c inner join c.movie as m where m.movieName=:movieName")
	List<Movie_CommentDto> getByMoviesComment(String movieName);
	
	@Query("Select new com.OnlineTvMovie.TvMovie.entities.dto.MovieDto(m.movieId, m.movieName, c.categoryName, m.explanation) from Category as c inner join c.movies m where c.categoryName=:categoryName")
	List<MovieDto> getByMovieCategoryNotes(String categoryName);
	
	//List<Movie> getByMovieNameDelete(String movieName);

}
