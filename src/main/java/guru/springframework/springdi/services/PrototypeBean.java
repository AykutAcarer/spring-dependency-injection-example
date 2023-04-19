package guru.springframework.springdi.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * created by Acarer on 19.04.2023
 */

@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class PrototypeBean {

	public PrototypeBean() {
		// TODO Auto-generated constructor stub
		System.out.println(">>>>Creating a Prototype Bean");
	}
	public String getMyScope() {
		return "I'm a Protottype";
	}

	
}
