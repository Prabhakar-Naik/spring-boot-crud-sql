package com.springboot.productservice.customer.controller;

import com.springboot.productservice.customer.model.Customer;
import com.springboot.productservice.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    private CustomerRepository repository;

    @PostMapping(value = "/create")
    public ResponseEntity<?> create(@RequestBody Customer customer){
        this.repository.save(customer);
        return ResponseEntity.ok("Success");
    }


}

