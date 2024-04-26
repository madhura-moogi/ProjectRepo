package com.spring.core.springproj.cinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.springproj.pojo.Person;

public class TestConstructorInjection {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/core/springproj/cinjection/constructor-context.xml");
		Person p1= (Person) ctx.getBean("p1");
		Person p2 = (Person) ctx.getBean("p2");
		System.out.println(p1);
		System.out.println(p2);
	}

}
