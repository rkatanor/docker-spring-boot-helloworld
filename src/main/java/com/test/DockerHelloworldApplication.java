package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping(value = "/rest")
public class DockerHelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerHelloworldApplication.class, args);
	}

	@GetMapping(value = "/hello")
	public String helloworld() {
		return "Hi, welcome to containerized spring boot application...";
	}

}
