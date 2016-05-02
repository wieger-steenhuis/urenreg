package com.sx.controllers;

import com.sx.service.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class EditSubscriptionController {

    //instance of CustomerService to access utility methods (database access)
    @Autowired
    private SubscriptionRepository subscriptionService;

    @RequestMapping(value="resultset", method= RequestMethod.GET)
    public String customerSearch(@ModelAttribute("subscriptionSearch") String search, Model model) {
        System.out.println(search);
        model.addAttribute("searchresults", subscriptionService.findByStartDate(search));
        return "/edit_subscription";
    }
}