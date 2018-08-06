package com.fifa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fifa.utilities.Driver;

public class TeamsPage {
	public TeamsPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(tagName= "title")
	public WebElement pageTitle;
	
	@FindAll({@FindBy(xpath = "//div[@class='fi-team-card__name']")})
	public List<WebElement> allTeams;
	

	
	



}