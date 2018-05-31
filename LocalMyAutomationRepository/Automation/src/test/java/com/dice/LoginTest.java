package com.dice;

import org.testng.annotations.Test;

import Automation.Pages.LoginPage;
import Automation.Pages.ProfilePage;
import Automation.base.BaseTest;

public class LoginTest extends BaseTest{


	
	@Test
	public void positiveLoginTest() throws Exception {
		
		LoginPage login = new LoginPage (driver);
		ProfilePage profile = new ProfilePage(driver);
		
		
		login.openLoginPage();
		login.fillupEmailAndPassword("testautomation@mailinator.com", "Test1234!!");
		login.clickSignInbttn();
		login.getTitleofthePage();
		login.getCurrentUrl();
		profile.clickProfileName();
		Thread.sleep(1000);
		profile.clickonSignOut();
		
	}
}
