package Automation.base;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Automation.utilites.Utility;

public class BasePageObject<T> {
	
	protected WebDriver driver;
	protected WebDriverWait wait;

	protected BasePageObject (WebDriver driver) {
		
		this.driver = driver;
		
		wait = new WebDriverWait(driver, 40);
	}
	
	protected T getPage () throws Exception {
		
		driver.get(Utility.fetchProperty("ApplicationUrl").toString());
		return (T) this;

	}
	
	protected void waitForVisibilityof(By locator, Integer... timeOutInSeconds ) 
	
	{
		int attempts = 0;
		while (attempts <2) 
		
			try {
				WaitFor(ExpectedConditions.visibilityOfElementLocated(locator), (timeOutInSeconds.length > 0 ? timeOutInSeconds [0] : null));
				break;
			
		} catch (StaleElementReferenceException e) {
			
			
		}
			attempts++;
	}
	
	private void WaitFor(ExpectedCondition<WebElement> condition, Integer timeOutInSeconds) {
		
		timeOutInSeconds = timeOutInSeconds != null ? timeOutInSeconds : 30;
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(condition);
	}
	
	
	
}
