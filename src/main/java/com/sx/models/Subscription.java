package com.sx.models;

import javax.persistence.*;


@Entity
//@Table(name="subscription") //don't need this, table name is equal to entity class...
public class Subscription {

    @Id
    //@Column(name="id") //don't need this, table name is equal to entity class...
    @GeneratedValue(strategy = GenerationType.AUTO) //Auto increment
    private int id;
    private String startDate;
    @ManyToOne
    private Customer customer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "Abonnement "+this.getId() +
                ", start datum'" + startDate;
    }
}