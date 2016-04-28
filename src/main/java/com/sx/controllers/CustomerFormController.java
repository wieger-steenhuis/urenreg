package com.sx.controllers;

import com.sx.models.Customer;
import com.sx.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerFormController {

    //instance of CustomerService to access utility methods (database access)
    private CustomerService customerService = new CustomerService();

    @RequestMapping(value="customer", method= RequestMethod.GET)
    public String customerSearch(@RequestParam(value = "id") int id, Model model) {
        model.addAttribute("customer", customerService.findById(id));
        return "/customer_form";
    }


    @RequestMapping("/save")
    public String save(Customer customer){
        customerService.save(customer);
        return "/customer_form";
    }



            /*(@ModelAttribute("cid") Customer customer, Model model) {
        System.out.println(customer);
        model.addAttribute("customer", customer);
        return "/customer_form";
    }*/
}
