package com.example.userservice.springsecurity.jwt.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.userservice.springsecurity.jwt.domain.Role;
import com.example.userservice.springsecurity.jwt.service.RoleService;

@RestController
@RequestMapping("/api")
public class RoleResource {

	@Autowired
	private RoleService roleService;
	
	@PostMapping("/role/save")
	public ResponseEntity<Role> saveRole(@RequestBody Role role){
		return ResponseEntity.ok().body(roleService.saveRole(role));
	}
	
}
