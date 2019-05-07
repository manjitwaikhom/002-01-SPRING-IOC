package com_003.spring.autowirebyname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab3 {
public static void main(String arg[])
{
	ApplicationContext ctx=new ClassPathXmlApplicationContext("com_003/spring/autowirebyname/applicationContext.xml");
	Hello h=(Hello)ctx.getBean("hello");
	h.m1();
}
}
