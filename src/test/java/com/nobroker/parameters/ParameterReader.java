package com.nobroker.parameters;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ParameterReader {

	Properties property;
	
	public ParameterReader() throws IOException {       
		
		// Create a BufferedReader to read the properties file from the specified path
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ABDASH\\eclipse-workspace\\NoBrokerProject\\src\\test\\resource\\parameters\\driverrepository.properties"));
		property = new Properties();
		property.load(br);
		br.close();
	}
	
	public String getDriverName() {
		return property.getProperty("driverName");
	}
	
    public String getDriverPath() {
		return property.getProperty("driverpath");
	}
    
    public String getMainUrl() {
		return property.getProperty("mainUrl");
	}
    
    public String getEdgeDriverName() {
		return property.getProperty("EdgedriverName");
	}
	
    public String getEdgeDriverPath() {
		return property.getProperty("Edgedriverpath");
	}
}
