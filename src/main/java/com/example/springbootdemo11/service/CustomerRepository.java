package com.example.springbootdemo11.service;

import com.example.springbootdemo11.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
@Transactional(readOnly = false)
public class CustomerRepository extends SimpleJpaRepository<Customer, Long> {



    @Autowired
    public CustomerRepository(EntityManager em) {
        super(Customer.class, em);
    }
}
