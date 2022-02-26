package com.example.userservice.springsecurity.jwt.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.userservice.springsecurity.jwt.domain.Role;
import com.example.userservice.springsecurity.jwt.domain.User;
import com.example.userservice.springsecurity.jwt.repository.RoleRepository;
import com.example.userservice.springsecurity.jwt.repository.UserRepository;
import com.example.userservice.springsecurity.jwt.service.UserService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class UserServiceImpl implements UserService {

	private UserRepository userRepository;
	private RoleRepository roleRepository;
	
	@Override
	public User saveUser(User user) {
		log.info("Saving a user {} to the the database", user.getUserName());
		return userRepository.save(user);
	}

	@Override
	public void addRoleToUser(String userName, String roleName) {
		log.info("Adding role {} to user {}", roleName, userName);
		User user = userRepository.findByUserName(userName);
		Role role = roleRepository.findByName(roleName);
		user.getRoles().add(role);
		/*
		 * Save is not required, due to @Transactional annotation.
		 */
	}

	@Override
	public User getUser(String userName) {
		log.info("Fetching user {}", userName);
		return userRepository.findByUserName(userName); 
	}

	@Override
	public List<User> getAllUsers() {
		log.info("Fetching all Users");
		return userRepository.findAll();
	}

}
