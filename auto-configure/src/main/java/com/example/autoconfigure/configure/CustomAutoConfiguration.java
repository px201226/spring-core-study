package com.example.autoconfigure.configure;


import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(CustomProperties.class)
public class CustomAutoConfiguration {

	@Bean
	public CustomService customService(CustomProperties customProperties){
		return new CustomService(customProperties);
	}
}
