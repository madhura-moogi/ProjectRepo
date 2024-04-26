package com.spring.core.springproj.pojo;

public class ReferringClass {
	
	int x;
	BaseClass obj;
	
	
	public ReferringClass(int x, BaseClass obj) {
		super();
		this.x = x;
		this.obj = obj;
	}
	
	public ReferringClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public BaseClass getObj() {
		return obj;
	}
	public void setObj(BaseClass obj) {
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "ReferringClass [x=" + x + ", obj=" + obj + "]";
	}
	
	
	
	

}
