package guru.springframework.springdi.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * created by Acarer on 19.04.2023
 */

@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
@Component
public class SingletonBean {
	
	public SingletonBean() {
		System.out.println(">>>> Creating a Singleton Bean");
	}

	public String getMyScope() {
		return "I'm a Singleton";
	}
}
