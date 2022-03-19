package com.OnlineTvMovie.TvMovie.entities.dto;

public class MovieDto {

	private int movieId;
	private String movieName;
	private String categoryName;
	private String explanation;
	
	public MovieDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MovieDto(int movieId, String movieName, String categoryName, String explanation) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.categoryName = categoryName;
		this.explanation = explanation;
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

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}


}
