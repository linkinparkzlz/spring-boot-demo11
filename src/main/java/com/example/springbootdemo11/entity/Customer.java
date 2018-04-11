package com.example.springbootdemo11.entity;


import javax.persistence.*;

@Entity
@Access(value = AccessType.FIELD)
@Table(name = "customer")
public class Customer {


    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 64)
    private String name;

    @OneToOne(cascade = CascadeType.REMOVE)
    private CreditCard creditCard;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
