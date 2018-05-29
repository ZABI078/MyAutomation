package com.dice;

import org.testng.annotations.Test;

import Automation.Pages.DiceMainPage;
import Automation.base.DriverInstance;

public class tc_001_clickonRegistration extends DriverInstance{
	
	
	@Test
	public void Registration() throws Exception {
		
		DiceMainPage mp = new DiceMainPage(driver);
		mp.clickonLoginLink();
		Thread.sleep(1000);
		mp.clickonRegisterbutton();
	}

}
