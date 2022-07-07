package com.alejandro.designpatterns.creationals.factory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ConnectionFactory {
	
	public static DBConnection getConnection(DBType dbType) {		
		switch (dbType) {
			case POSTGRESQL:
				return new PostresqlConnection();
		    case MARIA_DB:
		    	return new MariaDBConnection();
			default:
				throw new IllegalArgumentException("Invalid param");
		}
		
	}
	
	public static DBConnection getConnection() {
		var properties = ConnectionFactory.loadProperties();
		var dbType = properties.getProperty(DB_TYPE);
		try {
			return (DBConnection) Class.forName(dbType).getDeclaredConstructor().newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException();
		}

	}
	
	private static Properties loadProperties() {
		 try (InputStream input = new FileInputStream("src/main/resources/db.properties")) {
	        Properties properties = new Properties();
			properties.load(input);
			return properties;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	private static final String DB_TYPE = "db.type";

}
