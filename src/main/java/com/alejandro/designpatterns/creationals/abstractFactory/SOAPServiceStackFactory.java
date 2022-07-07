package com.alejandro.designpatterns.creationals.abstractFactory;

public class SOAPServiceStackFactory implements ServiceStackAbstractFactory {

	@Override
	public EmployeeService getEmployeeService() {
		return new EmloyeeWSService();
	}

	@Override
	public ProductService getProductService() {
		return new ProductWSService();
	}

}
