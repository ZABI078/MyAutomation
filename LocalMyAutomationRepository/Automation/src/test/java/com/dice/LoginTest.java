package com.dice;

import org.testng.annotations.Test;

import Automation.Pages.LoginPage;
import Automation.base.BaseTest;

public class LoginTest extends BaseTest{

	
	@Test
	public void positiveLoginTest() throws Exception {
		
		LoginPage login = new LoginPage (driver);
		
		login.openLoginPage();
			
			
		
	}
}
