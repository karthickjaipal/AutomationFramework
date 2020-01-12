package com.qa.application.test_scripts;

import org.testng.annotations.Test;

import com.qa.application.generic_methods.BasePage;
import com.qa.application.pom.GoogleSearchPage;

public class GoogleSearchTest extends BasePage {
	
	@Test
	public void testGoogleSearch()
	{
		GoogleSearchPage google=new GoogleSearchPage(driver);
		google.enterSearchCriteria("CitiusTech");
		google.clickSearch();
	}

}
