package com.simplilearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AccountMs15102022Application {

	public static void main(String[] args) {
		SpringApplication.run(AccountMs15102022Application.class, args);
	}

}
