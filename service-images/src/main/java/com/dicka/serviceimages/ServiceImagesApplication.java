package com.dicka.serviceimages;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceImagesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceImagesApplication.class, args);
	}
}
