package com.spring.core.springproj.pojo;

public class FoodItem {

	String name;
	int price;
	
	public FoodItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "FoodItem [name=" + name + ", price=" + price + "]";
	}
	
	
	
}
