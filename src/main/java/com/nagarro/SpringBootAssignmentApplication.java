package com.nagarro;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAssignmentApplication {
	 
	public static final Logger logger = LoggerFactory.getLogger(SpringBootAssignmentApplication.class);

	public static void main(String[] args) {
		logger.info("It is a Continuous Integration Job!!");
		SpringApplication.run(SpringBootAssignmentApplication.class, args);
	}

}
