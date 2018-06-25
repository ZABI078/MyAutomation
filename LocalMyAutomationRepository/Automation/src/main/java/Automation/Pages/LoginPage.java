package Automation.Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Automation.base.BasePageObject;
import Automation.base.BaseTest;
import Automation.utilites.Utility;

public class LoginPage extends BasePageObject<LoginPage>{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	

	
	
	public ProfilePage clickSignInbttn() throws Exception {
		
		driver.findElement(By.xpath(Utility.fetchLocatorValue("signIn_button_xpath"))).click();
		return new ProfilePage(driver);
		
	}
	
	public void getTitleofthePage () 
	
	{
		String title = driver.getTitle();
		
		System.out.println(title);
	}
	
	public void getCurrentUrl () 
	
	{
		
		String CurrentUrl = driver.getCurrentUrl();
		System.out.println(CurrentUrl);
	}
	
	public void VerifyLoginEmailGreenCheck () throws IOException {
		
		WebElement greencheck = driver.findElement(By.xpath(Utility.fetchLocatorValue("password_field_xpath")));
		
		if (greencheck.isDisplayed())
		{
			System.out.println("Green Check Display");
		}
		
		else
			
		{
			System.out.println("Not Display");
		}
	}

	public void verifyEmailFieldErrorMessage() throws IOException {
		
		WebElement emailErrorMessage = driver.findElement(By.xpath(Utility.fetchLocatorValue("EmailFieldErrorMessage_Xpath")));
		
		if (emailErrorMessage.isDisplayed()) 
	
		{
			System.out.println("Enter a valid email.");
		}
		
		else 
			
		{
			System.out.println("NO Error Message.");
		}
	
	}
	
}
