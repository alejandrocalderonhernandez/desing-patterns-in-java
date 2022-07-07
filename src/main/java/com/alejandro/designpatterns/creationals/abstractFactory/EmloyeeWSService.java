package com.alejandro.designpatterns.creationals.abstractFactory;

import java.util.Arrays;
import java.util.List;

public class EmloyeeWSService implements EmployeeService {

	@Override
	public List<String> getEmployees() {
		System.out.println("Calling employees SOAP");
		return Arrays.asList("Marck", "Arce", "Wiliams");
	}

}
