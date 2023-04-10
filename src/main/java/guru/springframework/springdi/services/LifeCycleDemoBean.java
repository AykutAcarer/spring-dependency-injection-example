package guru.springframework.springdi.services;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * created by Acarer on 10.04.2023
 */

@Component
public class LifeCycleDemoBean
		implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

	public LifeCycleDemoBean() {
		System.out.println("### I'm in the LifeCycleBean Constructor");
	}
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("### Application Context has been set");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("### Bean Factory has been set");
	}

	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("### My Bean Name is:" + name);
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("### The LifeCycleBean has been terminated");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("### the LifeCyleBean has its properties set!");
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("### The PostConstruct annotated method has been called");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("### The PreDestroy annotated method has been called");
	}
	
	public void beforeInit() {
		// TODO Auto-generated method stub
		System.out.println("### - Before Init - Called by Bean Post Processor");
	}

	public void afterInit() {
		// TODO Auto-generated method stub
		System.out.println("### - After Init - Called by Bean Post Processor");
	}

}
