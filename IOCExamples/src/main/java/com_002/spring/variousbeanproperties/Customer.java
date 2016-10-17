package com_002.spring.variousbeanproperties;

import java.util.*;

public class Customer {
	private int cid;
	private String cname;
	private List<String> emails;
	private Set<Long> phones;
	private Map<String, Long> ref;
	private Properties myProperties;
	private Address address;
	private Set<Order> orders;

	public Customer(int cid, String cname, List<String> emails,
			Set<Long> phones, Address address) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.emails = emails;
		this.phones = phones;
		this.address = address;
		System.out.println("Customer 5 arg-constructor");
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

	public Set<Long> getPhones() {
		return phones;
	}

	public void setPhones(Set<Long> phones) {
		this.phones = phones;
	}

	public Map<String, Long> getRef() {
		return ref;
	}

	public void setRef(Map<String, Long> ref) {
		this.ref = ref;
	}

	public Properties getMyProperties() {
		return myProperties;
	}

	public void setMyProperties(Properties myProperties) {
		this.myProperties = myProperties;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Set<Order> getOrders() {
		return orders;
	}

	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}

}
