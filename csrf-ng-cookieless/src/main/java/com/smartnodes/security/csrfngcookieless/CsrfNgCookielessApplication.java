package com.smartnodes.security.csrfngcookieless;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CsrfNgCookielessApplication {

	public static void main(String[] args) {
		SpringApplication.run(CsrfNgCookielessApplication.class, args);

		System.out.println("SmartNodes Spring Security Csrf Angular Cookieless");
	}
}
