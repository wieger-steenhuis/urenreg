package com.sx.controllers;

import com.sx.service.TrainerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EditTrainerController {


    //instance of CustomerService to access utility methods (database access)
    private TrainerService trainerService = new TrainerService();

    @RequestMapping(value="results", method= RequestMethod.GET)
    public String customerSearch(@ModelAttribute("trainerSearch") String search, Model model) {
        model.addAttribute("searchresults", trainerService.findByName(search));
        return "/edit_trainer";
    }
}