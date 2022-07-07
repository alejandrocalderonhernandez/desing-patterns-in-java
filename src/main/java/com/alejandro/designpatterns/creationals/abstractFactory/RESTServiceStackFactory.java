package com.alejandro.designpatterns.creationals.abstractFactory;

public class RESTServiceStackFactory implements ServiceStackAbstractFactory{

	@Override
	public EmployeeService getEmployeeService() {
		return new EmployeeRESTService();
	}

	@Override
	public ProductService getProductService() {
		return new ProductRESTService();
	}

}
