package Automation.utilites;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utility {

	public static Object fetchProperty (String key) throws IOException {
		
		
		FileInputStream file = new FileInputStream("./Config/Config.properties");
		Properties property = new Properties();
		property.load(file);
		return property.getProperty(key);
		
	}
	
	
	public static String fetchLocatorValue (String key) throws IOException {
		
		
		FileInputStream file = new FileInputStream("./Config/Element.properties");
		Properties property = new Properties();
		property.load(file);
		return property.getProperty(key).toString();
		
	}
}
