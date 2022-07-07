package com.alejandro.designpatterns.creationals.factory;

public class FactoryApp {

	public static void main(String[] args) {
		var dao = new ProductDao();
		Product p = new Product("12345abcdef", "consola");
		dao.save(p);
		
		dao.get().forEach(System.out::print);
	}

}
