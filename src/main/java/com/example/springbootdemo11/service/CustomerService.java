package com.example.springbootdemo11.service;


import com.example.springbootdemo11.entity.Customer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public class CustomerService {

    @PersistenceContext
    private EntityManager entityManager;


    @Transactional
    public void addCustomer(Customer customer) {

        entityManager.persist(customer);
    }

    public Customer getCustomerById(Long id) {

        return entityManager.find(Customer.class, id);

    }


}









