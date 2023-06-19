package com.stg.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@enableEurekaClient
//The @EnableEurekaClient annotation is not required anymore. 
//Simply adding spring-cloud-starter-netflix-eureka-client to dependencies will enable the client.
//If you want to disable it, set the property value of eureka.client.enabled to false.
public class CloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudGatewayApplication.class, args);
	}

}
