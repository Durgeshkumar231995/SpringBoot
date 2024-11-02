package com.java.in.repository;

import org.springframework.data.repository.CrudRepository;

import com.java.in.hash.Customer;

import java.io.Serializable;

public interface CustomerRepository extends CrudRepository<Customer,Integer> {
}
