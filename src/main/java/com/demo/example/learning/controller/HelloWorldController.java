package com.demo.example.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.example.learning.service.Car;


@RestController
public class HelloWorldController {
    private Car car;

    @Autowired
    public HelloWorldController(Car car) {
        this.car = car;
    }

    @Value("${name}")
    private String userName;

    @GetMapping("/helloWorld")
    public String getHelloWorld() {
        return ("Hello World");
    }

    @GetMapping("/getCar")
    public String getCar() {
        return car.getCar();
    }

    @GetMapping("/getName")
    public String getName() {
        return userName;
    }
    
    
    
}
