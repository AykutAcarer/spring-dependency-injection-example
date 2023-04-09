package guru.springframework.springdi.controllers;

import guru.springframework.springdi.services.GreetingService;

public class ConstructorInjectedController {

	private final GreetingService greetingService;

	public ConstructorInjectedController(GreetingService greetingService) {
	
		this.greetingService = greetingService;
	}

	public GreetingService getGreetingService() {
		return greetingService;
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
