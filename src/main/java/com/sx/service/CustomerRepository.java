package com.sx.service;

import com.sx.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    public Customer findByFirstName(String firstName);
}
