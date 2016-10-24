package com_016.spring.externalizingbeanproperties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Prog16 {

	public static void main(String[] args) {
		ApplicationContext actx = new ClassPathXmlApplicationContext(
				"com_016/spring/externalizingbeanproperties/applicationContext.xml");
		CredentialsBean credentialsBean = (CredentialsBean) actx
				.getBean("cred");
		credentialsBean.show();

	}

}
