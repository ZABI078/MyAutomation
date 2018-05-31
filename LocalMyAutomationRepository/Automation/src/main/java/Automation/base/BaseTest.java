package Automation.base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Automation.utilites.Utility;

public class BaseTest {
	
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
	
	@AfterMethod
	public void teardown () 
	
	{
		
		driver.quit();
	}
}
