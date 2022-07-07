package com.alejandro.designpatterns.creationals.abstractFactory;

public class ConcretAbsractFactory {
	
	public static ServiceStackAbstractFactory createServiceFactori(ServiceType type) {
		switch (type) {
			case SOAP: return new SOAPServiceStackFactory();
			case REST: return new RESTServiceStackFactory();
			default: throw new IllegalArgumentException();
		}
		
	}

}
