package Automation.Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Automation.base.DriverInstance;
import Automation.utilites.Utility;

public class DiceMainPage extends DriverInstance {
	
	WebDriver driver;
	public DiceMainPage(WebDriver driver) 
	{
		this.driver = driver;
		
	}
	
	public void clickonLoginLink () throws Exception 
	
	
	{
		
		driver.findElement(By.xpath(Utility.fetchLocatorValue("login_link_xpath"))).click();
	}

	public void clickonRegisterbutton () throws Exception 
	
	
	{
		
		driver.findElement(By.xpath(Utility.fetchLocatorValue("registration_bttn_xpath"))).click();

		
	}
}
