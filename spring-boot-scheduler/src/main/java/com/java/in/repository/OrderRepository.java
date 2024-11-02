package com.java.in.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.in.model.Order;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
