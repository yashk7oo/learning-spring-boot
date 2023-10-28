package com.demo.example.learning.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
//@Primary
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Maruti implements Car {

    public Maruti() {
        System.out.println("This constructor is " +getClass().getSimpleName());
    }

    @PostConstruct
    public void posrConstruct() {
        System.out.println("This is post construct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("This is pre destroy");
    }
    @Override
    public String getCar() {
        return "This car is Maruti";
    }

}
