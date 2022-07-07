package com.alejandro.designpatterns.creationals.facade;

public class PaymentRequest {
	
	private long id;
	private double ammount;
	private String cardNumber;
	private String cardExpireDate;
	private String cardSecureNumber;
	private String ownerName;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public double getAmmount() {
		return ammount;
	}
	
	public void setAmmount(double ammount) {
		this.ammount = ammount;
	}
	
	public String getCardNumber() {
		return cardNumber;
	}
	
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	public String getCardExpireDate() {
		return cardExpireDate;
	}
	public void setCardExpireDate(String cardExpireDate) {
		this.cardExpireDate = cardExpireDate;
	}
	
	public String getCardSecureNumber() {
		return cardSecureNumber;
	}
	
	public void setCardSecureNumber(String cardSecureNumber) {
		this.cardSecureNumber = cardSecureNumber;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

}
