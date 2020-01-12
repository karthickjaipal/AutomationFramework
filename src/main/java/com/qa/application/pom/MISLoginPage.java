package com.qa.application.pom;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.application.utility.PropertyFile;

public class MISLoginPage extends PropertyFile {

	public WebDriverWait wait;
	public Properties prop;
	
	@FindBy(id="username")
	private WebElement uname;
	
	@FindBy(id="password")
	private WebElement pwd;
	
	@FindBy(id="MIS")
	private WebElement misbox;
	
	@FindBy(id="mySelect")
	private WebElement loginbtn;
	
	public MISLoginPage(WebDriver driver)
	{
		//ExplicitWait
		prop=PropertyFile.ReadPropertyFile("./config2.properties");
		String time=prop.getProperty("explicitWait");
		wait=new WebDriverWait(driver,Long.parseLong(time));
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername(String username)
	{
		wait.until(ExpectedConditions.visibilityOf(uname)).sendKeys(username);
	}
	public void setPassword(String password)
	{
		pwd.sendKeys(password);
	}
	public void selectMIS()
	{
		misbox.click();
	}
	public void clickLogin()
	{
		loginbtn.click();
	}

}
