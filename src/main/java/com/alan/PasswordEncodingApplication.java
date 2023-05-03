package com.alan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PasswordEncodingApplication {

	public static void main(String[] args) {
		SpringApplication.run(PasswordEncodingApplication.class, args);
	}

}
