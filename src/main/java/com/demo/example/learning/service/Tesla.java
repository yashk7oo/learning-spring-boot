package com.demo.example.learning.service;

import org.springframework.stereotype.Component;

@Component
//@Lazy
public class Tesla implements Car {

    public Tesla() {
        System.out.println("This constructor is " +getClass().getSimpleName());
    }

    @Override
    public String getCar() {
        return "This car is Tesla";
    }
    
}
