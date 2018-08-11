package com.fifa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fifa.utilities.Driver;

public class PlayersGoalScoredPage {
	public PlayersGoalScoredPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(tagName= "title")
	public WebElement pageTitle;
	
	@FindBy(xpath= "//ul[@class='fi-section-header__nav']/li/a[.='Statistics']")
	public WebElement st;
	
	@FindBy(linkText= "All Scorers")
	public WebElement allScorers;
	
	@FindBy(xpath= "//div[@class='fi-boxed-page']/div/ul/li[2]/a")
	public WebElement topSaves;
	
	@FindBy(xpath= "//div[@class='fi-boxed-page']/div/ul/li[4]/a")
	public WebElement disciplinary;
	
	@FindBy(xpath= "//ul[@class='fi-section-header__nav']/li[3]/a")
	public WebElement groupsPage;
	
	
	@FindBy(linkText= "Group C")
	public WebElement groupC;
	
	@FindBy(linkText= "Group D")
	public WebElement groupD;
	
	
	
	public WebElement teamC(String team) {
		String xpath = "//table[@id='275079']/tbody/tr/td/div/div[2]/span[.='"+team+"']";
		return Driver.getDriver().findElement(By.xpath(xpath));
	}
	
	public WebElement teamD(String team) {
		String xpath = "//table[@id='275081']/tbody/tr/td/div/div[2]/span[.='"+team+"']";
		return Driver.getDriver().findElement(By.xpath(xpath));
	}
	
	public WebElement playerName(int row){
		return Driver.getDriver().findElement(By.xpath("//tbody/tr["+row+"]/td[2]"));
		
	}
	
	public WebElement scoreLeftFoot(int row){
		return Driver.getDriver().findElement(By.xpath("//tbody/tr["+row+"]/td[8]"));
		
	}
	
	public WebElement scoreRightFoot(int row){
		return Driver.getDriver().findElement(By.xpath("//tbody/tr["+row+"]/td[9]"));
		
	}
	public WebElement head(int row){
		return Driver.getDriver().findElement(By.xpath("//tbody/tr["+row+"]/td[10]"));
		
	}
	
	public String playerInfo(int num) {
		
		 String info = playerName(num).getText() + " " + scoreLeftFoot(num).getText()
				 +" "+scoreRightFoot(num).getText()+" "+head(num).getText();
		 return info;
		
	}
	
	

}