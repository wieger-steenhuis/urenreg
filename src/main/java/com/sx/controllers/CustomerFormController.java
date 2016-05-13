package com.sx.controllers;

import com.sx.models.Customer;
import com.sx.service.CustomerService;
import com.sx.service.SubscriptionService;
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
    private CustomerService customerService;

    @Autowired
    private SubscriptionService subscriptionService;

    @RequestMapping(value="customer", method= RequestMethod.POST)
    public String customerSearch(@RequestParam (value = "customer") Customer customer, Model model) {
        model.addAttribute("customer", customer);
        model.addAttribute("subscriptions", subscriptionService.findByCustomer(customer));
        return "/customer_form";
    }

    @RequestMapping("/newcustomer")
    public String newCustomer(Model model){
        model.addAttribute("customer", new Customer());
        return "/customer_form";
    }

    @RequestMapping("/save")
    public String save(Customer customer){
        customerService.save(customer);
        return "redirect:/adminhome";//without redirect: admin_honme will be loaded without the model variables...
    }
}
