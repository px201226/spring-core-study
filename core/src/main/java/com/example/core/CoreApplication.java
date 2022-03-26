package com.example.core;

import com.example.autoconfigure.configure.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoreApplication {


	public static void main(String[] args) {
		SpringApplication.run(CoreApplication.class, args);
	}

}
