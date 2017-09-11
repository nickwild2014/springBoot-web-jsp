package com.example.springbootjsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class springBootWebJsp extends SpringBootServletInitializer{

	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(springBootWebJsp.class);
	}
	
	//http://localhost:9080/subhash/
	public static void main(String[] args) {
		SpringApplication.run(springBootWebJsp.class, args);
	}
}
