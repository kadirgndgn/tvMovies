package com.OnlineTvMovie.TvMovie.dataAccess;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.OnlineTvMovie.TvMovie.entities.concretes.User;
import com.OnlineTvMovie.TvMovie.entities.dto.User_CommentDto;
import com.OnlineTvMovie.TvMovie.entities.dto.User_MovieDto;

public interface UserDao extends JpaRepository<User, Integer>{
	
	@Query("Select new com.OnlineTvMovie.TvMovie.entities.dto.User_MovieDto(m.movieId, u.userId, m.movieName, u.userName) from User as u inner join u.movies as m where u.userName=:userName")
	List<User_MovieDto> getAllUserAndMovie(String userName);
	
	@Query("Select new com.OnlineTvMovie.TvMovie.entities.dto.User_CommentDto(u.userId, c.commentId, u.userName, c.movieComment) from User as u inner join u.comments as c where u.userName=:userName")
	List<User_CommentDto> getByUserAndComment(String userName);

	@Query("From User where userName=:userName")
	List<User> getByUserName(String userName);
	
	List<User> getByUserNameStartsWith(String userName);
	
	
	
}
