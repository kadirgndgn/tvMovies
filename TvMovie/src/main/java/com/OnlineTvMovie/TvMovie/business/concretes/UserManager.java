package com.OnlineTvMovie.TvMovie.business.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.OnlineTvMovie.TvMovie.business.abstracts.UserService;
import com.OnlineTvMovie.TvMovie.dataAccess.UserDao;
import com.OnlineTvMovie.TvMovie.entities.concretes.User;
import com.OnlineTvMovie.TvMovie.entities.dto.User_CommentDto;
import com.OnlineTvMovie.TvMovie.entities.dto.User_MovieDto;

@Service
public class UserManager implements UserService{

	private UserDao userDao;

	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public List<User> getAll() {
		Optional<List<User>> users = Optional.empty();
		if(users.isPresent()) {
			return null;
		}else {
			return this.userDao.findAll();
		}
	}

	@Override
	public User add(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User deleteById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User_MovieDto> getAllUserAndMovie(String userName) {
		return this.userDao.getAllUserAndMovie(userName);
	}

	@Override
	public List<User_CommentDto> getByUserAndComment(String userName) {
		Optional<List<User_CommentDto>> userCommentDto = Optional.empty();
		if(userCommentDto.isPresent()) {
			return null;
		}else {
			return this.userDao.getByUserAndComment(userName);
		}
		
	}

	@Override
	public List<User> getByUserName(String userName) {
		Optional<List<User>> user = Optional.empty();
		if(user.isPresent()) {
			return null;
		}else {
			return this.userDao.getByUserName(userName);
		}
		
	}

	@Override
	public List<User> getByUserNameStartsWith(String userName) {
		Optional<List<User>> startsWith = Optional.empty();
		if(startsWith.isPresent()) {
			return null;
		}else {
			return this.userDao.getByUserNameStartsWith(userName);
		}
	}

	@Override
	public List<User> getAllPageable(int pageNumber, int pageSize) {
		Pageable pageable = PageRequest.of(pageNumber, pageSize);
		return this.userDao.findAll(pageable).getContent();
		
	}
	
	
}
