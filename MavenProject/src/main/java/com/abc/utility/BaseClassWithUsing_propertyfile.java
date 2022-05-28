package com.abc.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.gson.GsonExtentTypeAdapterBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseClassWithUsing_propertyfile {
          
   public static Properties prop;//create globle
   public static WebDriver driver=null;
   public static ExtentReports reports;
   public static ExtentSparkReporter spark;
   public static String filepath;
   public static ExtentTest test;
   public static 
   
	
	/*purpose-this method will help to launch Firefox, Chrome,
	 * Edge browser for specific application
	
	*/
	public void BrowserLaunch() {
		readproperties();
		if(prop.getProperty("Browsername").equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "Resources//chromedriver.exe");
		driver=new ChromeDriver();
		}
		//URl should be hard-coded (//URL should not hard-coded)
		/*
		 * driver.get(url); driver.manage().window().maximize();
		 */    //because there are single intity
		
	     
		else if(prop.getProperty("Browsername").equalsIgnoreCase("edge")) {
		System.setProperty("webdriver.chrome.driver", "Resources//chromedriver.exe");
		driver=new ChromeDriver();
		}
		//URL should not hard-coded
		driver.get(prop.getProperty("Url"));
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(prop.getProperty("defaultTime")), TimeUnit.SECONDS);
	
		
		
	  }
	 
	public void  readproperties() {
		//properties class obj create
		//load method call
		//getproperties
		//setproperties

	   prop=new Properties();
		try {
			prop.load(new FileInputStream("Resources/config.properties"));
	        System.out.println(prop.getProperty("Browsername"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
}}
