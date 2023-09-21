package com.example.springcloudalibabaconsumernacos9901;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient // 开启服务注册与发现功能
public class SpringCloudAlibabaConsumerNacos9901Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudAlibabaConsumerNacos9901Application.class, args);
	}

}
