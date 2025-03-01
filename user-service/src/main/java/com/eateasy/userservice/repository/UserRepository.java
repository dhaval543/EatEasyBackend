package com.eateasy.userservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.eateasy.userservice.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
