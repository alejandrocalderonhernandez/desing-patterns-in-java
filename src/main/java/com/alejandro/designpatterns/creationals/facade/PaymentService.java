package com.alejandro.designpatterns.creationals.facade;

import java.util.HashMap;
import java.util.Map;

public class PaymentService implements PaymentFacade {
	
	private BankSystem bankSystem = new BankSystem();
	private BillingSystem billingSystem = new BillingSystem();
	private CRMSystem crmSystem = new CRMSystem();
	private EmailSystem emailSystem = new EmailSystem();

	@Override
	public PaymetResponse pay(PaymentRequest request) throws PaymentException {
		
		 PaymetResponse response = new PaymetResponse();
		try {
			
			Customer customer = crmSystem.findCustomer(request.getId());
			
			if( customer == null ) {
				throw new PaymentException("Invalid client id");
			}
			
			TransferRequest transferRequest =  new TransferRequest(
					request.getAmmount(),
					request.getCardNumber(), 
					request.getOwnerName(), 
					request.getCardExpireDate(), 
					request.getCardSecureNumber());
			
			String paymentReference = bankSystem.transfer(transferRequest);
			
			BillingPayRequest billingPayRequest = new BillingPayRequest(request.getId(), request.getAmmount());
			double newBalance = billingSystem.pay(billingPayRequest);
		
			String newStatus = customer.getStatus();
			
			if ( newBalance <= 50 ) {
				newStatus = "OK";
				OnMemoryDataBase.changeCustomerStatus(request.getId(), newStatus);
			}
			
			  Map<String, String> params = new HashMap<>();
	          params.put("$name", customer.getName());
	          params.put("$ammount", request.getAmmount()+"");
	          params.put("$newBalance", newBalance+"");
	          String number = request.getCardNumber();
	          String subfix = number.substring(number.length()-4, number.length());
	          params.put("$cardNumber", subfix);
	          params.put("$reference", paymentReference);
	          params.put("$newStatus", newStatus);
	          emailSystem.sendEmail(params);
	          
	        
	          response.setConfirmNumber(paymentReference);
	          response.setNewBalance(newBalance);
	          response.setNewStatus(newStatus);
	          
	          
		} catch (Exception e) {
			throw new PaymentException(e.getMessage());
		}
		
		return response;
		
	}

}
