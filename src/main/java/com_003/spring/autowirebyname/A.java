package com_003.spring.autowirebyname;

public class A {
	String msg;

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void show() {
		System.out.println(msg);
	}
}
