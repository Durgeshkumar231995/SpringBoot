package com.java.in.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.in.entity.Employee;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    Optional<Employee> findByUserName(String username);
}
