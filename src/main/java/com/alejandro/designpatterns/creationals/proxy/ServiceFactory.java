package com.alejandro.designpatterns.creationals.proxy;

public class ServiceFactory {

	public static IProcessExcecutor createService() {
		return new ProcessExcecutorProxy();
	}
	
}
