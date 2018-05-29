package com.dice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Automation.base.DriverInstance;

public class FirstTest extends DriverInstance{
	
	
		
	@Test
	public void FirstTestMethod ( ) 
	
	{
		
		//Open Dice website
				
		System.out.println("dice opned");
		
	}
	
	
	@Test
	public void SecondTestMethod ()  
	
	{
		
		
	}

}
