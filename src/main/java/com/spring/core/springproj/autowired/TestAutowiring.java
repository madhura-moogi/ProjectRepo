package com.spring.core.springproj.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowiring {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/core/springproj/autowired/autowired-context.xml");
		  Employee e = (Employee)ctx.getBean("emp1"); 
		  System.out.println(e.toString());
		Employee e2 = (Employee)ctx.getBean("emp2");
		System.out.println(e2.toString());
	}

}
