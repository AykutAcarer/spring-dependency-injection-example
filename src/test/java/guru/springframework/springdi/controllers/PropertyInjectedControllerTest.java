package guru.springframework.springdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.springdi.services.GreetingService;
import guru.springframework.springdi.services.ConstructorGreetingService;


public class PropertyInjectedControllerTest {

	PropertyInjectedController controller;
	
	@BeforeEach
	void setUp() {
		
		controller = new PropertyInjectedController();
		
		controller.greetingService = new ConstructorGreetingService();
	}
	
	@Test
	void getGreeting() {
		
		System.out.println(controller.getGreeting());
	}
	
}
