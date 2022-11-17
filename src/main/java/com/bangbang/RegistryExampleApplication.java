package com.bangbang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegistryExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistryExampleApplication.class, args);
	}

}
