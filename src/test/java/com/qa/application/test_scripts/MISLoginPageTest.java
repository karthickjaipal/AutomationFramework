package com.qa.application.test_scripts;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.application.generic_methods.BasePage;
import com.qa.application.generic_methods.ReadExcel;
import com.qa.application.generic_methods.WebElementMethods;
import com.qa.application.pom.MISLoginPage;
import com.qa.application.utility.PropertyFile;

//Test class
public class MISLoginPageTest extends BasePage  {
	
	@Test
	public void checkLogin()
	{
		MISLoginPage mis=new MISLoginPage(driver);
		//Reading from PropertyFile
		/*mis.setUsername(prop.getProperty("username"));
		mis.setPassword(prop.getProperty("password"));*/
		
		//Reading from excel file
		//ReadExcel.readExcelData(sheetName, rownum, cellnum)
		String value=ReadExcel.readExcelData("Sheet1",1,0);
		System.out.println(value);
		mis.setUsername(value);
		mis.setPassword(ReadExcel.readExcelData("Sheet1",1,1));
		
		mis.selectMIS();
		mis.clickLogin();
		WebElement ele=driver.findElement(By.xpath("//b[.='Home']"));
		WebElementMethods wb=new WebElementMethods();
		Assert.assertTrue(wb.isElementDisplayed(ele));
	}
	
	

}
