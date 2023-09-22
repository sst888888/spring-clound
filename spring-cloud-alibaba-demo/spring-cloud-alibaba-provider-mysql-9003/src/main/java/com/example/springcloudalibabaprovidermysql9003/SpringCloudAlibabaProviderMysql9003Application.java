package com.example.springcloudalibabaprovidermysql9003;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudAlibabaProviderMysql9003Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudAlibabaProviderMysql9003Application.class, args);
	}

}
