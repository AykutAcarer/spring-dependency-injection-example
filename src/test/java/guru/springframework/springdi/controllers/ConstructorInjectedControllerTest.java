package guru.springframework.springdi.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.springdi.services.GreetingServicesImpl;

class ConstructorInjectedControllerTest {

	ConstructorInjectedController controller;
	
	@BeforeEach
	void setUp() throws Exception {
		
		controller = new ConstructorInjectedController(new GreetingServicesImpl());
	}

	@Test
	void test() {
		System.out.println(controller.getGreeting());
	}

}
