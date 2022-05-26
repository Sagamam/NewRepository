package com.abc.testcases;


import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.abc.pages.HomePage;
import com.abc.pages.LoginPage;
import com.abc.pages.LoginPageWithPageFactory;
import com.abc.utility.BaseClassWithUsing_propertyfile;
import com.abc.utility.WaitCondition;

public class LoginPageTestCases {
	
	/*open the browser with url 
	 * Enter valid credwntial and click
	 * 
	 * open the browser  with url
	 * Enter valid username
	 *     slelenium - find element and perform the operation
	 *     finding the element-Locatory
	 *     sendkey
	 * Enter valid password
	 *     findelement
	 *     sendkeys
	 * click on login button
	 *     findelement
	 *     click
	
	*/
	

	public static void main(String[] args) {
	 
		
		BaseClassWithUsing_propertyfile obj1=new  BaseClassWithUsing_propertyfile();
		
		obj1.BrowserLaunch();
		LoginPageWithPageFactory loginPage=new LoginPageWithPageFactory();
		loginPage.Login("Admin","admin");
		if (BaseClassWithUsing_propertyfile.driver.findElement(By.id("spanMessage")).isDisplayed()){
			System.out.println("Testcase is fail as User is able to login with valid credential");

		}else {
			System.out.println("Testcase is pass as user is able to login with valid credintial");
			
		}
		
		//driver is static variable
		loginPage.Login("Admin","admin123");
		//Explicit WaIT
		WaitCondition.waitforClick(BaseClassWithUsing_propertyfile.driver.findElement(By.id("dmenu_dashboard_inex")));
		//WebDriverWait wait=new WebDriverWait(BaseClassWithUsing_propertyfile.driver, 10);
		//wait.until(ExpectedConditions.elementToBeClickable(BaseClassWithUsing_propertyfile.driver.findElement(By.id("dmenu_dashboard_inex"))));
		if (BaseClassWithUsing_propertyfile.driver.findElement(By.id("dmenu_dashboard_inex")).isDisplayed()) {
			System.out.println(" User is Successfully able to login with valid credential");

		}else {
			System.out.println(" user is unable to login with valid credintial");
			
		}
	//get my info
		HomePage test=new HomePage();
		test.getMyInfoLink();
	}

}
