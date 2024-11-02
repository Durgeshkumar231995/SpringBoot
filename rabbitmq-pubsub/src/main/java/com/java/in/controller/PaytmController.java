package com.java.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.in.dto.PaymentRequest;
import com.java.in.publisher.PaytmPublisher;

@RestController
public class PaytmController {

    @Autowired
    private PaytmPublisher publisher;

    @PostMapping("/mq/pay")
    public String payUsingUPI(@RequestBody PaymentRequest request) {
        publisher.doPaymentTransaction(request);
        return "payment request in process !!";
    }
}
