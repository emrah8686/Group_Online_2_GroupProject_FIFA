package com.fifa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fifa.utilities.Driver;

public class StatisticsPage {
	public StatisticsPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(tagName= "title")
	public WebElement pageTitle;
	
	@FindBy(xpath = "//h1[contains(text(),'Top Scorers')]")
	public WebElement headerTopScorers;
	
	@FindBy(xpath = "//h1[contains(text(),'Tournament Statistics')]")
	public WebElement headerTournamentStatistics;
		
	@FindBy(xpath = "//a[@data-player-id='369419']//div[@class='fi-p__name']")
	public WebElement topScorer1Name;
	
	@FindBy(xpath = "//a[@data-player-id='369419']//div[@class='fi-p__country']")
	public WebElement topScorer1Country;
	
	@FindBy(xpath = "//a[@data-player-id='369419']/following-sibling::div/b")
	public WebElement topScorer1Goals;
	
	
	@FindBy(xpath = "//a[@data-player-id='336435']//div[@class='fi-p__name']")
	public WebElement topScorer2Name;
	
	@FindBy(xpath = "//a[@data-player-id='336435']//div[@class='fi-p__country']")
	public WebElement topScorer2Country;
	
	@FindBy(xpath = "//a[@data-player-id='336435']/following-sibling::div/b")
	public WebElement topScorer2Goals;
	
	
	@FindBy(xpath = "//a[@data-player-id='358112']//div[@class='fi-p__name']")
	public WebElement topScorer3Name;
	
	@FindBy(xpath = "//a[@data-player-id='358112']//div[@class='fi-p__country']")
	public WebElement topScorer3Country;
	
	@FindBy(xpath = "//a[@data-player-id='358112']/following-sibling::div/b")
	public WebElement topScorer3Goals;
	
	@FindBy(xpath = "//li//div[@class='fi-statistics-list-4-cols__data']//span[.='Goals scored']/preceding-sibling::b")
	public WebElement goalsScoredInTournament;

	@FindBy(xpath = "//li//div[@class='fi-statistics-list-4-cols__data']//span[.='Yellow cards']/preceding-sibling::b")
	public WebElement yellowCardsInTournament;
	
	@FindBy(xpath = "//li//div[@class='fi-statistics-list-4-cols__data']//span[.='Red Cards']/preceding-sibling::b")
	public WebElement redCardsInTournament;
	
	@FindBy(xpath = "//li//div[@class='fi-statistics-list-4-cols__data']//span[.='Passes Completed']/preceding-sibling::b")
	public WebElement passesCompletedInTournament;

}