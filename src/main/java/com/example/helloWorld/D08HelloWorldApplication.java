package com.example.helloWorld;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class D08HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(D08HelloWorldApplication.class, args);
		Scanner input = new Scanner(System.in);
//		System.out.println("Hello Java World!!");
//		System.out.println("Today is a great day for Java in Spring Boot");
//		String firstName = "Zack";
//		System.out.printf("Hello %s!\n", firstName);
//		System.out.printf("Goodbye %s", firstName);
		System.out.println("What is your name?");
		String firstName = input.nextLine();
		input.close();
		System.out.printf("Hello %s!\n", firstName);
		System.out.printf("\tGoodbye %s\n", firstName);
	}

}

