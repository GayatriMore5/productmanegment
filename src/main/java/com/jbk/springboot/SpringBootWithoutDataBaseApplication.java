package com.jbk.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWithoutDataBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithoutDataBaseApplication.class, args);
		System.out.println("App is started");
	}

}
