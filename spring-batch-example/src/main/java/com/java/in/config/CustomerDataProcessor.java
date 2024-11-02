package com.java.in.config;

import org.springframework.batch.item.ItemProcessor;

import com.java.in.entity.Customer;

public class CustomerDataProcessor implements ItemProcessor<Customer, Customer> {

    @Override
    public Customer process(Customer customer) throws Exception {
        if(customer.getGender().equals("Male")) {
            return customer;
        }
        return null;
    }
}
