package com.example.springbootdemo11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.springbootdemo11")
@EnableTransactionManagement
public class SpringBootDemo11Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemo11Application.class, args);
	}
}
