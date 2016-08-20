package com.spring.dependencyInjection;

public class Hello 
{
	int x;
	public Hello(int x)
	{
		System.out.println("Hello-1 arg");
		this.x=x;
	}
	public void m1()
	{
		System.out.println("Hello-m1()");
		System.out.println(x);
	}
}
