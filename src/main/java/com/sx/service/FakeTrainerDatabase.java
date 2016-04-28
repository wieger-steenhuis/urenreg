package com.sx.service;

import com.sx.models.Trainer;

import java.util.ArrayList;
import java.util.List;


public class FakeTrainerDatabase {

    //Some fake Trainer Data:
    private List<Trainer> trainerDatabase;

    public FakeTrainerDatabase(){
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

        int initId = 100000;
        for (Trainer t : trainerDatabase){
            t.setFirstName("Trainer");
            t.setId(++initId);
            t.seteMail(t.getFirstName()+t.getLastName()+"@sxsportsclub.nl");
        }
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
}
