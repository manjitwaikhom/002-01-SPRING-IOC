package com_008.spring.resourceannotation;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab8 {
public static void main(String as[])
{
	ApplicationContext ctx=new ClassPathXmlApplicationContext("com_008/spring/resourceannotation/applicationContext.xml");
	Base obj=(Base)ctx.getBean("aobj");
	obj.m1();
	B obj1=(B)ctx.getBean("bobj");
	obj1.m1();
}
}
