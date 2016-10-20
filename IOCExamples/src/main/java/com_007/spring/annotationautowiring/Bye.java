package com_007.spring.annotationautowiring;

public class Bye {

	int num1;
	String name;

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Bye() {
		System.out.println("bye default const");
	}

}
