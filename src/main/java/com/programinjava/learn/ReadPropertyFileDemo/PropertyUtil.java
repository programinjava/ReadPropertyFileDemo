package com.programinjava.learn.ReadPropertyFileDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyUtil {
//	define the path of property file 
private static final String PROPERTY_FILE_PATH="src/main/resources/app.properties";	
	public static String readProperty(String propName) {
		Properties prop = new Properties();
		InputStream input = null;
		String propValue = null;
		try {
			input = new FileInputStream(PROPERTY_FILE_PATH);
			prop.load(input);
			propValue = prop.getProperty(propName);
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return propValue;
	}

}
