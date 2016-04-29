package com.sx.service;

import com.sx.models.Trainer;

import java.util.List;


public class TrainerService {
    private FakeTrainerDatabase trainerRepository = new FakeTrainerDatabase();

    public List<Trainer> findByName(String search){
        return trainerRepository.findByName(search);
    }

    public Trainer findById(int id) {
        return trainerRepository.findById(id);
    }
    public Trainer save(Trainer trainer) {
        return trainerRepository.save(trainer);
    }
}


