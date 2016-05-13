package com.sx.controllers;

import com.sx.models.Trainer;
import com.sx.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class TrainerFormController {


    //instance of TrainerRepository to access utility methods (database access)
    @Autowired
    private TrainerService trainerService;

    @RequestMapping(value="trainer", method= RequestMethod.POST)
    public String customerSearch(@RequestParam (value = "trainer") Trainer trainer, Model model) {
        model.addAttribute("trainer", trainer);
        return "/trainer_form";
    }

    @RequestMapping("/newtrainer")
    public String newTrainer(Model model){
        Trainer trainer = new Trainer();
        model.addAttribute("trainer", trainer);
        return "/trainer_form";
    }

    @RequestMapping("/saved")
    public String save(Trainer trainer){
        trainerService.save(trainer);
        return "redirect:/adminhome";//without redirect: admin_honme will be loaded without the model variables...
    }
}
