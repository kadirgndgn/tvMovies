package com.OnlineTvMovie.TvMovie.entities.dto;

public class User_CommentDto {

	private int userId;
	private int commentId;
	private String userName;
	private String movieComment;

	public User_CommentDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User_CommentDto(int userId, int commentId, String userName, String movieComment) {
		super();
		this.userId = userId;
		this.commentId = commentId;
		this.userName = userName;
		this.movieComment = movieComment;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getCommentId() {
		return commentId;
	}

	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMovieComment() {
		return movieComment;
	}

	public void setMovieComment(String movieComment) {
		this.movieComment = movieComment;
	}

}
