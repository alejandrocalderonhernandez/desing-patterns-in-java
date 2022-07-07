package com.alejandro.designpatterns.creationals.strategy;

public class YBankCreditAdapter implements BankAdapter {

	YBankCreditApproveResult yResult = null;
	
	@Override
	public BankCreditResponse sendCreditRequest(BankCreditRequest request) {
	
		var api = new YBankCreditSender();
		var yRequest = new YBankCreditApprove(request.getCustomer(), (float) request.getAmount());
		
		YBankCreditSenderListener listener  = r  ->  {
			yResult = r;
		};
		api.sendCreditForValidate(yRequest, listener);
		
		do {
			try {
				System.out.println("waiting");
				Thread.sleep(100000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} while (this.yResult != null);
		
		var approved = yResult.getApproved().equalsIgnoreCase("Y") ? true : false;
		return new BankCreditResponse(approved);
	}



}
