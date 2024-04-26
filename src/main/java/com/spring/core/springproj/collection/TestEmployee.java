package com.spring.core.springproj.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.springproj.pojo.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		ApplicationContext contxt = new ClassPathXmlApplicationContext("./context-collections.xml");
		Employee emp1 = (Employee)contxt.getBean("emp1");
		System.out.println(emp1);
	}

}
