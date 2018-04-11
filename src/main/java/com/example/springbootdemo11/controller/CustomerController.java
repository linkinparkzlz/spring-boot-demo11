package com.example.springbootdemo11.controller;

import com.example.springbootdemo11.entity.Customer;
import com.example.springbootdemo11.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;


    @RequestMapping(value = "add", method = RequestMethod.POST)
    public Customer addCustomer(@RequestBody Customer customer) {

        customerService.addCustomer(customer);

        Long id = customer.getId();


        return customerService.getCustomerById(id);

    }


}


























































