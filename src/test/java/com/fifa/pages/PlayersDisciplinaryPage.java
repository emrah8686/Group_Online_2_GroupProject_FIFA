package com.fifa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fifa.utilities.Driver;

public class PlayersDisciplinaryPage {
	public PlayersDisciplinaryPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(tagName= "title")
	public WebElement pageTitle;



}