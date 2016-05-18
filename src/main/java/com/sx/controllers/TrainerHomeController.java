package com.sx.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TrainerHomeController {
    @RequestMapping("/trainerhome")
    public String trainerHome() {
        return "customer_form";
    }
}
