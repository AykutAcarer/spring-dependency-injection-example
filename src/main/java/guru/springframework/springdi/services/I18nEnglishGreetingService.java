package guru.springframework.springdi.services;

import guru.springframework.springdi.repositories.EnglishGreetingRepository;

/**
 * created by Acarer on 10.04.2023
 */

public class I18nEnglishGreetingService implements GreetingService{

	private final EnglishGreetingRepository englishGreetingRepository;
	
	
	public I18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
		this.englishGreetingRepository = englishGreetingRepository;
	}


	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hello World - English";
	}

}
