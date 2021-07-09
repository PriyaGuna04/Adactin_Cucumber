package com.adactin.project;

import org.openqa.selenium.WebDriver;

import com.adactin.Baseclass.Base_Class;
import com.adactin.pom.BookingPage;
import com.adactin.property.Page_Object_Manager;
import com.adactin.runner.RunnerClass;

import cucumber.api.java.en.*;

public class BookingStepdefinition extends Base_Class {
	
	public static WebDriver driver = RunnerClass.driver;
	
	//BookingPage bp = new BookingPage(driver);
	Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	@When("^User enters \"([^\"]*)\" as firstname$")
	public void user_enters_as_firstname(String arg1) throws Throwable {
	    inputOfelement(pom.getObjBook().getFirstname(), arg1);
	}

	@When("^User enters \"([^\"]*)\" as lastname$")
	public void user_enters_as_lastname(String arg1) throws Throwable {
	    inputOfelement(pom.getObjBook().getLastname(), arg1);
	}

	@When("^user enters \"([^\"]*)\" as Billing address$")
	public void user_enters_as_Billing_address(String arg1) throws Throwable {
	    inputOfelement(pom.getObjBook().getAddress(), arg1);
	}

	@When("^User enters \"([^\"]*)\" as Credit card number$")
	public void user_enters_as_Credit_card_number(String arg1) throws Throwable {
	    inputOfelement(pom.getObjBook().getCcnum(), arg1);
	}

	@When("^User selects credit card type$")
	public void user_selects_credit_card_type() throws Throwable {
	    dropDown(pom.getObjBook().getCctype(), "byValue", "VISA");
	}

	@When("^User selects expiry month$")
	public void user_selects_expiry_month() throws Throwable {
	    dropDown(pom.getObjBook().getExpmonth(), "byValue", "2");
	}

	@When("^User selects expiry year$")
	public void user_selects_expiry_year() throws Throwable {
	    dropDown(pom.getObjBook().getExpyear(), "byValue", "2022");
	}

	@When("^User enters \"([^\"]*)\" as CVV number$")
	public void user_enters_as_CVV_number(String arg1) throws Throwable {
	    inputOfelement(pom.getObjBook().getCvvnum(), arg1);
	}

	@When("^User clicks Book now button$")
	public void user_clicks_Book_now_button() throws Throwable {
	    clickOnelement(pom.getObjBook().getBooknow());
	    Thread.sleep(10000);
	}

	@Then("^User validate Book now button$")
	public void user_validate_Book_now_button() throws Throwable {
	   
	}

}
