package com.demo.example.learning.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Value("${name}")
    private String userName;

    @GetMapping("/")
    public String getHelloWorld() {
        return ("Hello World "+userName);
    }

    @GetMapping("/awesome")
    public String getAwesome() {
        return "Awesome";
    }

    @GetMapping("/getName")
    public String getName() {
        return userName;
    }
    
    
    
}
