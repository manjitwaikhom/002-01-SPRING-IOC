package com_001.spring.dependencyInjection;

public class B 
{
	Hello hello=null;
	Hai hai=null;
	public B()
	{
		System.out.println("B-D.C");
	}
	public B(Hello hello,Hai hai)
	{
		System.out.println("B-2 arg");
		this.hello=hello;
		this.hai=hai;
	}
	void show()
	{
		hello.m1();
		hai.m2();
	}
}
