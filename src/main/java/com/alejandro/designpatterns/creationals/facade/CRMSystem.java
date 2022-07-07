package com.alejandro.designpatterns.creationals.facade;

public class CRMSystem {

    public Customer findCustomer(Long customerId){
        return OnMemoryDataBase.findCustomerById(customerId);
    }
}
