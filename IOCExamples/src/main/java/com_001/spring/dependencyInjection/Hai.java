package com_001.spring.dependencyInjection;

public class Hai 
{
	String str;
	public Hai()
	{
		System.out.println("Hai-D.C");
	}
	
	//setter
	public void setStr(String str)
	{
		this.str=str;
	}
	public void m2()
	{
		System.out.println("Hai-m2()");
		System.out.println(str);
	}
}
