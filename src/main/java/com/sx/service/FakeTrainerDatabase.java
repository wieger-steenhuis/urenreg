package com.sx.service;

import com.sx.models.Trainer;

import java.util.ArrayList;
import java.util.List;


public class FakeTrainerDatabase {

    //Some fake Trainer Data:
    private static List<Trainer> trainerDatabase;
    private static int initId;

    public FakeTrainerDatabase() {
        if (trainerDatabase == null) {
            trainerDatabase = new ArrayList<>();
            Trainer t1 = new Trainer();
            t1.setLastName("Henk");
            Trainer t2 = new Trainer();
            t2.setLastName("Harry");
            Trainer t3 = new Trainer();
            t3.setLastName("Richard");
            Trainer t4 = new Trainer();
            t4.setLastName("Tessa");
            Trainer t5 = new Trainer();
            t5.setLastName("Erwin");
            Trainer t6 = new Trainer();
            t6.setLastName("Judith");
            Trainer t7 = new Trainer();
            t7.setLastName("Mike");
            Trainer t8 = new Trainer();
            t8.setLastName("Abdullah");
            trainerDatabase.add(t1);
            trainerDatabase.add(t2);
            trainerDatabase.add(t3);
            trainerDatabase.add(t4);
            trainerDatabase.add(t5);
            trainerDatabase.add(t6);
            trainerDatabase.add(t7);
            trainerDatabase.add(t8);

            initId = 100000;
            for (Trainer t : trainerDatabase) {
                t.setFirstName("Trainer");
                t.setId(++initId);
                t.seteMail(t.getFirstName() + t.getLastName() + "@sxsportsclub.nl");
            }
        }
    }

    private void setInitId(Trainer t){
        t.setId(++initId);
    }

    public List<Trainer> findByName(String search){
        List<Trainer>searchResults = new ArrayList<>();
        for (Trainer t : trainerDatabase){
            if (t.toString().toLowerCase().contains(search.toLowerCase())) searchResults.add(t);
        }
        System.out.println("Searched: "+search);
        System.out.println(searchResults);
        return searchResults;
    }

    public Trainer findById(int id) {
        for (Trainer t : trainerDatabase) {
            if (t.getId() == id) return t;
        }
        return null;
    }
    public Trainer save(Trainer trainer){
        for (int i = 0; i<trainerDatabase.size();i++){
            if (trainerDatabase.get(i).getId() == trainer.getId()) {
                trainerDatabase.set(i, trainer);
                System.out.println("saved: "+trainer);
                return trainer;
            }
        }
        setInitId(trainer);
        trainerDatabase.add(trainer);
        System.out.println(trainer.getId());
        return trainer;
    }
}
