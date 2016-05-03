package com.sx.controllers;

import com.sx.models.Customer;
import com.sx.models.Subscription;
import com.sx.service.CustomerRepository;
import com.sx.service.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerFormController {

    //instance of CustomerRepository to access utility methods (database access)
    @Autowired
    private CustomerRepository customerService;

    @Autowired
    private SubscriptionRepository subscriptionService;


    @RequestMapping(value="customer", method= RequestMethod.GET)
    public String customerSearch(@RequestParam(value = "id") int id, Model model) {
        Customer customer = customerService.findOne(id);
        model.addAttribute("customer", customer);
        model.addAttribute("subscription", subscriptionService.findByCustomer(customer));
        return "/customer_form";
    }

    @RequestMapping("/newcustomer")
    public String newCustomer(Model model){
        model.addAttribute("customer", new Customer());
        model.addAttribute("subscription",new Subscription());
        return "/customer_form";
    }

    @RequestMapping("/save")
    public String save(Customer customer){
        customerService.save(customer);
        return "redirect:/adminhome";//without redirect: admin_honme will be loaded without the model variables...
    }
}
