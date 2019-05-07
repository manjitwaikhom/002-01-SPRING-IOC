package com_011.spring.beanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;

public class IOCLab11 {
	public static void main(String str[] )
	{
		
		//Resource rs=new ClassPathResource("com_011/spring/beanfactory/applicationContext.xml");
		Resource rs=new FileSystemResource("/home/manjit/git/SPRING-IOC/IOCExamples/src/main/java/com_011/spring/beanfactory/applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(rs);
		System.out.println("Spring container ready..");
		Hello h=(Hello)factory.getBean("hello");
		h.show();	
	}
}
