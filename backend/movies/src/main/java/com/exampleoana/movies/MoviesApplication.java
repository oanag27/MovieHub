package com.exampleoana.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController  //the class is a rest API controller
public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}
	@GetMapping("/root")  //it lets the framework know that the method is a git endpoint
	public String apiRoot(){
		return "Hello world!";
	}
}
