package com.alejandro.designpatterns.creationals.composite;

import java.util.ArrayList;
import java.util.List;

public class Order {
	
	private Long id;
	private String customerName;
	private List<AbstractProduct> products;
	
	public Order(Long id, String customerName) {
		this.id = id;
		this.customerName = customerName;
		this.products = new ArrayList<>();
	}
	
	public void addProducts(AbstractProduct product) {
		this.products.add(product);
	}
	
	public Double getTotal() {
		return this.products.stream()
			.map(p -> p.getPrice())
			.reduce(0.0 ,  Double::sum);
	}
	
	public void printOrder() {
		System.out.println(
				   "id: " + this.id + "\n" +
					"customer: " + this.customerName + "\n" + 
				    "products: " + this.products
				);
		
		System.out.println("total: " + this.getTotal());
	}

}
