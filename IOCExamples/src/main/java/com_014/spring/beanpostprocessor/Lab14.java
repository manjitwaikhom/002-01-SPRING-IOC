package com_014.spring.beanpostprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab14 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com_014/spring/beanpostprocessor/applicationContext.xml");

	}
}
