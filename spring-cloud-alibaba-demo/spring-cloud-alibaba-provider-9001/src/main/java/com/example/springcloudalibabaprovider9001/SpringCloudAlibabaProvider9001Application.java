package com.example.springcloudalibabaprovider9001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient //开启服务发现功能
public class SpringCloudAlibabaProvider9001Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudAlibabaProvider9001Application.class, args);
	}

}
