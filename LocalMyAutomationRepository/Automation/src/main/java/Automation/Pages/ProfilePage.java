package Automation.Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Automation.base.BasePageObject;
import Automation.utilites.Utility;

public class ProfilePage extends BasePageObject<ProfilePage> {
	private By editProfilebttn = By.xpath("//button[@id = 'editProfile']");
	private By advanceSearchButtom = By.xpath("//a[@class='dice-btn-link'']");
	private By clickOnAddFNLink = By.xpath("//*[@id=\"topDiscoverable\"]/ol/li[1]/a");
	private By EnterFN = By.xpath("//*[@id=\"contactFirstNameInput\"]");

	public ProfilePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void clickProfileName() throws Exception {
		
		driver.findElement(By.xpath(Utility.fetchLocatorValue("customerName_xpath"))).click();
		
	}
	
	public void clickonSignOut() throws Exception {
		
		driver.findElement(By.xpath(Utility.fetchLocatorValue("SignOutbttn_xpath"))).click();
		

	}
	
	public void chooseFile (String filePath) throws IOException {
		
		driver.findElement(By.xpath(Utility.fetchLocatorValue("FileUpload_xpath"))).sendKeys(filePath);
	}

	public void WaitForProfilePageToLoad () 
	
	
	{
		
		waitForVisibilityof(editProfilebttn);
		//waitForVisibilityof(advanceSearchButtom, 10);
	}
	
	public void clickOnAddFNLink ()
	
	{
		driver.findElement(clickOnAddFNLink).click();
	}
	
	

	public void EnterFN(String fN) {

		driver.findElement(EnterFN).sendKeys(fN);
		
	}

}
