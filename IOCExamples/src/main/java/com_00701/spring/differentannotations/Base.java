package com_00701.spring.differentannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Base {
	// simple autowired uses "by type" detection
	@Autowired
	Hello hello;

	// autowired with qualifier
	@Autowired
	@Qualifier("hai1")
	Hai hai;

	// autowired with required
	@Autowired(required = true)
	Bye bye;

	// constructor autowired
	/*
	 * @Autowired public Base(Hello hello, Hai hai) { this.hai = hai; this.hello
	 * = hello; }
	 */

	// constructor autowired with qualifier
	@Autowired
	public Base(@Qualifier("hello1") Hello hello, @Qualifier("hai1") Hai hai,
			@Qualifier("bye") Bye bye) {
		this.hai = hai;
		this.hello = hello;
		this.bye = bye;
	}

	void m1() {
		System.out.println("A-m1");
		hai.show();
		hello.show();
	}
}
