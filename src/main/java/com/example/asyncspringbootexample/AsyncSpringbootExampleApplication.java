package com.example.asyncspringbootexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
public class AsyncSpringbootExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AsyncSpringbootExampleApplication.class, args);
	}

}
