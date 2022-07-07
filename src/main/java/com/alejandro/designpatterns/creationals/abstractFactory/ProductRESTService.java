package com.alejandro.designpatterns.creationals.abstractFactory;

import java.util.Arrays;
import java.util.List;

public class ProductRESTService implements ProductService {

	@Override
	public List<String> getProducts() {
		System.out.println("Calling products REST");
		return Arrays.asList("Puma", "Adidas", "Nike");
	}

}
