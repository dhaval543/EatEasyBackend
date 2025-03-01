package com.eatseasy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EatsEasyBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(EatsEasyBackendApplication.class, args);
	}

}
