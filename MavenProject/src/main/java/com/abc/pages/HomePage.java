package com.abc.pages;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abc.utility.BaseClassWithUsing_propertyfile;

public class HomePage {
	//page object model with page factory concept
	
	@FindBy(id = "menu_pim_viewMyDetails")
	WebElement myinfolink;
	
	
	//Locator of my Info
	
	public HomePage() {
		PageFactory.initElements(BaseClassWithUsing_propertyfile.driver, this);
	}
	public WebElement getMyInfoLink() {
		return myinfolink;
		
		
	}

}
