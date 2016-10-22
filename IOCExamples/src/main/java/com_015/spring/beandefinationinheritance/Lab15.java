package com_015.spring.beandefinationinheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab15 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com_015/spring/beandefinationinheritance/applicationContext.xml");
		Hello hello1 = (Hello) ctx.getBean("h1");
		System.out.println(hello1.x);

		Hello hello2 = (Hello) ctx.getBean("h2");
		System.out.println(hello2.x);

	}
}
