package com.alejandro.designpatterns.creationals.strategy;

public class BankCreditResponse {

	private boolean approve;

	
	public BankCreditResponse(boolean approve) {
		this.approve = approve;
	}

	public boolean isApprove() {
		return approve;
	}

	public void setApprove(boolean approve) {
		this.approve = approve;
	}
	
	
}
