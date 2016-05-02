package com.sx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;
/*
    public List<Customer> findAll() {
        return this.customerRepository.f();
    }

    public void add(final Customer customer) {
        this.customerRepository.add(customer);
    }
*/
}