package com.OnlineTvMovie.TvMovie.entities.dto;

public class Movie_CommentDto {

	private int movieId;
	private String movieName;
	private String movieComment;

	public Movie_CommentDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movie_CommentDto(int movieId, String movieName, String movieComment) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieComment = movieComment;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieComment() {
		return movieComment;
	}

	public void setMovieComment(String movieComment) {
		this.movieComment = movieComment;
	}

}
