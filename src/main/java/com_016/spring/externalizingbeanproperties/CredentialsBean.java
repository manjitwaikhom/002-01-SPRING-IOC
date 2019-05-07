package com_016.spring.externalizingbeanproperties;

import javax.annotation.Resource;

public class CredentialsBean {

	@Resource(name = "oracleDs")
	DataSource oracleDataSource;
	@Resource(name = "mysqlDs")
	DataSource mysqlDataSource;

	public void show() {
		System.out.println(oracleDataSource);
		System.out.println(mysqlDataSource);
	}

}
