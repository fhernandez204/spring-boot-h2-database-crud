package com.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.api")
@SpringBootApplication
public class SpaceCraftApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpaceCraftApplication.class, args);
	}

}
