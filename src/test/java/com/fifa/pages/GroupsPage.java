package com.fifa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fifa.utilities.Driver;

public class GroupsPage {
	public GroupsPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(tagName = "title")
	public WebElement pageTitle;

	@FindBy(xpath = "//ul[@class='fi-section-header__nav']//li[2]//a")
	public WebElement teamMain;

	@FindBy(xpath = "//div[@class='fi-team-card__name']")
	public List<WebElement> allTeam;

	@FindBy(xpath = "//ul[@class='fi-section-header__nav']//li[3]//a")
	public WebElement groupIcon;

	@FindBy(xpath = "//span[contains(text(),'Group G')]")
	public WebElement groupGicon;

	@FindBy(xpath = "//span[contains(text(),'Group E')]")
	public WebElement groupEicon;

	@FindBy(xpath = "//td[contains(@class,'fi-table__teamname teamname-nolink')]//span[contains(@class,'fi-t__nText')][contains(text(),'Belgium')]")
	public WebElement Belg;
	@FindBy(xpath = "//td[contains(@class,'fi-table__teamname teamname-nolink')]//span[contains(@class,'fi-t__nText')][contains(text(),'England')]")
	public WebElement Engl;
	@FindBy(xpath = "//td[contains(@class,'fi-table__teamname teamname-nolink')]//span[contains(@class,'fi-t__nText')][contains(text(),'Tunisia')]")
	public WebElement Tuns;
	@FindBy(xpath = "//td[contains(@class,'fi-table__teamname teamname-nolink')]//span[contains(@class,'fi-t__nText')][contains(text(),'Panama')]")
	public WebElement Pana;
	@FindBy(xpath = "//td[contains(@class,'fi-table__teamname teamname-nolink')]//span[contains(@class,'fi-t__nText')][contains(text(),'Brazil')]")
	public WebElement Brazil;
	@FindBy(xpath = "//td[contains(@class,'fi-table__teamname teamname-nolink')]//span[contains(@class,'fi-t__nText')][contains(text(),'Switzerland')]")
	public WebElement Switzerland;
	@FindBy(xpath = "//td[contains(@class,'fi-table__teamname teamname-nolink')]//span[contains(@class,'fi-t__nText')][contains(text(),'Serbia')]")
	public WebElement Serbia;
	@FindBy(xpath = "//td[contains(@class,'fi-table__teamname teamname-nolink')]//span[contains(@class,'fi-t__nText')][contains(text(),'Costa Rica')]")
	public WebElement CostaRica;

	//

}
