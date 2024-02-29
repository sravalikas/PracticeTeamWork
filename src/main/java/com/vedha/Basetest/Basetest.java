package com.vedha.Basetest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;



import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import com.vedha.CommonUtils.CommonUtils;
import com.vedha.Constants.Constants;

public class Basetest {

	public static WebDriver driver;
	public static Logger logger;
	public static Properties property;
		

	public Basetest()  {

		logger = Logger.getLogger(this.getClass());
		try {
			property = new Properties();
			FileInputStream file = new FileInputStream(Constants.TestData_Path);
			
			property.load(file);

		} catch (FileNotFoundException e) {
			// TODO: handle exception
		} catch (Exception e1) {
			// TODO: handle exception
		}
		// TODO Auto-generated constructor stub
	}
	
	
	
	public static WebDriver instance() {
		
			return driver;
		
	}
	
	@BeforeTest
	public void SetUpLoggers() {
	    CommonUtils.SetLog4j();
		
	}


}
