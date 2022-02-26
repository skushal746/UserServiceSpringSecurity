package com.example.userservice.springsecurity.jwt.service;

import java.util.List;

import com.example.userservice.springsecurity.jwt.domain.User;

public interface UserService {
	User saveUser(User user);
	void addRoleToUser(String userName, String roleName);
	User getUser(String userName);
	List<User> getAllUsers();
}
