package com.OnlineTvMovie.TvMovie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.OnlineTvMovie.TvMovie.business.abstracts.UserService;
import com.OnlineTvMovie.TvMovie.entities.concretes.User;
import com.OnlineTvMovie.TvMovie.entities.dto.User_CommentDto;
import com.OnlineTvMovie.TvMovie.entities.dto.User_MovieDto;

@RestController
@RequestMapping("/users")
public class UsersController {
	
	private UserService userService;

	@Autowired
	public UsersController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<User>> getAll() {
		return ResponseEntity.ok(this.userService.getAll());
	}
	
	@GetMapping("/getAllUserAndMovie")
	public ResponseEntity<List<User_MovieDto>> getAllUserAndMovie(@RequestParam String userName) {
		return ResponseEntity.ok(this.userService.getAllUserAndMovie(userName));
	}
	
	@GetMapping("/getByUserAndComment")
	public ResponseEntity<List<User_CommentDto>> getByUserAndComment(@RequestParam String userName) {
		return ResponseEntity.ok(this.userService.getByUserAndComment(userName));
	}
	
	@GetMapping("/getByUserName")
	public ResponseEntity<List<User>> getByUserName(@RequestParam String userName) {
		return ResponseEntity.ok(this.userService.getByUserName(userName));
	}
	
	@GetMapping("/getByUserNameStartsWith")
	public ResponseEntity<List<User>> getByUserNameStartsWith(@RequestParam String userName) {
		return ResponseEntity.ok(this.userService.getByUserNameStartsWith(userName));
	}

	@GetMapping("/getAllPageable")
	public ResponseEntity<List<User>> getAllPageable(@RequestParam int pageNumber, @RequestParam int pageSize) {
		return ResponseEntity.ok(this.userService.getAllPageable(pageNumber, pageSize));
	}
	
}
