package com.example.srvc.demo;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Service {
    private RestTemplate restTemplate;

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
       return this.restTemplate = builder.build();
    }

    @GetMapping(value = "greet")
    public double sayHello() {
        double retreive = restTemplate.getForObject("http://spring-cloud-eureka-client/calculate/12",Double.class);

        return retreive;
    }
}
