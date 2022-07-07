package com.alejandro.designpatterns.creationals.strategy;

public class XBankCreditAdapter implements BankAdapter {

	@Override
	public BankCreditResponse sendCreditRequest(BankCreditRequest request) {
		var api = new XBankCreditAPI();
		var xRequest = new XBankCreditRequest(); 
		xRequest.setCustomerName(request.getCustomer());
		xRequest.setRequestAmount(request.getAmount());
		var xResponse = api.sendCreditRequest(xRequest);
		return new BankCreditResponse(xResponse.aproval);
	}

}
