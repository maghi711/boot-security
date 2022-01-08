package com.maghi711.bootsecuritydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
public class BootSecurityDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootSecurityDemoApplication.class, args);
		//System.out.println("Hello the time now iw " + LocalDateTime.now());
	}

}
