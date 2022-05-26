package com.abc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abc.utility.BaseClassWithUsing_propertyfile;

public class LoginPageWithPageFactory {
    @FindBy(id = "txtUsername")
    @CacheLookup
    WebElement username;
    
    @FindBy(id = "txtPassword")
    @CacheLookup
    WebElement password;
    
    @FindBy(id="btnLogin")
    @CacheLookup
    WebElement login;
    
    public LoginPageWithPageFactory() {
    	PageFactory.initElements(BaseClassWithUsing_propertyfile.driver, this);
    }
    
    public WebElement getUsername() {
		return username;
	}
	
	public WebElement getPasswordtxt() {
		return password;
	}
	
	public WebElement getLoginbutton() {
		return login;
	}

	public void Login(String usernsme, String password) {
		// TODO Auto-generated method stub
		getUsername().sendKeys(usernsme);
		getPasswordtxt().sendKeys(password);
		getLoginbutton().click();
	}


	
	
	}

	


