package com.online.taxi.verificationcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author yueyi2019
 */
@EnableEurekaClient
@SpringBootApplication
public class VerificationCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(VerificationCodeApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
