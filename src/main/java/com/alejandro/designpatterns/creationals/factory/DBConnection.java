package com.alejandro.designpatterns.creationals.factory;

import java.sql.Connection;

public interface DBConnection {
	
	public Connection getConnection();

}
