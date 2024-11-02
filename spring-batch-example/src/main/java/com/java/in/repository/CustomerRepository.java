package com.java.in.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.in.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
