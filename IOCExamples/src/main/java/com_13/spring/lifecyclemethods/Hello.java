package com_13.spring.lifecyclemethods;

import org.springframework.beans.factory.InitializingBean;

// using initilizing bean
public class Hello implements InitializingBean {

	/*
	 * @PostConstruct public void myInit() { System.out.println
	 * ("Hello-myInit()"); }
	 */

	public void myInitMethod() {
		System.out.println("Hello-myInitMethod()");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(" Hello afterPropertiesSet()");

	}
}
