package com.alejandro.designpatterns.creationals.singleton;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Configuration {

	private static Configuration configuration;
	private String appName;
	private String appVersion;
	private String dateFormat;
	private String currencyDate;
	/*
	 * appName=singleton-application appVersion=1.0.0 dateFormat=dd/MM/YYYY
	 * currencyDate=#0.00
	 */
	private Configuration() {
		try {
			InputStream input = new FileInputStream("src/main/resources/config.properties");
			Properties props = new Properties();
			props.load(input);
			this.appName = props.getProperty("appName");
			this.appVersion = props.getProperty("appVersion");
			this.dateFormat = props.getProperty("dateFormat");
			this.currencyDate = props.getProperty("currencyDate");
		} catch (Exception e) {
			System.err.println("Error to load properties files: " + e.getMessage());
		}
	}
	
	public static Configuration getInstance() {
		if (configuration == null) {
			configuration = new Configuration();
		} 
		return configuration;
		
	}
	
	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getDateFormat() {
		return dateFormat;
	}

	public void setDateFormat(String dateFormat) {
		this.dateFormat = dateFormat;
	}



	public String getCurrencyDate() {
		return currencyDate;
	}

	public void setCurrencyDate(String currencyDate) {
		this.currencyDate = currencyDate;
	}

	@Override
	public String toString() {
		return "Configuration [appName=" + appName + ", appVersion=" + appVersion + ", dateFormat=" + dateFormat
				+ ", currencyDate=" + currencyDate + "]";
	}

	
 }
