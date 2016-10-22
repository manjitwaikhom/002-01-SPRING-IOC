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
