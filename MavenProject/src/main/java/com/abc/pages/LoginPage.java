package com.abc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.abc.utility.BaseClassWithUsing_propertyfile;

public class LoginPage {

	public WebElement getUsername() {
		return BaseClassWithUsing_propertyfile.driver.findElement(By.id("txtUsername"));
		
	}
	
	public WebElement getPasswordtxt() {
		return BaseClassWithUsing_propertyfile.driver.findElement(By.id("txtPassword"));
		
	}
	
	public WebElement getLoginbutton() {
		return BaseClassWithUsing_propertyfile.driver.findElement(By.id("btnLogin"));
		
	}

	
	public void Login(String usernsme, String password) {
		// TODO Auto-generated method stub
		getUsername().sendKeys(usernsme);
		getPasswordtxt().sendKeys(password);
		getLoginbutton().click();
	}
}
