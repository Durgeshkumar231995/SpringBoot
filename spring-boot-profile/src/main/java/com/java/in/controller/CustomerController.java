package com.java.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.java.in.dto.CustomerDto;
import com.java.in.entity.Customer;
import com.java.in.service.CustomerService;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @PostMapping
    public List<Customer> saveCustomers(@RequestBody List<Customer> customers) {
        return service.addNewCustomers(customers);
    }

    @GetMapping
    public List<CustomerDto> fetchAllCustomers() {
        return service.getCustomers();
    }
}
