package guru.springframework.springdi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import com.springframework.pets.PetService;
import com.springframework.pets.PetServiceFactory;

import guru.springframework.springdi.datasource.FakeDataSource;
import guru.springframework.springdi.repositories.EnglishGreetingRepository;
import guru.springframework.springdi.repositories.EnglishGreetingRepositoryImpl;
import guru.springframework.springdi.services.ConstructorGreetingService;
import guru.springframework.springdi.services.I18nEnglishGreetingService;
import guru.springframework.springdi.services.I18nGermanGreetingService;
import guru.springframework.springdi.services.PrimaryGreetingService;
import guru.springframework.springdi.services.PropertyInjectedGreetingService;
import guru.springframework.springdi.services.SetterInjectedGreetingService;

/**
 * created by Acarer on 19.04.2023
 */

@PropertySource("classpath:datasource.properties")
@ImportResource("classpath:sfgdi-config.xml")
@Configuration
public class GreetingServiceConfig {
	
	@Bean
	FakeDataSource fakeDataSource(@Value("${guru.username}") String username, 
								@Value("${guru.password}") String password, 
								@Value("${guru.jdbcurl}") String jdbcurl) {
		
		FakeDataSource fakeDataSource = new FakeDataSource();
		fakeDataSource.setUsername(username);
		fakeDataSource.setPassword(password);
		fakeDataSource.setJdbcurl(jdbcurl);
		return fakeDataSource;
	}
	
	@Bean
	PetServiceFactory petServiceFactory() {
		return new PetServiceFactory();
	}
	
	@Profile({"dog", "default"})
	@Bean
	PetService dogPetService(PetServiceFactory petServiceFactory) {
		return petServiceFactory.getPetService("dog");
	}
	
	@Profile("cat")
	@Bean
	PetService catPetService(PetServiceFactory petServiceFactory) {
		return petServiceFactory.getPetService("cat");
	}
	@Bean
	EnglishGreetingRepository englishGreetingRepository() {
		
		return new EnglishGreetingRepositoryImpl();
	}
	
	@Profile({"English", "default"})
	@Bean("i18nService")
	I18nEnglishGreetingService i18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
		return new I18nEnglishGreetingService(englishGreetingRepository);
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

	//@Bean
	//ConstructorGreetingService constructorGreetingService() {----> XML Config
	//	return new ConstructorGreetingService();
	//}
	
	@Bean
	PropertyInjectedGreetingService propertyInjectedGreetingService() {
		return new PropertyInjectedGreetingService();
	}
	
	@Bean
	SetterInjectedGreetingService setterInjectedGreetingService() {
		return new SetterInjectedGreetingService();
	}
}
