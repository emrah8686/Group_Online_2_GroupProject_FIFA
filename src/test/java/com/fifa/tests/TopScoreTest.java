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
	
	//SPA 738
	@Test(priority=1,groups= {"topPlayers"})
	public void topScorers() {
		topScores = new  PlayersGoalScoredPage();
		
		assertEquals(Driver.getDriver().getTitle(),"2018 FIFA World Cup Russia™ - FIFA.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		topScores.st.click();
		topScores.allScorers.click();
   
		assertEquals(topScores.playerInfo(1), "Harry KANE 0 4 1");
		assertEquals(topScores.playerInfo(2), "Antoine GRIEZMANN 4 0 0");
		assertEquals(topScores.playerInfo(3), "Romelu LUKAKU 2 1 1");
		
	}
	
	//SPA 740
	@Test(priority=3,groups= {"topPlayers"})
	public void topSaves() {
		utils.waitForPageToLoad(20);
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
		
		
		
	}
	//SPA 744
	@Test(priority=3,groups= {"topPlayers"})
	public void topCards() {
		PlayersCardsPage cards = new PlayersCardsPage();
		utils.waitForPageToLoad(20);
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

}
	
}
