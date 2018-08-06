package com.fifa.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
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

	@Test(groups= {"smoke"})
	public void pageVerification() {
		// name of the test
		extentLogger = report.createTest("Test3");
		// info ()  --> to print a message
		extentLogger.info("Verifying FIFA Website Title");
		
		HomePage homePage = new HomePage();
		homePage.headerMenuStatistics.click();
		
		StatisticsPage statisticsPage = new StatisticsPage();
				
		String expected = "2018 FIFA World Cup Russia";
		System.out.println(Driver.getDriver().getTitle());
		
		assertTrue(Driver.getDriver().getTitle().contains(expected));
		// pass --> message the tells us what passed
		extentLogger.pass("Page title verified");
	}
	@Test
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
	
	@Test
	public void topScorerCountryVerificationNegative() {
         extentLogger = report.createTest("Test2");
		
		extentLogger.info("Verifying the Top 3 Scorers' Country - Negative");
		
		
		HomePage homePage = new HomePage();
		homePage.headerMenuStatistics.click();
		
		StatisticsPage statisticsPage = new StatisticsPage();
		
		assertTrue(statisticsPage.headerTopScorers.isDisplayed());
		
		
		assertNotEquals(statisticsPage.topScorer1Country.getText(), "SWEDEN");
		
		
	
		assertNotEquals(statisticsPage.topScorer2Country.getText(), "MEXICO");
	
		
		
		assertNotEquals(statisticsPage.topScorer3Country.getText(), "KOREA REPUBLIC");
		
		
		extentLogger.pass("Top Scorers' country verified - Negative ");
	}
	
	@Test(groups= {"smoke"})
	public void tournamentStatisticsVerification() {
		
		extentLogger = report.createTest("Test3");
			
		extentLogger.info("Verifying Tournament Statistics");
		
		
		HomePage homePage = new HomePage();
		homePage.headerMenuStatistics.click();
		
		StatisticsPage statisticsPage = new StatisticsPage();
		
		assertTrue(statisticsPage.headerTournamentStatistics.isDisplayed());
		
		assertEquals(statisticsPage.goalsScoredInTournament.getText(), "169");
		assertEquals(statisticsPage.yellowCardsInTournament.getText(), "219");
		assertEquals(statisticsPage.redCardsInTournament.getText(), "4");
		assertEquals(statisticsPage.passesCompletedInTournament.getText(), "49651");
		
		
		
		extentLogger.pass("Tournament Statistics Verified");
	}
	
	


	

}
