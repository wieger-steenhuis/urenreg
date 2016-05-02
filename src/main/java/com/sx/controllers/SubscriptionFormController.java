package com.sx.controllers;

import com.sx.models.Subscription;
import com.sx.service.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class SubscriptionFormController {

    //instance of CustomerRepository to access utility methods (database access)
    @Autowired
    private SubscriptionRepository subscriptionService;

    @RequestMapping(value="subscription", method= RequestMethod.GET)
    public String subscriptionSearch(@RequestParam(value = "id") int id, Model model) {
        model.addAttribute("subscription", subscriptionService.findOne(id));
        return "/subscription_form";
    }

    @RequestMapping("/newsubscription")
    public String newSubscription(Model model){
        Subscription subscription = new Subscription();
        model.addAttribute("subscription", subscription);
        return "/subscription_form";
    }

    @RequestMapping("/save_subscription")
    public String save(Subscription subscription){
        subscriptionService.save(subscription);
        return "redirect:/adminhome";//without redirect: admin_honme will be loaded without the model variables...
    }
}

