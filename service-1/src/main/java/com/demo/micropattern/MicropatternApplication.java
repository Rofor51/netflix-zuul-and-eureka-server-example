package com.demo.micropattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableDiscoveryClient
@SpringBootApplication
public class MicropatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicropatternApplication.class, args);
    }

}
