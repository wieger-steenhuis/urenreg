package com.sx.models;

public class Person {

    private String firstName;
    private String lastName;
    private String phoneNr;
    private String pin;
    private String eMail;

    private boolean isTrainer;
    private boolean isCustomer;

    private int hoursWorked;
    private int hoursBalance;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNr() {
        return phoneNr;
    }

    public void setPhoneNr(String phoneNr) {
        this.phoneNr = phoneNr;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public boolean isTrainer() {
        return isTrainer;
    }

    public void setTrainer(boolean trainer) {
        isTrainer = trainer;
    }

    public boolean isCustomer() {
        return isCustomer;
    }

    public void setCustomer(boolean customer) {
        isCustomer = customer;
    }

    public int getHoursWorked() {
        if (this.isCustomer()) return -1;
        else return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getHoursBalance() {
        if (this.isTrainer()) return -1;
        else return hoursBalance;
    }

    public void setHoursBalance(int hoursBalance) {
        this.hoursBalance = hoursBalance;
    }
}
