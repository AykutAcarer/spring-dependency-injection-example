package guru.springframework.springdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import guru.springframework.springdi.controllers.ConstructorInjectedController;
import guru.springframework.springdi.controllers.I18nController;
import guru.springframework.springdi.controllers.MyController;
import guru.springframework.springdi.controllers.PetController;
import guru.springframework.springdi.controllers.PropertyInjectedController;
import guru.springframework.springdi.controllers.SetterInjectedController;
import guru.springframework.springdi.datasource.FakeDataSource;
import guru.springframework.springdi.services.PrototypeBean;
import guru.springframework.springdi.services.SingletonBean;

//@ComponentScan(basePackages = {"guru.springframework.springdi", "com.springframework.pets"} )
@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SpringDiApplication.class, args);

		PetController petController = ctx.getBean("petController", PetController.class);
		System.out.println("----------The Best Pet is----------");
		System.out.println(petController.whichPetIsTheBest());
		
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());
		
		System.out.println("---------Primary Bean");

		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println(myController.sayHello());

		System.out.println("---------Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx
				.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("---------Setter");

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx
				.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());

		System.out.println("--------- Constructor ---------");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx
				.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreeting());
		
		
		System.out.println("----- Bean Scopes -----");
		
		SingletonBean singletonbean1 = ctx.getBean(SingletonBean.class);
		System.out.println(singletonbean1.getMyScope());
		SingletonBean singletonbean2 = ctx.getBean(SingletonBean.class);
		System.out.println(singletonbean2.getMyScope());
		
		PrototypeBean prototypeBean1 = ctx.getBean(PrototypeBean.class);
		System.out.println(prototypeBean1.getMyScope());
		PrototypeBean prototypeBean2 = ctx.getBean(PrototypeBean.class);
		System.out.println(prototypeBean2.getMyScope());
		
		
		FakeDataSource fakeDataSource =ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUsername());
		System.out.println(fakeDataSource.getPassword());	
		System.out.println(fakeDataSource.getJdbcurl());
		
	}

}
