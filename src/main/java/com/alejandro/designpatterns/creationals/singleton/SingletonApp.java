
package com.alejandro.designpatterns.creationals.singleton;

public class SingletonApp {

	public static void main(String[] args) {
		Configuration c1 = Configuration.getInstance();
		Configuration c2 = Configuration.getInstance();
		
		System.out.println(c1);
		System.out.println(c1 == c2);
		
		c2.setAppName("new-singleton");
		
		System.out.println(c1);

	}
}
