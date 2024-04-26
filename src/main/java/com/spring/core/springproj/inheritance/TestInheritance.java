package com.spring.core.springproj.inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.springproj.pojo.Pizza;

public class TestInheritance {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/core/springproj/inheritance/inheritance-context.xml");
		Pizza pizza1 = (Pizza)ctx.getBean("pizza1");
		System.out.println(pizza1);
	}

}
