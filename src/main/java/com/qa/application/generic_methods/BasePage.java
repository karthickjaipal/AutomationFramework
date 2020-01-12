package com.qa.application.generic_methods;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.application.utility.PropertyFile;

public class BasePage {
	public WebDriver driver;
	
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty(Constants.CHROME_KEY,Constants.CHROME_VALUE);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(Constants.APPLICATION_URL);
	}
	
	
	
	@AfterMethod
	public void browserquit()
	{
		driver.quit();
	}
	
	
	
	

}
