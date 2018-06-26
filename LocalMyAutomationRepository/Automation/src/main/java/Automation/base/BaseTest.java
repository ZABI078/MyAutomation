package Automation.base;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Automation.utilites.Utility;

public class BaseTest{
	


	
	
	
	public WebDriver driver;
	
	


	
	@BeforeMethod
	public void SetupDriver () throws Exception 
	
	{
		if (Utility.fetchProperty("browserName").toString().equalsIgnoreCase("chrome")) 
		
		{
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else
			if (Utility.fetchProperty("browserName").toString().equalsIgnoreCase("firefox")) 
		
		{
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");	
			driver = new FirefoxDriver();	
		}
		
			else
				if (Utility.fetchProperty("browserName").toString().equalsIgnoreCase("ie")) 
			
			{
					System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
				driver = new InternetExplorerDriver();	
			}
		
			else 
			{
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				driver = new ChromeDriver();
			}
		
	}
	
	public void Initialize (String email, String password) throws IOException {
		
		driver.get(Utility.fetchProperty("ApplicationUrl").toString());
		driver.findElement(By.xpath(Utility.fetchLocatorValue("email_field_xpath"))).sendKeys(email);
		driver.findElement(By.xpath(Utility.fetchLocatorValue("password_field_xpath"))).sendKeys(password);
		

	}
	
	public boolean VerifyTextOnthePagae(String textToCheck, boolean status) {
		
		boolean VerifyText = driver.getPageSource().contains(textToCheck);
		Assert.assertEquals(VerifyText, status);
		return VerifyText;
	}
	

	
	@AfterMethod
	public void teardown () 
	
	{
		
		driver.quit();
	}
	

}
