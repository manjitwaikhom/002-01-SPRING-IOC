package com_004.spring.autowirebytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab4 {
public static void main(String as[])
{
	ApplicationContext ctx=new ClassPathXmlApplicationContext("com_004/spring/autowirebytype/applicationContext.xml");
	Hello h=(Hello)ctx.getBean("hello");
	h.m1();
}
}
