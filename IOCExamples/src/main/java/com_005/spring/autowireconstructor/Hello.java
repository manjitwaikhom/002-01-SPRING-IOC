package com_005.spring.autowireconstructor;

public class Hello {
private Hai hai=null;
private A aobj=null;

public Hello()
{
	System.out.println("Hello zero arg con");
}

public Hello(Hai hai,A aobj)
{
	System.out.println("Hello 2 arg con");
	this.hai=hai;
	this.aobj=aobj;
}
public Hello(Hai hai)
{
	System.out.println("Hello 1(Hai) arg con");
	this.hai=hai;
}

public Hello(A aobj)
{
	System.out.println("Hello 1(A) arg con");
	this.aobj=aobj;
}

void m1()
{
	hai.show();
	aobj.show();
}
}
