package com_012.spring.beanscopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab1 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com_012/spring/beanscopes/applicationContext.xml");

		SingletonScope sc1 = (SingletonScope) ctx.getBean("sing");
		SingletonScope sc2 = (SingletonScope) ctx.getBean("sing");
		System.out.println("sc1 Hash Code" + sc1.hashCode());
		System.out.println("sc2 Hash Code" + sc2.hashCode());

		PrototypeScope pro1 = (PrototypeScope) ctx.getBean("proto");
		PrototypeScope pro2 = (PrototypeScope) ctx.getBean("proto");
		System.out.println("pro1 Hash Code" + pro1.hashCode());
		System.out.println("pro2 Hash Code" + pro2.hashCode());

		// RequestScope req = (RequestScope) ctx.getBean("req");
		//
		// SessionScope ses = (SessionScope) ctx.getBean("ses");

	}

}
