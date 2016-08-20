package com.spring.variousbeanproperties;

import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab2 {
public static void main(String as[])
{
	System.out.println("Lab2-main function starts");
	ApplicationContext ctx=new ClassPathXmlApplicationContext("com/spring/variousbeanproperties/applicationContext.xml");
	Customer c=(Customer)ctx.getBean("cust");
	System.out.println("getCid()"+c.getCid());
	System.out.println("getCname()"+c.getCname());
	System.out.println("getEmails()"+c.getEmails());
	System.out.println("getPhones()"+c.getPhones());
	System.out.println("getRef()"+c.getRef());
	System.out.println("getMyProperties()"+c.getMyProperties());
	System.out.println("getAddress()"+c.getAddress());
	Set<Order> orders=c.getOrders();
	for(Order o:orders)
	{
		System.out.println(o);
	}
}
}
