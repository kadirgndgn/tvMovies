package com.OnlineTvMovie.TvMovie.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "movies")
public class Movie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "movies_id")
	private int movieId;
	
	@Column(name = "movies_name")
	private String movieName;
	
	@Column(name = "explanation")
	private String explanation;
	
	@Column(name = "actor_actress")
	private String actorActress;

	@Column(name = "episode")
	private String episode;
	
	@ManyToOne()
	@JoinColumn(name = "category_id")
	private Category category;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	@OneToMany(mappedBy = "movie")
	private List<Comments> comments;
	
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movie(int movieId, String movieName, String explanation, String actorActress, String episode
			) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.explanation = explanation;
		this.actorActress = actorActress;
		this.episode = episode;
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

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	public String getActorActress() {
		return actorActress;
	}

	public void setActorActress(String actorActress) {
		this.actorActress = actorActress;
	}

	public String getEpisode() {
		return episode;
	}

	public void setEpisode(String episode) {
		this.episode = episode;
	}

}
