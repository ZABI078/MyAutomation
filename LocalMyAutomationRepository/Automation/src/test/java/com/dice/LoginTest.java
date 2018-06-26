package com.dice;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Automation.Pages.LoginPage;
import Automation.Pages.ProfilePage;
import Automation.base.BaseTest;

public class LoginTest extends BaseTest{



	public ExtentReports extent;
	public ExtentTest test;
	
	LoginPage login;
		

	
	@BeforeMethod
	public void TestSetup () {
		
		extent = new ExtentReports("\\\\COMMONAPP-AD01\\users\\jaurangzeb\\Desktop\\MyAutomation\\LocalMyAutomationRepository\\Automation\\test-output\\eXReport.html",true);
		test = extent.startTest("Verify TestSetup");
		login = new LoginPage(driver);
		
		
	
		
	}
	
	
	@Test (priority = 1)
	public void negativeLoginTest () throws Exception {
		
		
		Initialize("jajd", "1333");
		test.log(LogStatus.INFO, "Verify Wrong USERNAME & PASSWORD ENTERED");
		login.clickSignInbttn();
		test.log(LogStatus.PASS, "click");
		Thread.sleep(3000);
		test.log(LogStatus.PASS, "driver waited 3000ms");
		login.verifyEmailFieldErrorMessage();
		test.log(LogStatus.PASS, "Error Displayed");
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test (priority = 2)
	public void positiveLoginTest() throws Exception {
		
		
		
		Initialize("testautomation@mailinator.com", "Test1234!!");
		test.log(LogStatus.INFO, "Verify Correct USERNAME & PASSWORD ENTERED");
		
		login.getCurrentUrl();
		test.log(LogStatus.INFO, "Verify current Url");
		//login.fillupEmailAndPassword("testautomation@mailinator.com", "Test1234!!");
		login.VerifyLoginEmailGreenCheck();
		test.log(LogStatus.INFO, "Verify Green Check mark");
		Thread.sleep(3000);
		test.log(LogStatus.INFO, "wait for to load");
		ProfilePage profile = login.clickSignInbttn();
		test.log(LogStatus.INFO, "click on signIN");
		profile.WaitForProfilePageToLoad();


		profile.clickProfileName();
		test.log(LogStatus.PASS, "click on Profile name");
			
		Thread.sleep(3000);

		
		profile.clickonSignOut();
		test.log(LogStatus.PASS, "click on Sign out");
		
		extent.endTest(test);
		extent.flush();
		
	
	}
}
