package com.nagarro;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootAssignmentApplicationTests {
	
	public static final Logger logger = LoggerFactory.getLogger(SpringBootAssignmentApplication.class);

	@Test
	void contextLoads() {
		logger.info("Its a Test Class!!");
		assertEquals(true, true);
	}

}
