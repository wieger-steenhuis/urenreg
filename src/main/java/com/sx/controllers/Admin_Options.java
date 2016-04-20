/*
* class Admin_Options contains the options for admin tasks
* tasks have an option name and a html target
* AdminHomeController redirects to this specific target
* Adding extra tasks is easy to implement: just add an extra enum constant with an option description and html target
* */

package com.sx.controllers;

enum Admin_Options {

    //TASKS:
    TRAINER("Trainer toevoegen of wijzigen", "/edit_trainer"),
    CUSTOMER("Klant toevoegen of wijzigen", "/edit_customer"),
    SUBSCRIPTION("Abonnement aanmaken of wijzigen", "/edit_subscription");

    private String option;
    private String htmltarget;

    //contructor (implicitly private):
    Admin_Options(String option, String htmltarget){
        this.option = option;
        this.htmltarget = htmltarget;
    }

    //getters & setters
    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public String getHtmltarget() {
        return htmltarget;
    }

    public void setHtmltarget(String htmltarget) {
        this.htmltarget = htmltarget;
    }
}

