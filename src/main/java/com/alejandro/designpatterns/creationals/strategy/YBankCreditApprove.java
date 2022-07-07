package com.alejandro.designpatterns.creationals.strategy;

public class YBankCreditApprove {
    public String name;
    public float credit;

    
    public YBankCreditApprove(String name, float credit) {
		this.name = name;
		this.credit = credit;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCredit() {
        return credit;
    }

    public void setCredit(float credit) {
        this.credit = credit;
    }   
}
