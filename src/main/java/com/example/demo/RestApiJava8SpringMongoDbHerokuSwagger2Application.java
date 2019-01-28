package com.example.demo;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApiJava8SpringMongoDbHerokuSwagger2Application {

	@PostConstruct
    void started() {
      TimeZone.setDefault(TimeZone.getTimeZone("UTC-3"));
    }
	
	public static void main(String[] args) {
		SpringApplication.run(RestApiJava8SpringMongoDbHerokuSwagger2Application.class, args);
	}

}

