package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsJobApplication {

	@PostConstruct
	public void init(){
		System.out.println("Jenkins job test");
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkinsJobApplication.class, args);
	}

}
