package Automation.Pages;

import org.openqa.selenium.WebDriver;

import Automation.base.BasePageObject;

public class LoginPage extends BasePageObject<LoginPage>{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public void openLoginPage() throws Exception {
		
		getPage();
	}
}
