package com.sx.service;

import com.sx.models.Customer;

import java.util.ArrayList;
import java.util.List;

public class FakeCustomerDatabase {

    //Some fake Customer Data:
    private static List<Customer> customerDatabase;


    public FakeCustomerDatabase() {
        if (customerDatabase==null) {
            customerDatabase = new ArrayList<>();
            Customer c1 = new Customer();
            c1.setLastName("Wessel");
            Customer c2 = new Customer();
            c2.setLastName("Mark");
            Customer c3 = new Customer();
            c3.setLastName("Larisa");
            Customer c4 = new Customer();
            c4.setLastName("Sjoerd");
            Customer c5 = new Customer();
            c5.setLastName("Leandro");
            Customer c6 = new Customer();
            c6.setLastName("Aaron");
            customerDatabase.add(c1);
            customerDatabase.add(c2);
            customerDatabase.add(c3);
            customerDatabase.add(c4);
            customerDatabase.add(c5);
            customerDatabase.add(c6);

            int initId = 200000;
            for (Customer c : customerDatabase) {
                c.setFirstName("Customer");
                c.setId(++initId);
                c.seteMail(c.getFirstName() + c.getLastName() + "@gmail.com");
            }
        }
    }

    public List<Customer> findByName(String search) {
        List<Customer> searchResults = new ArrayList<>();
        for (Customer c : customerDatabase) {
            if (c.toString().toLowerCase().contains(search.toLowerCase())) searchResults.add(c);
        }
        System.out.println("Searched: " + search);
        System.out.println(searchResults);
        return searchResults;
    }

    public Customer findById(int id) {
        for (Customer c : customerDatabase) {
            if (c.getId() == id) return c;
        }
        return null;
    }
    public Customer save(Customer customer){
        for (int i = 0; i<customerDatabase.size();i++){
            if (customerDatabase.get(i).getId() == customer.getId()) {
                customerDatabase.set(1, customer);
                System.out.println("saved: "+customer);
                return customer;
            }
        }
        return null;
    }
}
