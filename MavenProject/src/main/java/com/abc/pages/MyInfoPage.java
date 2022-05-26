package com.abc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abc.utility.BaseClassWithUsing_propertyfile;

public class MyInfoPage {
	
	//POM with Pagefactory
	//edit button locator
	
	
	
	@FindBy(id = "menu_pim_viewMyDetails")
	WebElement myinfobtn;
	
	@FindBy(id = "personal_txtEmpFirstName")
	WebElement firstnametxt;
	
	@FindBy(xpath  = "//input[@name='personal[txtEmpMiddleName]']")
	WebElement middlenametxt;
	
	@FindBy(xpath  = "//input[@name='personal[txtEmpLastName]']")
	WebElement lastnametxt;
	
	@FindBy(id = "btnSave")
	
	WebElement editbutton;
	
	
	public MyInfoPage() {
		PageFactory.initElements(BaseClassWithUsing_propertyfile.driver, this);
	}
	
	public WebElement getMyInfoEditButton() {
		return editbutton;
		
	}
	public WebElement getMyInfofirstname() {
		return firstnametxt;
		
	}
	public WebElement getMyInfomiddlename() {
		return middlenametxt;
		
	}
	public WebElement getMyInfolastname() {
		return lastnametxt;
		
	}
	
	

	public void editbutton1(String firstnametxt, String middlenametxt, String lastnametxt) {
		
		getMyInfofirstname().clear();
		getMyInfofirstname().sendKeys(firstnametxt);
		getMyInfomiddlename().clear();
		getMyInfomiddlename().sendKeys(middlenametxt);
		getMyInfomiddlename().clear();
		getMyInfomiddlename().sendKeys(lastnametxt);
		
		
	}

}
