package com.example.autoconfigure.configure;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "custom")
public class CustomProperties {
	private String message;
	private String url;
}
