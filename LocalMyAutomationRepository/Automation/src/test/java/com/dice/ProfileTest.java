package com.dice;

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
		

		login.openLoginPage();
		login.getCurrentUrl();
		login.fillupEmailAndPassword("testautomation@mailinator.com", "Test1234!!");
		login.VerifyLoginEmailGreenCheck();
		Thread.sleep(3000);
		login.clickSignInbttn();
		profile.WaitForProfilePageToLoad();
		
	}
	
	
	@Test
	public void completeProfileTest() throws Exception {
		
		
		
		Thread.sleep(10000);
		profile.clickOnAddFNLink();
		profile.EnterFN("David");


	}

	
	


}
