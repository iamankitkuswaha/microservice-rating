package com.ankit.rating;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceRatingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceRatingApplication.class, args);
	}

}
