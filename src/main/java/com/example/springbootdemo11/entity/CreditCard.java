package com.example.springbootdemo11.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "credit_cards")
public class CreditCard {


    @Id
    @GeneratedValue
    private Long id;


    @Column(length = 20)
    private String number;

    @Column(name = "reg_date")
    private Date registerDate;

    @OneToOne(mappedBy = "creditCard")
    private Customer customer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}


















































































