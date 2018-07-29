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


public class StatisticsTest_Akmal extends TestBase {
	
	
	@Test(groups= {"smoke"})
	public void topScorerVerification() {
		
		extentLogger = report.createTest("Test1");
		
		extentLogger.info("Verifying the Top 3 Scorers");
		
		
		HomePage homePage = new HomePage();
		homePage.headerMenuStatistics.click();
		
		StatisticsPage statisticsPage = new StatisticsPage();
		
		assertTrue(statisticsPage.headerTopScorers.isDisplayed());
		
		assertEquals(statisticsPage.topScorer1Name.getText(), "HARRY KANE");
		assertEquals(statisticsPage.topScorer1Country.getText(), "ENGLAND");
		assertEquals(statisticsPage.topScorer1Goals.getText(), "6");
		
		assertEquals(statisticsPage.topScorer2Name.getText(), "ANTOINE GRIEZMANN");
		assertEquals(statisticsPage.topScorer2Country.getText(), "FRANCE");
		assertEquals(statisticsPage.topScorer2Goals.getText(), "4");
		
		
		assertEquals(statisticsPage.topScorer3Name.getText(), "ROMELU LUKAKU");
		assertEquals(statisticsPage.topScorer3Country.getText(), "BELGIUM");
		assertEquals(statisticsPage.topScorer3Goals.getText(), "4");
		
		extentLogger.pass("Top Scorers' info verified");
	}
	

}
