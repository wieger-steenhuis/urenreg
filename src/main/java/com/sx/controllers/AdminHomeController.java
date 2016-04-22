/*
* Controller class for admin_home.html
* Spring Controller maps URLs with RequestMapping annotations
* html target is returned as a String
* uses Spring Model to add attributes to a view and to bind objects from a view to a java class using thymeleaf
**/

package com.sx.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;
import java.util.List;

@Controller
public class AdminHomeController {

    //Enum Admin_Options contains different admin tasks to chose from
    //each constant contains a discriptopn (to select in our views) and a specific html target to redirect to
    private enum Admin_Options {

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

    //controller uses enum values in a List
    //.values() returns an array of all enum values
    private List<Admin_Options>options = Arrays.asList(Admin_Options.values());

    //getter & setter:
    public List<Admin_Options> getOptions() {
        return options;
    }

    public void setOptions(List<Admin_Options> options) {
        this.options = options;
    }


    //log in form uses th:action="@{/adminhome}" in thymeleaf
    //when this url is requested admin_home.html will be shown
    //admin_home is loaded with java object(s) through model.addAttributes("String identiefier", object)
    //in this case the admin tasks(enum) are loaded in our view
    @RequestMapping("/adminhome")
    public String adminhome(Model model){
        model.addAttribute("admin_opts", options);
        return "/admin_home";
    }

    //the form on admin_home uses th:action="@{/adminopts}" in thymeleaf
    //this form sends user input (chosen Admin_Task) to this adress that can be read with method=RM.GET
    @RequestMapping(value="adminopts", method= RequestMethod.GET)
    //user input is identified in thymeleaf with name="optionsListId" and is bound (@ModelAttribute) to chosen-parameter
    //because the Admin_Options has a html target String, the chosen parameter takes care of redirecting to the right view
    public String choseAdminAction(@ModelAttribute("optionsListId") Admin_Options chosen) {
        System.out.println(chosen);
        return chosen.getHtmltarget();
    }
}
