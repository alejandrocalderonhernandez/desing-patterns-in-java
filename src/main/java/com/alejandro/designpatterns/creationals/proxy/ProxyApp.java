package com.alejandro.designpatterns.creationals.proxy;

public class ProxyApp {
	
	public static void main(String[] args) {
		var service = ServiceFactory.createService();
		
		try {
			service.excecuteProcess(73891L, "alejandro", "secret");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		try {
			service.excecuteProcess(73891L, "unauthorized", "secret");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}

}
