package com.OnlineTvMovie.TvMovie.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "comment")
public class Comments {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "comment_id")
	private int commentId;

	@Column(name = "movie_comment")
	private String movieComment;
	
	@ManyToOne()
	@JoinColumn(name = "movie_id")
	private Movie movie;
	
	@ManyToOne()
	@JoinColumn(name = "user_id")
	private User user;

	public Comments() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Comments(int commentId,  String movieComment) {
		super();
		this.commentId = commentId;
		this.movieComment = movieComment;
	}

	public int getCommentId() {
		return commentId;
	}

	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}

	public String getComment() {
		return movieComment;
	}

	public void setComment(String movieComment) {
		this.movieComment = movieComment;
	}

}
