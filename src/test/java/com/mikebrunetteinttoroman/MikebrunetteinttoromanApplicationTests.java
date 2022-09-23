package com.mikebrunetteinttoroman;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
@SpringBootTest
@AutoConfigureMockMvc
class IntToRomanTests {

	@Autowired
	MockMvc mockMvc;

	//test controller for debugging purposes.
	@Test
	void contextLoads() {
		System.out.println("hello");



	}
}

