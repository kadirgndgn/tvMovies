package com.OnlineTvMovie.TvMovie.business.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.OnlineTvMovie.TvMovie.business.abstracts.MovieService;
import com.OnlineTvMovie.TvMovie.dataAccess.MovieDao;
import com.OnlineTvMovie.TvMovie.entities.concretes.Movie;
import com.OnlineTvMovie.TvMovie.entities.dto.MovieDto;
import com.OnlineTvMovie.TvMovie.entities.dto.Movie_CommentDto;

@Service
public class MovieManager implements MovieService{
	
	@Autowired
	private MovieDao movieDao;
	
	@Override
	public List<Movie> getAll() {
		Optional<Movie> movies = Optional.empty();
		if(movies.isPresent()) {
			return null;
		}else {
			return this.movieDao.findAll();
		}
	}

	@Override
	public Movie add(Movie movie) {
		Optional<Movie> movies = Optional.empty();
		if(movies.isPresent()) {
			return null;
		}else {
			return this.movieDao.save(movie);
		}
		
	}

	@Override
	public List<Movie> getByMovieName(String movieName) {
		return this.movieDao.getByMovieName(movieName);
	}

	@Override
	public List<Movie> getByMovieNameStartsWith(String movieName) {
		return this.movieDao.getByMovieNameStartsWith(movieName);
	}

	public List<Movie> getByMovieNameContains(String movieName) {
		return this.movieDao.getByMovieNameContains(movieName);
	}

	@Override
	public List<Movie> getAllPage(int pageNumber, int pageSize) {
		Pageable pageable = PageRequest.of(pageNumber, pageSize);
		return this.movieDao.findAll(pageable).getContent();
	}

	public List<MovieDto> getByMovieAndCategoryDetails(String movieName) {
		return this.movieDao.getByMovieAndCategoryDetails(movieName);
	}

	@Override
	public List<Movie_CommentDto> getByMoviesComment(String movieName) {
		Optional<List<Movie_CommentDto>> dto = Optional.empty();
		if(dto.isPresent()) {
			return null;
		}else {
			return this.movieDao.getByMoviesComment(movieName);
		}
		
	}

	@Override
	public List<MovieDto> getByMovieCategoryNotes(String categoryName) {
		return this.movieDao.getByMovieCategoryNotes(categoryName);
	}
	
}
