package com.spring.dependencyInjection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab1 
{
	public static void main(String[] args) 
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/spring/dependencyInjection/applicationContext.xml");
		A ao=(A)ctx.getBean("aobj");
		ao.show();
		B bo=(B)ctx.getBean("bobj");
		bo.show();
	}

}
