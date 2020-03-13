package com.example.helloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class D08HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(D08HelloWorldApplication.class, args);
//		System.out.println("Hello Java World!!");
//		System.out.println("Today is a great day for Java in Spring Boot");
		String firstName = "Zack";
		System.out.printf("Hello %s!\n", firstName);
		System.out.printf("Goodbye %s", firstName);
	}

}

