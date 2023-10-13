package com.serviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NewMicroservicesC1iServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewMicroservicesC1iServiceRegistryApplication.class, args);
	}

}
