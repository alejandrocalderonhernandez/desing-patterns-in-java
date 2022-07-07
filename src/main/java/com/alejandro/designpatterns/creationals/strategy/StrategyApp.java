package com.alejandro.designpatterns.creationals.strategy;

public class StrategyApp {

	public static void main(String[] args) {
		BankCreditRequest request = new BankCreditRequest();
		request.setAmount(2000);
		request.setCustomer("Max");
		
		var xbank = new XBankCreditAdapter();
		var xResponse = xbank.sendCreditRequest(request);
		System.out.println(xResponse.isApprove());
		
		var yBanck = new YBankCreditAdapter();
		var yResponse = yBanck.sendCreditRequest(request);
		System.out.println(yResponse.isApprove());
		
	}
}
