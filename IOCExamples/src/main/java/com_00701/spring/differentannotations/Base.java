package com_00701.spring.differentannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

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

	public Hello getHello() {
		return hello;
	}

	/* @Required This annotation is applied on bean setter methods. Consider a scenario where you need to enforce a required property.
	The @Required annotation indicates that the affected bean must be populated at configuration time with the required property.
	Otherwise an exception of type BeanInitializationException is thrown.*/
	@Required
	public void setHello(Hello hello) {
		this.hello = hello;
	}

	public Hai getHai() {
		return hai;
	}

	public void setHai(Hai hai) {
		this.hai = hai;
	}

	public Bye getBye() {
		return bye;
	}

	public void setBye(Bye bye) {
		this.bye = bye;
	}
	
	
}
