package com.abc.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.naming.event.NamespaceChangeListener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static Object driver;
	public Properties prop;//create globle
	/*public static WebDriver driver=null;
	
	purpose-this method will help to launch Firefox, Chrome,
	 * Edge browser for specific application
	
	
	public void BrowserLaunch(String Browsername,String url) {
		WebDriver driver=null;
		if(Browsername.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "Resources//chromedriver.exe");
		driver=new ChromeDriver();
		}
		//URl should be hard-coded (//URL should not hard-coded)
		
		 * driver.get(url); driver.manage().window().maximize();
		     //because there are single intity
		
	     
		if(Browsername.equalsIgnoreCase("edge")) {
		System.setProperty("webdriver.chrome.driver", "Resources//chromedriver.exe");
		driver=new ChromeDriver();
		}
		//URL should not hard-coded
		driver.get(url);
		driver.manage().window().maximize();
		
		
		
	  }
	 
	public void  readproperties() {
		//properties class obj create
		//load method call
		//getproperties
		//setproperties

	 prop=new Properties();
		try {
			prop.load(new FileInputStream("Resources//chromedriver.exe"));
	        prop.getProperty("Browsername");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	*/
	}

