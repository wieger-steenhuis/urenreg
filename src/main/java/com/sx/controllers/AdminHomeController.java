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

    //Enum Admin_Options contain different admin tasks to chose from
    //Admin_Options contains a discriptopn (to select in our vies) and a specific html target to redirect to
    //values() returns an array of all enum values
    //controller uses enum values in a List
    private List<Admin_Options>options = Arrays.asList(Admin_Options.values());

    //getter & setter:
    public List<Admin_Options> getOptions() {
        return options;
    }

    public void setOptions(List<Admin_Options> options) {
        this.options = options;
    }


    @RequestMapping("/adminhome")
    public String adminhome(Model model){
        model.addAttribute("admin_opts", options);
        return "/admin_home";
    }

    @RequestMapping(value="adminopts", method= RequestMethod.GET)
    public String choseAdminAction(@ModelAttribute("optionsListId") Admin_Options chosen, Model model) {
        System.out.println(chosen);
        return chosen.getHtmltarget();
    }
}
