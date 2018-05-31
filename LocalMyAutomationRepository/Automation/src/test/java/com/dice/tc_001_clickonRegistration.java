package com.dice;

import org.testng.annotations.Test;

import Automation.Pages.DiceMainPage;
import Automation.base.BaseTest;


public class tc_001_clickonRegistration extends BaseTest {
	

	@Test
	public void Registration() throws Exception {
		
		DiceMainPage mp = new DiceMainPage(driver);

		mp.clickonLoginLink();
		Thread.sleep(1000);
		mp.clickonRegisterbutton();
		mp.getTitleofthePage();
		mp.getCurrentUrl();
		
	}
	

}
