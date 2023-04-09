package guru.springframework.springdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.springdi.services.GreetingService;

@Controller
public class SetterInjectedController {


	private GreetingService greetingService;

	public GreetingService getGreetingService() {
		return greetingService;
	}

	@Qualifier("setterInjectedGreetingService")
	@Autowired
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
