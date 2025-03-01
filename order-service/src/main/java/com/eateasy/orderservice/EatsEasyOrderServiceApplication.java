package com.eateasy.orderservice;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EatsEasyOrderServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(EatsEasyOrderServiceApplication.class, args);
    }
}

