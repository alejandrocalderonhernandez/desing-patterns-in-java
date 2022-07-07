package com.alejandro.designpatterns.creationals.proxy;

public class SecurityService {

	   public boolean authorization(String user,String password){
	        if(user.equals("alejandro") && password.equals("secret")){
	            System.out.println("User " + user + " authorized");
	            return true;
	        }else{
	            System.out.println("User  " + user + " unauthorized");
	            return false;
	        }
	    }
}
