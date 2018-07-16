package com.geico.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration {

	
	private static Properties properties = new Properties();

	static {

		try {
			FileInputStream inputStream = new FileInputStream("Config.properties");
			properties.load(inputStream);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static String getProperty(String key) {

		return properties.getProperty(key);
	}

}// class
