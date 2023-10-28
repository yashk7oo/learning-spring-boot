package com.demo.example.learning.config;

import com.demo.example.learning.service.Car;
import com.demo.example.learning.service.Mahindra;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfig {

    @Bean("anand")
    public Car mahindra() {
        return new Mahindra();
    }
}
