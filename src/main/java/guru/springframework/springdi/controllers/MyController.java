package guru.springframework.springdi.controllers;

import org.springframework.stereotype.Controller;

import guru.springframework.springdi.services.GreetingService;

@Controller
public class MyController {

	private final GreetingService greetinService;
	
	
	public MyController(GreetingService greetinService) {
		
		this.greetinService = greetinService;
	}


	public String sayHello() {
		
		return greetinService.sayGreeting();
	}
}
