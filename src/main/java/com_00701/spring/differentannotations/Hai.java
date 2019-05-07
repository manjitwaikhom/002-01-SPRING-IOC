package com_00701.spring.differentannotations;

public class Hai{
int x;
String msg;


public Hai(int x, String msg) {
	super();
	this.x = x;
	this.msg = msg;
	System.out.println("Hai-2 arg");
}


public void show()
{
	System.out.println(x);
	System.out.println(msg);
}
}
