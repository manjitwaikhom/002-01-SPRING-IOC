package com_009.spring.annotationautowiring;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab9 {
public static void main(String as[])
{
	ApplicationContext ctx=new ClassPathXmlApplicationContext("com_009/spring/annotationautowiring/applicationContext.xml");
	A obj=(A)ctx.getBean("aobj");
	obj.m1();
	//B obj1=(B)ctx.getBean("bobj");
	//obj1.m1();
}
}
