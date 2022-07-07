package com.alejandro.designpatterns.creationals.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static com.alejandro.designpatterns.creationals.factory.Constants.*;

public class MariaDBConnection implements DBConnection {

	
	static {
		new org.mariadb.jdbc.Driver();
	}
	

	@Override
	public Connection getConnection() {
		try {
			return DriverManager.getConnection(URL_MARIADB, USER_MARIADB, PASS_MARIADB);
		} catch (SQLException e) {
			throw new IllegalStateException("Cant connect to mariaDB error: " + e.getMessage());
		}
	}

}
