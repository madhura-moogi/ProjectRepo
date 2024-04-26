package com.spring.core.springproj.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.springproj.pojo.ReferringClass;

public class TestRef {

	public static void main(String[] args) {
		ApplicationContext contxt = new ClassPathXmlApplicationContext("com/spring/core/springproj/ref/context-ref.xml");
		ReferringClass refClassObj = (ReferringClass)contxt.getBean("refObj");
		System.out.println(refClassObj);
	}

}
