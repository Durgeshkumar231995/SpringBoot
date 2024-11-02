package com.java.in.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.in.entity.Engineer;

public interface EngineerRepository extends JpaRepository<Engineer,Integer> {
}
