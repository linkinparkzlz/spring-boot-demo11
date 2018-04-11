package com.example.springbootdemo11.entity;


import javax.persistence.Entity;
import javax.persistence.Inheritance;

@Inheritance
@Entity
public class VipCustomer extends Customer {


    private Double discount;




}



































































