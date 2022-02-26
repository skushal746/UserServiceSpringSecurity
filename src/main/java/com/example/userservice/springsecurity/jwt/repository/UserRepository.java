package com.example.userservice.springsecurity.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.userservice.springsecurity.jwt.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{
	User findByUserName(String userName);
}
