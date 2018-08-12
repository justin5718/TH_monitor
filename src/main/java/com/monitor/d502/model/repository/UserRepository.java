package com.monitor.d502.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.monitor.d502.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
 
}
