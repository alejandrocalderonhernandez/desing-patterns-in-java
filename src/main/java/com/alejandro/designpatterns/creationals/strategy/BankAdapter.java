package com.alejandro.designpatterns.creationals.strategy;

public interface BankAdapter {
	
	public BankCreditResponse sendCreditRequest(BankCreditRequest request);

}
