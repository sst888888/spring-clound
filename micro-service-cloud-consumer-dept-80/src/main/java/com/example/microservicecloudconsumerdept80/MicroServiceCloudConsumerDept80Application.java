package com.example.microservicecloudconsumerdept80;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroServiceCloudConsumerDept80Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceCloudConsumerDept80Application.class, args);
	}

}
