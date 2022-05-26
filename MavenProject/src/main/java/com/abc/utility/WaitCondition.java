package com.abc.utility;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitCondition {
	
	//specific condition....explicit wait
	//webdriverWait and fluent Wait
	
	public static void waitforClick(WebElement element) {
		WebDriverWait wait=new WebDriverWait(BaseClassWithUsing_propertyfile.driver,Integer.parseInt(BaseClassWithUsing_propertyfile.prop.getProperty("expliciatewait") ));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void waitfortitle(WebElement element) {
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(BaseClassWithUsing_propertyfile.driver);
		wait.withTimeout(Duration.ofSeconds(Integer.parseInt(BaseClassWithUsing_propertyfile.prop.getProperty("expliciatewait"))));

		wait.until(ExpectedConditions.elementToBeClickable(element));
	 
	}
	
	public static void waitforenable(WebElement element) {
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(BaseClassWithUsing_propertyfile.driver);
		wait.withTimeout(Duration.ofSeconds(Integer.parseInt(BaseClassWithUsing_propertyfile.prop.getProperty("expliciatewait"))))
		.pollingEvery(Duration.ofSeconds(1))
		.ignoring(NoSuchElementException.class)
		.until(ExpectedConditions.visibilityOf(element));

}
	public static void elementpresent(WebElement element) {
		
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(BaseClassWithUsing_propertyfile.driver);
		wait.until(new ExpectedCondition<WebElement>() {

			public WebElement apply(WebDriver arg0) {
				// TODO Auto-generated method stub
				return null;
			
		}
		
		
	});
	}
}
