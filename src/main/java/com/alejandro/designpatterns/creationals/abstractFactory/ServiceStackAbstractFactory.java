package com.alejandro.designpatterns.creationals.abstractFactory;

public interface ServiceStackAbstractFactory {
	
	public EmployeeService getEmployeeService();
	
	public ProductService getProductService();

}
