package com.assignment.adding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("com.assignment.*")
@SpringBootApplication
public class AddingApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddingApplication.class, args);
	}

}
