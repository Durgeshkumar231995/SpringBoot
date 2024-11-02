package com.java.in.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.in.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
}
