package com.sx.controllers;

import com.sx.service.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EditTrainerController {


    //instance of TrainerRepository to access utility methods (database access)
    @Autowired
    private TrainerRepository trainerService;

    @RequestMapping(value = "results", method = RequestMethod.GET)
    public String customerSearch(@ModelAttribute("trainerSearch") String search, Model model) {
        model.addAttribute("searchresults", trainerService.findByFirstName(search));
        return "/edit_trainer";
    }
}