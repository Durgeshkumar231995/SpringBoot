package com.java.in.service;

import org.springframework.stereotype.Service;

import com.java.in.entity.Product;

@Service
public class ProductCopyService {


    public Product doSomething(Product product){
        return product;
    }
}
