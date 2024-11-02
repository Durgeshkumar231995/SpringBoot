package com.java.in.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.in.entity.Payment;
import com.java.in.repository.PaymentRepository;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository repository;

    public Payment getByOrderId(String orderId) {
        return repository.findByOrderId(orderId);
    }
}
