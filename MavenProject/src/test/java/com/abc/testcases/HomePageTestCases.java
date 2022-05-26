package com.abc.testcases;

import com.abc.pages.HomePage;
import com.abc.pages.LoginPage;
import com.abc.pages.LoginPageWithPageFactory;
import com.abc.pages.MyInfoPage;
import com.abc.utility.BaseClassWithUsing_propertyfile;

public class HomePageTestCases {

	//verify that user should be able to modify my info
	//step-1 
	//prequite - user should be login successfull
	//click on my info
	//click on edit button
	//update the firstname and click on save
	public static void main(String[] args) {
		
		BaseClassWithUsing_propertyfile baseClass=new BaseClassWithUsing_propertyfile();
		baseClass.BrowserLaunch();
	  
		LoginPageWithPageFactory loginPage=new LoginPageWithPageFactory();
		loginPage.Login("Admin", "admin123");
		
		
		HomePage homePage=new HomePage();
		homePage.getMyInfoLink().click();
		
		MyInfoPage myInfoPage=new MyInfoPage();
		myInfoPage.getMyInfoEditButton().click();
		myInfoPage.editbutton1("Sagar","Ramdas","Kakade");
		
		

	}

}
