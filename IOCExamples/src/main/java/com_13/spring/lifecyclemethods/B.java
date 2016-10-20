package com_13.spring.lifecyclemethods;

public class B {
	Hello hello = null;
	Hai hai = null;

	public B() {
		System.out.println("B-D.C");
	}

	public B(Hello hello, Hai hai) {
		System.out.println("B-2 arg");
		this.hello = hello;
		this.hai = hai;
	}

}
