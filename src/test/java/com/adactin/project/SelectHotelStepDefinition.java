package com.adactin.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.adactin.Baseclass.Base_Class;
import com.adactin.pom.SelectPage;
import com.adactin.property.Page_Object_Manager;
import com.adactin.runner.RunnerClass;

import cucumber.api.java.en.*;

public class SelectHotelStepDefinition extends Base_Class {
	
	public static WebDriver driver = RunnerClass.driver;
	
	//SelectPage sp = new SelectPage(driver);
	
	Page_Object_Manager pom = new Page_Object_Manager(driver);
      
	@When("^User clicks the radio button$")
	public void user_clicks_the_radio_button() throws Throwable {
	   clickOnelement(pom.getObjSelect().getRadiobutton()); 
	}

	@When("^User clicks the continue button$")
	public void user_clicks_the_continue_button() throws Throwable {
	    clickOnelement(pom.getObjSelect().getContinue2());
	}

	@Then("^User validate the continue button$")
	public void user_validate_the_continue_button() throws Throwable {
	   
	}

}
