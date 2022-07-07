package com.alejandro.designpatterns.creationals.facade;

public interface PaymentFacade {

	public PaymetResponse pay(PaymentRequest request) throws PaymentException;
	
}
