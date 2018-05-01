package com_014.spring.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object arg0, String beanName)
			throws BeansException {
		System.out
				.println(" MyBeanPostProcessor postProcessAfterInitialization()    "
						+ beanName);
		return null;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String beanName)
			throws BeansException {
		System.out
				.println(" MyBeanPostProcessor postProcessBeforeInitialization()    "
						+ beanName);
		return null;
	}

}

/*Notes:
 * What is the difference between BeanPostProcessor and init/destroy method in Spring?
This is pretty clearly explained in the Spring documentation about the Container Extension Points.
The BeanPostProcessor interface defines callback methods that you can implement to provide your own (or override the container's default) 
instantiation logic, dependency-resolution logic, and so forth. If you want to implement some custom logic after the Spring container 
finishes instantiating, configuring, and initializing a bean, you can plug in one or more BeanPostProcessor implementations.
So in essence the method postProcessBeforeInitialization defined in the BeanPostProcessor gets called (as the name indicates)
 before the initialization of beans and likewise the postProcessAfterInitialization gets called after the initialization of the bean.
The difference to the @PostConstruct, InitializingBean and custom init method is that these are defined on the bean itself.
 Their ordering can be found in the Combining lifecycle mechanisms section of the spring documentation.
So basically the BeanPostProcessor can be used to do custom instantiation logic for several beans wheras the others are defined on a per bean basis.
 * */
