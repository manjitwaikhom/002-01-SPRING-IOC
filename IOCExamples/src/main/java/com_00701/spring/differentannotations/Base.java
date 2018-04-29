package com_00701.spring.differentannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Base {
	/*@Autowired
	uses "by type" detection
	This annotation is applied on fields, setter methods, and constructors. The @Autowired annotation injects object dependency implicitly.
	When you use @Autowired on fields and pass the values for the fields using the property name, Spring will automatically assign the fields with the passed values.
	You can even use @Autowired  on private properties, as shown below. (This is a very poor practice though!)
	When you use @Autowired on setter methods, Spring tries to perform the by Type auto-wiring on the method.
	You are instructing Spring that it should initiate this property using setter method where you can add your custom code,
	like initializing any other property with this property.
	When you use @Autowired on a constructor, constructor injection happens at the time of object creation. 
	It indicates the constructor to auto-wire when used as a bean. One thing to note here is that only one 
	constructor of any bean class can carry the @Autowired annotation.
	NOTE: As of Spring 4.3, @Autowired  became optional on classes with a single constructor.*/
	@Autowired
	Hello hello;

	//autowired with qualifier
	/*@Qualifier
This annotation is used along with @Autowired annotation. When you need more control of the dependency injection process, 
@Qualifier can be used. @Qualifier can be specified on individual constructor arguments or method parameters.
 This annotation is used to avoid confusion which occurs when you create more than one bean of the same type and want to wire only one of them with a property.
Consider an example where an interface BeanInterface is implemented by two beans BeanB1 and BeanB2.

public class BeanB1 implements BeanInterface {
  //
}

public class BeanB2 implements BeanInterface {
  //
}

@Component
public class BeanB1 implements BeanInterface {
  //
}
@Component
public class BeanB2 implements BeanInterface {
  //
}
Now if BeanA autowires this interface, Spring will not know which one of the two implementations to inject.
One solution to this problem is the use of the @Qualifier annotation.
@Component
public class BeanA {
  @Autowired
  @Qualifier("beanB2")
  private BeanInterface dependency;
  ...
}
@Component
public class BeanA {
  @Autowired
  @Qualifier("beanB2")
  private BeanInterface dependency;
  ...
}
With the @Qualifier annotation added, Spring will now know which bean to autowire where beanB2 is the name of BeanB2.*/
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
