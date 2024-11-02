package com.java.in.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.in.entity.Location;

public interface LocationRepository extends JpaRepository<Location,Integer> {
}
