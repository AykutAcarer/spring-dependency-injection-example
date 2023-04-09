package guru.springframework.springdi.controllers;

import guru.springframework.springdi.services.GreetingService;


public class PropertyInjectedController {

	public GreetingService greetingService;
	
	public String getGreeting() {
		
		return greetingService.sayGreeting();
	}
	
}
