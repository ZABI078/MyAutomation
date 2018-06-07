package com.dice;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Automation.Pages.LoginPage;
import Automation.Pages.ProfilePage;
import Automation.base.BaseTest;

public class LoginTest extends BaseTest{

	LoginPage login;
	ProfilePage profile;
	
	@BeforeMethod
	public void TestSetup () {
		
		login = new LoginPage(driver);
		profile = new ProfilePage(driver);
	}
	
	
	@Test (priority = 1)
	public void negativeLoginTest () throws Exception {
		
		login.openLoginPage();
		login.fillupEmailAndPassword("1222", "abac11");
		Thread.sleep(3000);
		login.verifyEmailFieldErrorMessage();
	}
	
	@Test (priority = 2)
	public void positiveLoginTest() throws Exception {
		
		
		
		login.openLoginPage();
		login.fillupEmailAndPassword("testautomation@mailinator.com", "Test1234!!");
		login.VerifyLoginEmailGreenCheck();
		Thread.sleep(3000);
//		login.clickSignInbttn();
//		login.getTitleofthePage();
//		login.getCurrentUrl();
//		
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

		
		
//		profile.chooseFile(filePath);
//		
//		profile.clickProfileName();
//		Thread.sleep(1000);
//		profile.clickonSignOut();
//		
	}
}
