package com.sx.controllers;

import com.sx.models.Customer;
import com.sx.models.SubscrType;
import com.sx.models.Subscription;
import com.sx.models.Trainer;
import com.sx.service.CustomerService;
import com.sx.service.SessionService;
import com.sx.service.SubscriptionService;
import com.sx.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;


@Controller
public class SubscriptionFormController {

    //'instances' of repository interfaces to access CRUD functionality (database access)
    @Autowired
    private SubscriptionService subscriptionService;
    @Autowired
    private CustomerService customerService;
    @Autowired
    private TrainerService trainerService;
    @Autowired
    private SessionService sessionService;

    @ModelAttribute("trainers")
    public List<Trainer> populateTrainers() {
        return (List<Trainer>)trainerService.findAll();
    }

    @ModelAttribute("types")
    public List<SubscrType> populateTypes(){
        return Arrays.asList(SubscrType.values());
    }


    @RequestMapping(value="/subscription", method= RequestMethod.POST)
    public String subscriptionSearch(@RequestParam (value = "subscription") Subscription subscription, Model model) {
        model.addAttribute("subscription", subscription);
        return "/subscription_form";
    }


    @RequestMapping(value="/newsubscription", method=RequestMethod.POST)
    public String newSubscription(@RequestParam String firstName, String lastName, String phoneNr, String eMail, String pin, int id, Model model) {
        Customer customer;
        if (id==0){
            customer = new Customer();
            customer.setFirstName(firstName);
            customer.setLastName(lastName);
            customer.setPhoneNr(phoneNr);
            customer.seteMail(eMail);
            customer.setPin(pin);
            customerService.save(customer);
        }
        else{
            customer = customerService.findOne(id);
        }
        Subscription subscription = new Subscription(SubscrType.TWENTYFOUR);
        System.out.println(subscription.getSubscrType());
        subscription.setCustomer(customer);
        model.addAttribute("subscription", subscription);
        return "/subscription_form";
    }

    @RequestMapping(value = "/save_subscription", method=RequestMethod.POST)
    public String saveSubscription(Subscription subscription, Model model){
        System.out.println(subscription.getSubscrType());
        subscription = subscriptionService.save(subscription);
        model.addAttribute("customer", customerService.findOne(subscription.getCustomer().getId()));
        model.addAttribute("subscriptions", subscriptionService.findByCustomer(subscription.getCustomer()));
        return "/customer_form";
    }
}