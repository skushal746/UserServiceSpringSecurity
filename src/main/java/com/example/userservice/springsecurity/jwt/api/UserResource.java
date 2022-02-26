package com.example.userservice.springsecurity.jwt.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.userservice.springsecurity.jwt.domain.User;
import com.example.userservice.springsecurity.jwt.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserResource {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> getUsers(){
		return ResponseEntity.ok().body(userService.getAllUsers());
	}
	
	@PostMapping("/user/save")
	public ResponseEntity<User> saveUser(@RequestBody User user){
		return ResponseEntity.ok().body(userService.saveUser(user));
	}
	
}
