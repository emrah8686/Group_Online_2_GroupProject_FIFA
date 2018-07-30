package com.fifa.pages;





import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.fifa.utilities.Driver;

public class PlayersCardsPage {

		public PlayersCardsPage() {
			PageFactory.initElements(Driver.getDriver(), this);
		}
	
	
		public WebElement topRank(int row){
			return Driver.getDriver().findElement(By.xpath("//tbody/tr["+row+"]/td[1]"));
			
		}
		
		public WebElement playerName(int row){
			return Driver.getDriver().findElement(By.xpath("//tbody/tr["+row+"]/td[2]"));
			
		}
		
		public WebElement topYellow(int row){
			return Driver.getDriver().findElement(By.xpath("//tbody/tr["+row+"]/td[4]"));
			
		}
		
		public WebElement topIndirectRed(int row){
			return Driver.getDriver().findElement(By.xpath("//tbody/tr["+row+"]/td[5]"));
			
		}
		public WebElement topDirectRed(int row){
			return Driver.getDriver().findElement(By.xpath("//tbody/tr["+row+"]/td[6]"));
			
		}
		
		
			
		
		public String topCardReceived(int num) {
			
			 String info = topRank(num).getText() + " " + playerName(num).getText()
					 +" "+topYellow(num).getText() + " " + topIndirectRed(num).getText() + " " + topDirectRed(num).getText();
			 return info;
			
		}
}
