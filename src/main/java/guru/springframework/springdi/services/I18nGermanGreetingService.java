package guru.springframework.springdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * created by Acarer on 10.04.2023
 */

@Profile("German")
@Service("i18nService")
public class I18nGermanGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hallo Welt - German";
	}

}
