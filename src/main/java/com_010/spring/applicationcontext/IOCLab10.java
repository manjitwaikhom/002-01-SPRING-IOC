package com_010.spring.applicationcontext;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class IOCLab10 {
	public static void main(String[] args) {
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("com_010/spring/applicationcontext/applicationContext.xml");
		System.out.println("Spring Container Ready...");
		Hello h=(Hello)ctx.getBean("hello");
		h.show();
		ctx.registerShutdownHook();
		System.out.println("Spring Container Down...");
		
		/*
		Resource rs=new ClassPathResource("com_010/spring/applicationcontext/applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(rs);
		Hello h=(Hello)factory.getBean("hello");
		h.show();
		*/
	}

}
