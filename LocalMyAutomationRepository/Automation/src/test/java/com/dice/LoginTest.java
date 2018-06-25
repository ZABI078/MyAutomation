package com.dice;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Automation.Pages.LoginPage;
import Automation.Pages.ProfilePage;
import Automation.base.BaseTest;

public class LoginTest extends BaseTest{



	LoginPage login;

	
	@BeforeMethod
	public void TestSetup () {
		
		login = new LoginPage(driver);
		
	
		
	}
	
	
	@Test (priority = 1)
	public void negativeLoginTest () throws Exception {
		
		Initialize("jajd", "1333");
		login.clickSignInbttn();
		Thread.sleep(3000);
		login.verifyEmailFieldErrorMessage();
	}
	
	@Test (priority = 2)
	public void positiveLoginTest() throws Exception {
		
		
		
		Initialize("testautomation@mailinator.com", "Test1234!!");
		login.getCurrentUrl();
		//login.fillupEmailAndPassword("testautomation@mailinator.com", "Test1234!!");
		login.VerifyLoginEmailGreenCheck();
		Thread.sleep(3000);
		ProfilePage profile = login.clickSignInbttn();
		profile.WaitForProfilePageToLoad();

		
	
//		robot.setAutoDelay(2000);
//		
//		StringSelection stringselection= new StringSelection("\\\\commonapp-ad01\\users\\jaurangzeb\\Documents\\AutoTEST.docx");
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection, null);
//		robot.setAutoDelay(1000);
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_V);
//		
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//		robot.keyRelease(KeyEvent.VK_V);
//		
//		robot.setAutoDelay(1000);
//		
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);

		profile.clickProfileName();
			
		profile.clickonSignOut();
		
	
	}
}
