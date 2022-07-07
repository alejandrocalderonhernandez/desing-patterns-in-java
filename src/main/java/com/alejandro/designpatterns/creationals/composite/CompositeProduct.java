package com.alejandro.designpatterns.creationals.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeProduct extends AbstractProduct {
	
	private List<AbstractProduct> products;

	public CompositeProduct(String name, Double price) {
		super(name, price);
		this.products = new ArrayList<>();
	}

	public List<AbstractProduct> getProducts() {
		return products;
	}

	public void setProducts(List<AbstractProduct> products) {
		this.products = products;
	}

	public void addProduct(AbstractProduct product) {
		this.products.add(product);
	}
	
	public void removeProduct(AbstractProduct product) {
		this.products.remove(product);
	}
	
	@Override
	public Double getPrice() {
		return 
				this.products.stream()
		.map(p -> p.getPrice())
		.reduce(0.0 ,  Double::sum);
	}
	
}
