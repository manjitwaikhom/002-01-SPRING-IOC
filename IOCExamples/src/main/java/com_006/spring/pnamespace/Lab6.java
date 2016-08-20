package com_006.spring.pnamespace;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab6 {
public static void main(String arg[])
{
	ApplicationContext ctx=new ClassPathXmlApplicationContext("com_006/spring/pnamespace/applicationContext.xml");
	Hello h=(Hello)ctx.getBean("hello");
	h.show();
}
}
