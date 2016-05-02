package com.sx.service;

import com.sx.models.Subscription;
import org.springframework.data.repository.CrudRepository;

public interface SubscriptionRepository extends CrudRepository<Subscription, Integer> {
    public Subscription findByStartDate(String startDate);
}
