package com.demo.micropattern.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorAPI {

    @GetMapping(value = "/calculate/{id}")
    public double calculatePower(@PathVariable int id) {
        System.out.println("I was called.");
        double result = Math.pow(id,2);

        return result;
    }



}
