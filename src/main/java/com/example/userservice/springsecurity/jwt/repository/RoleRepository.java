package com.example.userservice.springsecurity.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.userservice.springsecurity.jwt.domain.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Role findByName(String name);
}
