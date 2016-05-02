package com.sx.service;

import com.sx.models.Trainer;
import org.springframework.data.repository.CrudRepository;

public interface TrainerRepository extends CrudRepository<Trainer, Integer> {
    public Trainer findByFirstName(String firstName);
}
