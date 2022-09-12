package com.investmentmvcapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringInvestmentRestmvcclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringInvestmentRestmvcclientApplication.class, args);
	}
 // Create an object of RestTemplate
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
