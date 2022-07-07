package com.alejandro.designpatterns.creationals.composite;

public  abstract class AbstractProduct {

	protected String name;
	protected Double price;
	
	public AbstractProduct(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "name=" + name + ", price=" + price ;
	}
	
}
