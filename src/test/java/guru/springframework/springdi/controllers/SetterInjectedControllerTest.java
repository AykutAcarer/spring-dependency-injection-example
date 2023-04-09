package guru.springframework.springdi.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.springdi.services.GreetingService;
import guru.springframework.springdi.services.GreetingServicesImpl;

class SetterInjectedControllerTest {

	SetterInjectedController controller;
	
	@BeforeEach
	void setUp() throws Exception {
	
		controller = new SetterInjectedController();
		controller.setGreetingService(new GreetingServicesImpl());
	}

	@Test
	void getGreeting() {
	
		System.out.println(controller.getGreeting());
	}

}
