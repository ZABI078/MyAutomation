package Automation.base;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
	
}
