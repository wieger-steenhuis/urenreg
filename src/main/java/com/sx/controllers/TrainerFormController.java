package com.sx.controllers;

import com.sx.models.Trainer;
import com.sx.service.TrainerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class TrainerFormController {


    //instance of CustomerService to access utility methods (database access)
    private TrainerService trainerService = new TrainerService();

    @RequestMapping(value="trainer", method= RequestMethod.GET)
    public String trainerSearch(@RequestParam(value = "id") int id, Model model) {
        model.addAttribute("trainer", trainerService.findById(id));
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
