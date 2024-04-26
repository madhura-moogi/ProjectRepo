package com.spring.core.springproj.pojo;

public class BaseClass {
	
	int num;

	
	
	public BaseClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BaseClass(int num) {
		super();
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "BaseClass [num=" + num + "]";
	}
	
	
	
		
		
}
