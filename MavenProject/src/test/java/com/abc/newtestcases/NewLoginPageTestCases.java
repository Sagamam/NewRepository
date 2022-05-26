package com.abc.newtestcases;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.abc.pages.LoginPageWithPageFactory;
import com.abc.utility.BaseClassWithUsing_propertyfile;
import com.abc.utility.WaitCondition;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Report;
import com.aventstack.extentreports.model.ReportStats;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import net.bytebuddy.agent.builder.AgentBuilder.Identified.Extendable;

public class NewLoginPageTestCases extends LoginPageWithPageFactory{

	@Test (description="Verify that user should be able to login with valid credential"
			 , groups= {"smoketest","regressiontest"})
	public void TC1() {
        
		BaseClassWithUsing_propertyfile obj1=new  BaseClassWithUsing_propertyfile();
		obj1.BrowserLaunch();
		ExtentSparkReporter spark=new ExtentSparkReporter("Result/Result.html" );
		//this is responsible for generating the report
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("Automation test case");
		ExtentReports report=new ExtentReports();
		//Below code will tell Extent Report that in witch format he has to genrated
		report.attachReporter(spark);
		LoginPageWithPageFactory loginPage=new LoginPageWithPageFactory();
		
		//TEst case description
		ExtentTest test=report.createTest("veryfy user should able to login").assignAuthor("SagarKakade").assignCategory("regressiontest").assignCategory("smoketest");
		loginPage.Login("Admin","admin");
		test.log(Status.INFO, "Enter the username as Admin");
		test.log(Status.INFO, "Enter the passward as admin");
		test.log(Status.INFO, "Click on Login Button");
		if (BaseClassWithUsing_propertyfile.driver.findElement(By.id("spanMessage")).isDisplayed()){
			com.abc.utility.Reporter.FailTest("Testcase is fail as User is able to login with invalid credential");
			com.abc.utility.Reporter.PassTest("Testcase is pass as User is able to loging with valide credential");
			 
			//test.log(Status.PASS, "User is unable to login with invalid credential");
			System.out.println("Testcase is fail as User is able to login with valid credential");

		}else {
			com.abc.utility.Reporter.FailTest("Testcase is fail as User is able to login with invalid credential");
			
			System.out.println("Testcase is pass as user is able to login with valid credintial");
			
		}
		report.flush();

	}
	
	@Test
	public void TC2() {
		
		//driver is static variable
		LoginPageWithPageFactory loginPage=new LoginPageWithPageFactory();
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
	}}
		
		/*@Test(priority=4 , groups= ("smoke"))
		public void forgetpasswordlink() {
         
			ExtentReports report;
			ExtentTest test= report.createTest("verify user able to click on forget password link").assignAuthor("sagarkakade");
      
			Resetpaasword reset = new Resetpaasword();
			reset.getforgetpasswordlink().click();

			test.log(Status.INFO, "click on forget password link");

			if (reset.getcancelbutton().isDisplayed()) {

			test.log(Status. PASS, "user able to click on forget password link"); 
			System.out.println("test case pass: user able to click on forget password link");

			} else {

			test.log(Status.FAIL, "user unable to click on forget password link"); System.out.println("test case fail: user unable to click on forget password link");

		
			driver.navigate().back();

			report.flush();

	}*/
	


