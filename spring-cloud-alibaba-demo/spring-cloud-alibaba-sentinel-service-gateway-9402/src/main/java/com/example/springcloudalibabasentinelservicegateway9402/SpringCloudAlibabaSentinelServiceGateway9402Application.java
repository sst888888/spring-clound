package com.example.springcloudalibabasentinelservicegateway9402;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCloudAlibabaSentinelServiceGateway9402Application {

	public static void main(String[] args) {
		System.setProperty("csp.sentinel.app.type", "1");
		SpringApplication.run(SpringCloudAlibabaSentinelServiceGateway9402Application.class, args);
	}

}
