package com.dice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Automation.Pages.LoginPage;
import Automation.Pages.ProfilePage;
import Automation.base.BaseTest;

public class ProfileTest extends BaseTest{
	
	
	LoginPage login;
	ProfilePage profile;

	
	@BeforeMethod
	public void TestSetup () throws Exception {
		
		login = new LoginPage(driver);
		profile = new ProfilePage(driver);
		
		Initialize("testautomation@mailinator.com", "Test1234!!");
		login.VerifyLoginEmailGreenCheck();
		Thread.sleep(3000);
		login.clickSignInbttn();
		
		
	}
	
	
	@Test
	public void completeProfileTest() throws Exception {

		profile.WaitForProfilePageToLoad();
		profile.clickOnEditProfile();
		profile.EnterFN("David");
		profile.EnterLN("Smith");
		profile.EnterPhN("777-777-7777");
		profile.skill1("Facebook");
		profile.skill2("twitter");
		profile.skill3("Personal Website");
		profile.skill4("Linkdin");
		profile.clickonDonebttn();
		VerifyTextOnthePagae("chris", true);
		
		
	}


}
