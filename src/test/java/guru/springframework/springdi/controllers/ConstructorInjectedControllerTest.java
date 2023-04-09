package guru.springframework.springdi.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.springdi.services.ConstructorGreetingService;

class ConstructorInjectedControllerTest {

	ConstructorInjectedController controller;
	
	@BeforeEach
	void setUp() throws Exception {
		
		controller = new ConstructorInjectedController(new ConstructorGreetingService());
	}

	@Test
	void test() {
		System.out.println(controller.getGreeting());
	}

}
