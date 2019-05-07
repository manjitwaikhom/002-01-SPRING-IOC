package com_009.spring.annotationautowiring;

public class Hai extends Hello{
int x;
String msg;
Hai()
{
	System.out.println("Hai Default con.");
}

public void setX(int x) {
	this.x = x;
}
public void setMsg(String msg) {
	this.msg = msg;
}
public void show()
{
	System.out.println(x);
	System.out.println(msg);
	System.out.println(a);
	System.out.println(str);
}
}
