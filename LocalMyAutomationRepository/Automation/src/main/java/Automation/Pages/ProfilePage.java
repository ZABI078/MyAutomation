package Automation.Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Automation.base.BasePageObject;
import Automation.utilites.Utility;

public class ProfilePage extends BasePageObject<ProfilePage> {

	public ProfilePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void clickProfileName() throws Exception {
		
		driver.findElement(By.xpath(Utility.fetchLocatorValue("customerName_xpath"))).click();
		
	}
	
	public void clickonSignOut() throws Exception {
		
		driver.findElement(By.xpath(Utility.fetchLocatorValue("SignOutbttn_xpath"))).click();
		

	}

}
