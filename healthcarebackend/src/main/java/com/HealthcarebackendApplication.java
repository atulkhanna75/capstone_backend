package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import com.fasterxml.jackson.databind.annotation.EnumNaming;

@SpringBootApplication
@EnableEurekaServer
public class HealthcarebackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthcarebackendApplication.class, args);
		System.out.println("Eureka server running on port 8080");
	}

}
