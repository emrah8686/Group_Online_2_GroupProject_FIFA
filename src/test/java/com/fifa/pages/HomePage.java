package com.fifa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fifa.utilities.Driver;

public class HomePage {
	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath= "//ul[@class='fi-section-header__nav']//a[text()='Statistics']")
	public WebElement headerMenuStatistics;
	
	@FindBy(xpath= "//ul[@class='fi-section-header__nav']//a[text()='Teams']")
	public WebElement headerMenuTeams;

	@FindBy(xpath="//ul[@class='fi-section-header__nav']//a[text()='Groups']")
	public WebElement headerLinkGroups;

}