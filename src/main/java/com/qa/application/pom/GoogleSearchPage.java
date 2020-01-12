package com.qa.application.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearchPage {
	private WebDriverWait wait;
	
	@FindBy(xpath="//input[@name='q']")
	private WebElement googlesearchbar;
	
	@FindBy(xpath="//input[@name='btnK']")
	private WebElement searchbtn;
	
	
	public GoogleSearchPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		wait =new WebDriverWait(driver,30);
	}
	
	public void enterSearchCriteria(String data)
	{
		wait.until(ExpectedConditions.visibilityOf(googlesearchbar)).sendKeys(data);
	}
	
	public void clickSearch()
	{
		wait.until(ExpectedConditions.elementToBeClickable(searchbtn)).click();
	}

}
