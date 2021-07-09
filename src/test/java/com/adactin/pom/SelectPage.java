package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPage {

	
	
	public static WebDriver driver;
	
	@FindBy(id = "radiobutton_0")
	private WebElement radiobutton;
	
	@FindBy(id = "continue")
	private WebElement continue2;
	public SelectPage(WebDriver driver2) {
	     this.driver = driver2;
	     PageFactory.initElements(driver2, this);
	}

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getContinue2() {
		return continue2;
	}
}
