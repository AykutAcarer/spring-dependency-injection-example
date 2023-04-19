package guru.springframework.springdi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import guru.springframework.springdi.services.ConstructorGreetingService;
import guru.springframework.springdi.services.I18nEnglishGreetingService;
import guru.springframework.springdi.services.I18nGermanGreetingService;
import guru.springframework.springdi.services.PrimaryGreetingService;
import guru.springframework.springdi.services.PropertyInjectedGreetingService;
import guru.springframework.springdi.services.SetterInjectedGreetingService;

/**
 * created by Acarer on 19.04.2023
 */

@Configuration
public class GreetingServiceConfig {
	
	@Profile({"English", "default"})
	@Bean("i18nService")
	I18nEnglishGreetingService i18nEnglishGreetingService() {
		return new I18nEnglishGreetingService();
	}
	
	@Profile("German")
	@Bean
	I18nGermanGreetingService i18nService() {
		return new I18nGermanGreetingService();
	}
	
	@Primary
	@Bean
	PrimaryGreetingService primaryGreetingService() {
		return new PrimaryGreetingService();
	}

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
