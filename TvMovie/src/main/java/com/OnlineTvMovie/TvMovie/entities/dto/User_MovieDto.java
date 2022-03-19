package com.OnlineTvMovie.TvMovie.entities.dto;

public class User_MovieDto {
	
	private int movieId;
	private int userId;
	private String movieName;
	private String userName;
	public User_MovieDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User_MovieDto(int movieId, int userId, String movieName, String userName) {
		super();
		this.movieId = movieId;
		this.userId = userId;
		this.movieName = movieName;
		this.userName = userName;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
