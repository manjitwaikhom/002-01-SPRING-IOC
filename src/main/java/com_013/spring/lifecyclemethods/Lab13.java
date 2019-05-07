package com_013.spring.lifecyclemethods;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab13 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com_013/spring/lifecyclemethods/applicationContext.xml");
		Hello hello = (Hello) ctx.getBean("hello");
		Hai hai = (Hai) ctx.getBean("hai");

	}

}
