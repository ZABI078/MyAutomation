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
	private By EnterLN = By.xpath("//*[@id=\"contactLastNameInput\"]");
	private By EnterPhN = By.xpath("//*[@id=\"contactPhoneNumberInput\"]");
	private By EditProfileBttn = By.xpath("//*[@id=\"editProfile\"]/span[2]");
	private By Skill1 = By.xpath("//*[@id=\"LinkedIn Profile\"]");
	private By Skill2 = By.xpath("//*[@id=\"Twitter\"]");
	private By Skill3 = By.xpath("//*[@id=\"Facebook\"]");
	private By Skill4 = By.xpath("//*[@id=\"Personal Website\"]");
	private By ClickOnDonebttn = By.xpath("//*[@id=\"profileForm\"]/div/div/div[4]/div/div/div/div[1]/div[4]/div/button");

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

		driver.findElement(EnterFN).clear();
		driver.findElement(EnterFN).sendKeys(fN);
		
	}
	
	public void EnterLN(String lN) {
		driver.findElement(EnterLN).clear();
		driver.findElement(EnterLN).sendKeys(lN);
	}
	
	public void EnterPhN(String num) {
		
		driver.findElement(EnterPhN).clear();
		driver.findElement(EnterPhN).sendKeys(num);
		
	}
	
	
	public void clickOnEditProfile () {
		
		driver.findElement(editProfilebttn).click();
		
	}
	
	public void skill1(String S1) {
		
		driver.findElement(Skill1).clear();
		driver.findElement(Skill1).sendKeys(S1);
		
	}

	public void skill2(String S2) {
		
		driver.findElement(Skill2).clear();
		driver.findElement(Skill2).sendKeys(S2);
	}
	
	public void skill3(String s3) {
		
		driver.findElement(Skill3).clear();
		driver.findElement(Skill3).sendKeys(s3);
	}
	
	public void skill4(String s4) {
		
		driver.findElement(Skill4).clear();
		driver.findElement(Skill4).sendKeys(s4);
	}
	
	public void clickonDonebttn() {
		
	driver.findElement(ClickOnDonebttn).click();
	}
}
