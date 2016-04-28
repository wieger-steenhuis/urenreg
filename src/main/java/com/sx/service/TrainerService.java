package com.sx.service;

import com.sx.models.Trainer;

import java.util.List;


public class TrainerService {
    private FakeTrainerDatabase trainerRepository = new FakeTrainerDatabase();

    public List<Trainer> findByName(String search){
        return trainerRepository.findByName(search);
    }
}
