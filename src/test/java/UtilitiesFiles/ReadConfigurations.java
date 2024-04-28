package UtilitiesFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigurations {

	Properties pro;
	
	String path = "C:\\Users\\panks\\Contacts\\VechicleRepairMechanicalRepairProject\\Configuration\\config.properties";
	
	public ReadConfigurations() {
		
		FileInputStream fis = null;
		
		pro = new Properties();
		
		
		try {
			fis = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			pro.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public  String geturl() {
		String p1 = pro.getProperty("url");
		if(p1!=null) {
			return p1;
		}
		else {
			throw new RuntimeException("url not found");
			
		}
	}
	
	
	public String geturl2() {
		String p3 = pro.getProperty("url2");
		if(p3!=null) {
			return p3;
		}
		
		else {
			throw new RuntimeException("url2 not found");
			
		}
		
	}
	
	public String geturl3() {
		String p4 = pro.getProperty("url3");
		if(p4!=null) {
			return p4;
		}
		
		else {
			throw new RuntimeException("url3 not found");
			
		}
		
	}
	
	
	
	public String getbrowser() {
		String p2  = pro.getProperty("browser");
		if(p2!=null) {
			return p2;
		}
		else {
			throw new RuntimeException("browser not found");
		}
	}
	
	
	
	
}
