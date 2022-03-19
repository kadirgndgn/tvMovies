package com.OnlineTvMovie.TvMovie.business.abstracts;

import java.util.List;

import com.OnlineTvMovie.TvMovie.entities.concretes.User;
import com.OnlineTvMovie.TvMovie.entities.dto.User_CommentDto;
import com.OnlineTvMovie.TvMovie.entities.dto.User_MovieDto;

public interface UserService {
	
	List<User> getAll();
	User add(User user);
	User deleteById(int id);
	List<User> getAllPageable(int pageNumber, int pageSize);
	
	List<User_MovieDto> getAllUserAndMovie(String userName);
	List<User_CommentDto> getByUserAndComment(String userName);
	
	List<User> getByUserName(String userName);
	List<User> getByUserNameStartsWith(String userName);
	

}
