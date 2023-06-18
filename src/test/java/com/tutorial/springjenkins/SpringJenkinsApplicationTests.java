package com.tutorial.springjenkins;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
class SpringJenkinsApplicationTests {
	public static Logger logger = Logger.getLogger(SpringJenkinsApplicationTests.class.getName());
	@Test
	void contextLoads() {
		logger.info("Testing case pipeline...");
		assertEquals(true, true);
	}

}
