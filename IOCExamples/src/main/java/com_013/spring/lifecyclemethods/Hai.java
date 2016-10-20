package com_013.spring.lifecyclemethods;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;

public class Hai implements DisposableBean {

	@PreDestroy
	public void myDestroy() {
		System.out.println("Hai-myDestroy()");
	}

	public void myDestroyMethod() {
		System.out.println("Hai-myDestroyMethod()");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Hai -destroy()");
	}

}
