package com.qsp.Magneto.GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtils {
	
	public String readTheDataFromPropertiesFile(String key) throws Throwable {
		FileInputStream fis = new FileInputStream("./src/test/resources/common.properties");
		Properties p = new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
		
	
		
	}

}
