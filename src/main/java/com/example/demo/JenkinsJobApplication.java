package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@Slf4j
@SpringBootApplication
public class JenkinsJobApplication {

	@PostConstruct
	public void init(){
		log.info("Logging Jenkins job demo");
		System.out.println("Logging Jenkins job test");
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkinsJobApplication.class, args);
	}

}
