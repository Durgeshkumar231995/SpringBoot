package com.java.in.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.in.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment,Integer> {
    Payment findByOrderId(String orderId);

}
