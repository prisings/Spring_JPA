package com.example.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.example.jpa.controller"})
@SpringBootApplication
public class JpaStartApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaStartApplication.class, args);
	}

}
