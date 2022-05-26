package com.abc.utility;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility extends Reporter {
	 
	public static String capturescreen () {
    //Convert web driver object to TakeScreenshot

	String dateName  = new SimpleDateFormat ("yyyyMMddhhmmss").format(Date());
	TakesScreenshot scrShot =((TakesScreenshot) driver); 
	//Call getScreenshotAs method to create image file	
    File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
    String destinationpath=filepath+"/"+dateName+".png";
	System.out.println("filepath"+ filepath);
	System.out.println("destinationpath" + destinationpath);
	File DestFile=new File(destinationpath);

	try {
	    FileUtils.copyFile(SrcFile, DestFile);

	} catch
	(IOException e) 
	{

	// TODO Auto-generated catch block

	e.printStackTrace();

	}
	
	 
	return dateName+".png";
	
}
}
