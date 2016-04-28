package com.sx.service;

import com.sx.models.Customer;
import java.util.List;


public class CustomerService {
    private FakeCustomerDatabase customerRepository = new FakeCustomerDatabase();

    public List<Customer> findByName(String search) {
        return customerRepository.findByName(search);
    }

    public Customer findById(int id) {
        return customerRepository.findById(id);
    }
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }
}
