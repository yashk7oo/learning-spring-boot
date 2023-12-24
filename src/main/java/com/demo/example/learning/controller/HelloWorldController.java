package com.demo.example.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.example.learning.service.Car;


@RestController
public class HelloWorldController {
    //@Autowired
    private Car car;
    private Car anotherCar;

    @Autowired
    public void setCar(@Qualifier("maruti") Car car,
                       @Qualifier("anand") Car anotherCar){
        this.car = car;
        this.anotherCar=anotherCar;
    }

//    @Autowired
//    public HelloWorldController(Car car) {
//        this.car = car;
//    }

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

    @GetMapping("/getAnotherCar")
    public String getAnotherCar() {
        return anotherCar.getCar();
    }

//    @GetMapping("/checkScope")
//    public String checkScope() {
//        return ("Check scope equality for car==anotherCar :" + (car==anotherCar));
//    }
}
