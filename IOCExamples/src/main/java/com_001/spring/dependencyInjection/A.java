package com_001.spring.dependencyInjection;

public class A
{
	Hello hello=null;
	Hai hai=null;
	public A()
	{
		System.out.println("A-D.C");
	}
	
	//setter
	public void setHello(Hello hello)
	{
		this.hello=hello;
	}
	public void setHai(Hai hai)
	{
		this.hai=hai;
	}
	void show()
	{
		hello.m1();
		hai.m2();
	}
}
