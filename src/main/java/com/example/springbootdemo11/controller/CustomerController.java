package com.example.springbootdemo11.controller;

import com.example.springbootdemo11.entity.Customer;
import com.example.springbootdemo11.service.CustomerRepository;
import com.example.springbootdemo11.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private CustomerRepository customerRepository;

    //查出所有
    @RequestMapping("all")
    public List<Customer> loadCustomers() {

        return customerRepository.findAll();
    }

//    @RequestMapping("get/{id}")
//    public Customer getCustomer(@PathVariable("id") Long id) {
//
//        return customerRepository.findOne(id)
//    }


    @RequestMapping(value = "add", method = RequestMethod.POST)
    public Customer addCustomer(@RequestBody Customer customer) {

        customerService.addCustomer(customer);

        Long id = customer.getId();


        return customerService.getCustomerById(id);

    }


}


























































