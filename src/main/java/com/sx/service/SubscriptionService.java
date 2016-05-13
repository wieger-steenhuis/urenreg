package com.sx.service;

import com.sx.models.Customer;
import com.sx.models.Subscription;
import com.sx.repositories.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscriptionService {

    @Autowired
    private SubscriptionRepository subscriptionRepository;

    public Subscription findByStartDate(String startDate){
        return this.subscriptionRepository.findByStartDate(startDate);
    }

    public List<Subscription> findByCustomer (Customer customer){
        return this.subscriptionRepository.findByCustomer(customer);
    }

    public Subscription save(Subscription subscription){
        return this.subscriptionRepository.save(subscription);
    }


}
