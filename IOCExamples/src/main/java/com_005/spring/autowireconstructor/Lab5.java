package com_005.spring.autowireconstructor;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab5 {
public static void main(String as[])
{
	ApplicationContext ctx=new ClassPathXmlApplicationContext("com_005/spring/autowireconstructor/applicationContext.xml");
	Hello h=(Hello)ctx.getBean("hello");
	h.m1();
}
}
