package com.example.autoconfigure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class AutoConfigureApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutoConfigureApplication.class, args);
	}

}
