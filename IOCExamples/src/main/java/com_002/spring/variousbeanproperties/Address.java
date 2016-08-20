package com_002.spring.variousbeanproperties;

public class Address {
private int adid;
private String street;
private String city;
public Address()
{
	
}
public Address(int adid,String street,String city)
{
	super();
	this.adid=adid;
	this.street=street;
	this.city=city;
	System.out.println("Address 3 arg constructor");
}
public String toString()
{
	return ""+adid+"\t"+street+"\t"+city;
}
}
