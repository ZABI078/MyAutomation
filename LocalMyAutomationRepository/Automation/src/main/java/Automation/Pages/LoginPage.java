package Automation.Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Automation.base.BasePageObject;
import Automation.utilites.Utility;

public class LoginPage extends BasePageObject<LoginPage>{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public void openLoginPage() throws Exception {
		
		getPage();
		
	}
	
	public void fillupEmailAndPassword (String email, String password) throws Exception {
		
		driver.findElement(By.xpath(Utility.fetchLocatorValue("email_field_xpath"))).sendKeys(email);
		driver.findElement(By.xpath(Utility.fetchLocatorValue("password_field_xpath"))).sendKeys(password);

		
	}
	
	public void clickSignInbttn() throws Exception {
		
		driver.findElement(By.xpath(Utility.fetchLocatorValue("signIn_button_xpath"))).click();
		
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

}
