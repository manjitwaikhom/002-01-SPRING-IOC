package com_008.spring.resourceannotation;

import javax.annotation.Resource;

public class Base {
	// uses by name if name is specified
	@Resource(name = "hello1")
	Hello hello1;

	@Resource(name = "hello2")
	Hello hello2;

	// uses by type detection if name is not specified
	@Resource
	Hai hai;

	void m1() {
		System.out.println("A-m1");
		hello1.show();
		hello2.show();
		hai.show();
	}
}
