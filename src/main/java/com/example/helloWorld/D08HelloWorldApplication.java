package com.example.helloWorld;

//import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class D08HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(D08HelloWorldApplication.class, args);
		System.out.println("Hello Java World!!");
		
//		System.out.println("Today is a great day for Java in Spring Boot");

//		String firstName = "Zack";
//		System.out.printf("Hello %s!\n", firstName);
//		System.out.printf("Goodbye %s", firstName);
		
//    Scanner input = new Scanner(System.in);
//		System.out.println("What is your name?");
//		String firstName = input.nextLine();
//		input.close();
//		System.out.printf("Hello %s!\n", firstName);
//		System.out.printf("\tGoodbye %s\n", firstName);
		
//		Scanner userInput = new Scanner(System.in);
//		System.out.println("What is your first name?");
//		String firstName = userInput.nextLine();
//		System.out.println("What is your last name?");
//		String lastName = userInput.nextLine();
//		userInput.close();
//		System.out.printf("Hello %s %s!\n", firstName, lastName);
//		System.out.printf("\t\tGoodbye %s %s", firstName, lastName);
	}

}

