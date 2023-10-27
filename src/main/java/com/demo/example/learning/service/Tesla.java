package com.demo.example.learning.service;

import org.springframework.stereotype.Component;

@Component
public class Tesla implements Car {

    @Override
    public String getCar() {
        return "This car is Tesla";
    }
    
}
