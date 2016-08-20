package com_007.spring.annotationautowiring;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab7 {
public static void main(String as[])
{
	ApplicationContext ctx=new ClassPathXmlApplicationContext("com_007/spring/annotationautowiring/applicationContext.xml");
	A obj=(A)ctx.getBean("aobj");
	obj.m1();
}
}
