package com_006.spring.pnamespace;

public class Hello {
private A aobj=null;
private B bobj=null;


public void setAobj(A aobj) {
	this.aobj = aobj;
}


public void setBobj(B bobj) {
	this.bobj = bobj;
}


void show()
{
	aobj.showA();
	bobj.showB();
}
}
