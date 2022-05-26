 package com.abc.utility;


import java.io.File;
import java.lang.annotation.Target;
import java.sql.Date;

import javax.swing.text.Utilities;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import lombok.experimental.UtilityClass;

public class Reporter extends BaseClassWithUsing_propertyfile {
	
	

	
	@BeforeTest(alwaysRun=true)
	public static void Report() {
		Date now= new Date();
		String timestamp=now.toString().replace(":","_");//it is replacing : to - for date show
		File file=new File("Result/"+timestamp);//this will folder path
		file.mkdir();//it will create new folder
		filepath=file.getPath();
		spark=new  ExtentSparkReporter(file.getPath()+"/Result.html");
		//this is responsible for generating the report
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("Automation Report");
		spark.config().setReportName("ABCDEFG");
        reports = new ExtentReports();
        //below code will tell extend report that in which he has to generate report
        reports.attachReporter(spark);
        System.setProperty("ResultTime",file.getPath());
        
	}
	
	 public static void startTest(String Testcase) {
		 
		 test= reports.createTest(Testcase);
		 
	}
	 //extentreport
	 //passtest
	 public static void PassTest(String teststep) {
		 test.log(Status.PASS, teststep);
		 
	 }
	 public static void FailTest(String teststep) {
		test.fail(teststep, MediaEntityBuilder.createScreenCaptureFromPath(Utility.capturescreen().build();
		 //test.log(status.FAIL,teststep);
		// test.addScreenCaptureFromPath(Utility.captureScreen());
	 }
	 @AfterTest(alwaysRun = true)
	 public static void endTest() {
		 System.out.println("  after test ");
		// reports.endTest(test);
		 reports.flush();
	 }

}
