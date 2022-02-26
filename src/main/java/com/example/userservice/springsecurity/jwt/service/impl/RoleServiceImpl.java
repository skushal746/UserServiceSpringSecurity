package com.example.userservice.springsecurity.jwt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.userservice.springsecurity.jwt.domain.Role;
import com.example.userservice.springsecurity.jwt.repository.RoleRepository;
import com.example.userservice.springsecurity.jwt.service.RoleService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class RoleServiceImpl implements RoleService{

	@Autowired
	private RoleRepository roleRepository;

	@Override
	public Role saveRole(Role role) {
		log.info("Saving a role {} to the the database", role.getName());
		return roleRepository.save(role);
	}	
}
