package com.alejandro.designpatterns.creationals.composite;

public class SimpleProduct extends AbstractProduct {
	
	private String brand;

	public SimpleProduct(String name, Double price, String brand) {
		super(name, price);
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return  "name=" + name + ", price=" + price  + "brand=" + brand;
	}
	
	

}
