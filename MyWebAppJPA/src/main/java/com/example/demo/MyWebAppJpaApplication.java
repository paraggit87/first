package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.repo")
public class MyWebAppJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyWebAppJpaApplication.class, args);
	}

}
