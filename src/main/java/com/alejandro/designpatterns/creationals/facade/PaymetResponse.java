package com.alejandro.designpatterns.creationals.facade;

public class PaymetResponse {
	
	private String confirmNumber;
	private double newBalance;
	private String newStatus;
	
	public String getConfirmNumber() {
		return confirmNumber;
	}
	
	public void setConfirmNumber(String confirmNumber) {
		this.confirmNumber = confirmNumber;
	}
	
	public double getNewBalance() {
		return newBalance;
	}
	
	public void setNewBalance(double newBalance) {
		this.newBalance = newBalance;
	}
	
	public String getNewStatus() {
		return newStatus;
	}
	
	public void setNewStatus(String newStatus) {
		this.newStatus = newStatus;
	}

}
