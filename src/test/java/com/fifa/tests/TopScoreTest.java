package com.fifa.tests;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.fifa.pages.PlayersCardsPage;
import com.fifa.pages.PlayersGoalScoredPage;
import com.fifa.pages.PlayersTopSavesPage;
import com.fifa.utilities.BrowserUtils;
import com.fifa.utilities.Driver;

public class TopScoreTest extends TestBase{
	
	PlayersGoalScoredPage topScores;
	BrowserUtils utils;

	//mvn test -Drunner=smoke_test_using_groups.xml
	
	//SPA 738
	@Test(groups= {"smoke"})
	public void topScorers() {
		
		extentLogger = report.createTest("Test1");

		extentLogger.info("Verifying top scorers");
		
		
		topScores = new  PlayersGoalScoredPage();
		
		assertEquals(Driver.getDriver().getTitle(),"2018 FIFA World Cup Russia™ - FIFA.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		topScores.st.click();
		topScores.allScorers.click();
   
		assertEquals(topScores.playerInfo(1), "Harry KANE 0 4 1");
		assertEquals(topScores.playerInfo(2), "Antoine GRIEZMANN 4 0 0");
		assertEquals(topScores.playerInfo(3), "Romelu LUKAKU 2 1 1");
		
		
		extentLogger.pass("Top scorers verified");
		
	}
	
	//SPA 740
	@Test
	public void topSaves() {
		
		extentLogger = report.createTest("Test2");

		extentLogger.info("Verifying top saves");
		
		
		
		utils.waitForPageToLoad(5);
		PlayersTopSavesPage save = new PlayersTopSavesPage();
		topScores = new  PlayersGoalScoredPage();
		topScores.st.click();
		topScores.allScorers.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		topScores.topSaves.click();
		
		System.out.println(save.topKeeper(1));
		System.out.println(save.topKeeper(2));
		System.out.println(save.topKeeper(3));
		
		assertEquals(save.topKeeper(1), "1 Thibaut COURTOIS 27"); 
		assertEquals(save.topKeeper(2), "2 Guillermo OCHOA 25");
		assertEquals(save.topKeeper(3), "3 Kasper SCHMEICHEL 21");
		
		extentLogger.pass("Top saves verified");
		
	}
	//SPA 744
	@Test
	public void topCards() {
		
		
		
		extentLogger = report.createTest("Test3");

		extentLogger.info("Verifying top cards");
		
		
		
		PlayersCardsPage cards = new PlayersCardsPage();
		utils.waitForPageToLoad(5);
		topScores = new  PlayersGoalScoredPage();
		topScores.st.click();
		topScores.allScorers.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		topScores.disciplinary.click();
		
		System.out.println(cards.topCardReceived(1));
		System.out.println(cards.topCardReceived(2));
		System.out.println(cards.topCardReceived(3));
		
		assertEquals(cards.topCardReceived(1), "1 Carlos SANCHEZ 1 0 1"); 
		assertEquals(cards.topCardReceived(2), "2 Michael LANG 0 0 1");
		assertEquals(cards.topCardReceived(3), "3 Jerome BOATENG 0 1 0");
		
		
		extentLogger.pass("Top cards verified");

}
	//871
	@Test
	public void groupTeamC() {
		
		extentLogger = report.createTest("Test4");

		extentLogger.info("Verifying Group C teams");
		
		
		utils.waitForPageToLoad(10);
		topScores = new  PlayersGoalScoredPage();
		topScores.groupsPage.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		topScores.groupC.click();
		
		String t1 = topScores.teamC("France").getText();
		String t2 = topScores.teamC("Denmark").getText();
		String t3 = topScores.teamC("Peru").getText();
		String t4 = topScores.teamC("Australia").getText();
		
		
		assertEquals("France",t1);
		assertEquals("Denmark",t2);
		assertEquals("Peru",t3);
		assertEquals("Australia",t4);
		
		
		extentLogger.pass("Group C teams verified");
		
	}
	
	//872
	@Test
	public void groupTeamD() {
		
		extentLogger = report.createTest("Test5");

		extentLogger.info("Verifying Group D teams");
		
		
		utils.waitForPageToLoad(10);
		topScores = new  PlayersGoalScoredPage();
		topScores.groupsPage.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		topScores.groupD.click();
		
		String t1 = topScores.teamD("Croatia").getText();
		String t2 = topScores.teamD("Argentina").getText();
		String t3 = topScores.teamD("Nigeria").getText();
		String t4 = topScores.teamD("Iceland").getText();
		
		assertEquals("Croatia",t1);
		assertEquals("Argentina",t2);
		assertEquals("Nigeria",t3);
		assertEquals("Iceland",t4);
	

		extentLogger.pass("Group D teams verified");
	}
}
