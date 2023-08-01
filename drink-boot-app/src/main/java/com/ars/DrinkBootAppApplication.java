package com.ars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DrinkBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DrinkBootAppApplication.class, args);
	}

}
