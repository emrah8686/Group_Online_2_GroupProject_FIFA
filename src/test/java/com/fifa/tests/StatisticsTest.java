package com.fifa.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.fifa.pages.HomePage;
import com.fifa.pages.StatisticsPage;
import com.fifa.tests.TestBase;
import com.fifa.utilities.ConfigurationReader;
import com.fifa.utilities.Driver;

public class StatisticsTest extends TestBase {

	@Test(priority = 1, groups= {"smoke"})
	public void pageVerification() {
		// name of the test
		extentLogger = report.createTest("FIFA website verification test");
		// info ()  --> to print a message
		extentLogger.info("Verifying FIFA Website Title");
		
		HomePage homePage = new HomePage();
		homePage.headerMenuStatistics.click();
		
		StatisticsPage statisticsPage = new StatisticsPage();
				
		String expected = "2018 FIFA World Cup Russia� - FIFA.com";
		System.out.println(Driver.getDriver().getTitle());
		
		assertEquals(Driver.getDriver().getTitle(), expected);
		// pass --> message the tells us what passed
		extentLogger.pass("Page title verified");
	}

	
	

}
