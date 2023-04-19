package guru.springframework.springdi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import guru.springframework.springdi.services.ConstructorGreetingService;
import guru.springframework.springdi.services.PropertyInjectedGreetingService;
import guru.springframework.springdi.services.SetterInjectedGreetingService;

/**
 * created by Acarer on 19.04.2023
 */

@Configuration
public class GreetingServiceConfig {

	@Bean
	ConstructorGreetingService constructorGreetingService() {
		return new ConstructorGreetingService();
	}
	
	@Bean
	PropertyInjectedGreetingService propertyInjectedGreetingService() {
		return new PropertyInjectedGreetingService();
	}
	
	@Bean
	SetterInjectedGreetingService setterInjectedGreetingService() {
		return new SetterInjectedGreetingService();
	}
}
