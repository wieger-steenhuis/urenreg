package com.sx.controllers;

import com.sx.models.Customer;
import com.sx.service.CustomerRepository;
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

    @RequestMapping(value="customer", method= RequestMethod.GET)
    public String customerSearch(@RequestParam(value = "id") int id, Model model) {
        model.addAttribute("customer", customerService.findOne(id));
        return "/customer_form";
    }

    @RequestMapping("/newcustomer")
    public String newCustomer(Model model){
        Customer customer = new Customer();
        model.addAttribute("customer", customer);
        return "/customer_form";
    }

    @RequestMapping("/save")
    public String save(Customer customer){
        customerService.save(customer);
        return "redirect:/adminhome";//without redirect: admin_honme will be loaded without the model variables...
    }
}
