package com.fifa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.fifa.utilities.Driver;

public class PlayersTopSavesPage {
	public PlayersTopSavesPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	public WebElement topRank(int row){
		return Driver.getDriver().findElement(By.xpath("//tbody/tr["+row+"]/td[1]"));
		
	}
	
	public WebElement playerName(int row){
		return Driver.getDriver().findElement(By.xpath("//tbody/tr["+row+"]/td[2]"));
		
	}
	
	public WebElement topSaves(int row){
		return Driver.getDriver().findElement(By.xpath("//tbody/tr["+row+"]/td[5]"));
		
	}
	
	
	
		
	
	public String topKeeper(int num) {
		
		 String info = topRank(num).getText() + " " + playerName(num).getText()
				 +" "+topSaves(num).getText();
		 return info;
		
	}
	
	

}
