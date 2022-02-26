package com.example.userservice.springsecurity.jwt;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.userservice.springsecurity.jwt.domain.Role;
import com.example.userservice.springsecurity.jwt.domain.User;
import com.example.userservice.springsecurity.jwt.service.RoleService;
import com.example.userservice.springsecurity.jwt.service.UserService;

@SpringBootApplication
public class UserServiceSpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceSpringSecurityApplication.class, args);
	}

	@Bean
	CommandLineRunner run(UserService userService,  RoleService roleService) {
		return args -> {
			System.out.println("Application start up code getting executed");
			roleService.saveRole(new Role(null, "ROLE_USER"));
			roleService.saveRole(new Role(null, "ROLE_MANAGER"));
			roleService.saveRole(new Role(null, "ROLE_ADMIN"));
			roleService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));
			
			userService.saveUser(new User(null, "Kushal Sharma", "skushal746", "12345", new ArrayList<>()));
			userService.saveUser(new User(null, "Suraj Mishra", "smsuraj100", "12345", new ArrayList<>()));
			userService.saveUser(new User(null, "Laxminarayan Sharma", "sharmalaxminarayan22", "12345", new ArrayList<>()));
			userService.saveUser(new User(null, "Alexandra Daddario", "alexa", "12345", new ArrayList<>()));
			
			userService.addRoleToUser("skushal746", "ROLE_USER");
			userService.addRoleToUser("skushal746", "ROLE_MANAGER");
			userService.addRoleToUser("skushal746", "ROLE_ADMIN");
			userService.addRoleToUser("smsuraj100", "ROLE_USER");
			userService.addRoleToUser("sharmalaxminarayan22", "ROLE_USER");
			userService.addRoleToUser("sharmalaxminarayan22", "ROLE_MANAGER");
			userService.addRoleToUser("alexa", "ROLE_USER");
			userService.addRoleToUser("alexa", "ROLE_SUPER_ADMIN");
			
			
		};
	}
	
}
