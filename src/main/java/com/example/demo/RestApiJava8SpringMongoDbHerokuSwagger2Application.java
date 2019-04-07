package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan
@SpringBootApplication
public class RestApiJava8SpringMongoDbHerokuSwagger2Application  {
	
	public static void main(String[] args) {
		SpringApplication.run(RestApiJava8SpringMongoDbHerokuSwagger2Application.class, args);
	}

}