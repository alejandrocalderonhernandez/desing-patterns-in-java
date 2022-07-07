package com.alejandro.designpatterns.creationals.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static com.alejandro.designpatterns.creationals.factory.Constants.*;

public class PostresqlConnection implements DBConnection {
	
	static {
		new org.postgresql.Driver();
	}

	@Override
	public Connection getConnection() {
		try {
			return DriverManager.getConnection(URL_POSTGRESQL, USER_POSTGRESQL, PASS_POSTGRESQL);
		} catch (SQLException e) {
			throw new IllegalStateException("Cant connect to postgresql error: " + e.getMessage());
		}
	}

}
