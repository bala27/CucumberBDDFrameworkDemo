package config;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigFileReader {
	
	private static Properties prop;
	private final static String propertyFilePath= "resources//Configuration.properties";
	
	public static void main(String[] args) {
		readconfigfile();
	}
	
	public static Properties readconfigfile(){
		
		prop = new Properties(); 
		try {
			InputStream input=new FileInputStream(propertyFilePath);
			prop.load(input);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
		 
	}

}
