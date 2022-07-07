package com.alejandro.designpatterns.creationals.abstractFactory;

import java.util.List;

public class AbstractFactoryApp {
	
	public static void main(String[] args) {
		var restServiceFactory = ConcretAbsractFactory.createServiceFactori(ServiceType.REST);
		var soapServiceFactory = ConcretAbsractFactory.createServiceFactori(ServiceType.SOAP);
	
		var restEmployeeService = restServiceFactory.getEmployeeService();
		var restProductService = restServiceFactory.getProductService();
		
		printer(restEmployeeService.getEmployees());
		printer(restProductService.getProducts());
		
		var soapEmployeeService = soapServiceFactory.getEmployeeService();
		var soapProductService = soapServiceFactory.getProductService();
		
		printer(soapEmployeeService.getEmployees());
		printer(soapProductService.getProducts());
;

		
	}

	private static void printer(List<String> items) {
		items.forEach(System.out::println);
	}
}
