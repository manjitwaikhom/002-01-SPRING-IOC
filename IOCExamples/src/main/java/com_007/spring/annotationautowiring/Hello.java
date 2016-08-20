package com_007.spring.annotationautowiring;

public class Hello {
int a;
String str;
Hello()
{
	System.out.println("Hello-0 arg con.");
}
public void setA(int a) {
	this.a = a;
}
public void setStr(String str) {
	this.str = str;
}
void show()
{
	System.out.println(a);
	System.out.println(str);
}
}
