package com.sx.service;

import com.sx.models.Customer;
import com.sx.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> searchNames(String firstName, String lastName){
        return this.customerRepository.findByFirstNameOrLastNameContainingOrderByFirstNameAsc(firstName, lastName);
    }

    public Customer save(Customer customer){
        return this.customerRepository.save(customer);
    }

    public Customer findOne(int id){
        return this.customerRepository.findOne(id);
    }
}