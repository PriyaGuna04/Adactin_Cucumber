package com.adactin.project;

import org.openqa.selenium.WebDriver;

import com.adactin.Baseclass.Base_Class;
import com.adactin.pom.SearchHotelpage;
import com.adactin.property.Page_Object_Manager;
import com.adactin.runner.RunnerClass;

import cucumber.api.java.en.*;

public class SearchHotelStepDefinition extends Base_Class {
	public static WebDriver driver = RunnerClass.driver;
	
	//SearchHotelpage shp = new SearchHotelpage(driver);
	
	Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	@When("^User selects Location$")
	public void user_selects_Location() throws Throwable {
	  dropDown(pom.getObjSearch().getLocation(), "byValue", "New York");
	}

	@When("^User selects Hotel$")
	public void user_selects_Hotel() throws Throwable {
	    dropDown(pom.getObjSearch().getHotels(), "byValue", "Hotel Sunshine");
	}

	@When("^User selects Room type$")
	public void user_selects_Room_type() throws Throwable {
	    dropDown(pom.getObjSearch().getRoomtype(), "byValue", "Standard");
	}

	@When("^User selects number of Rooms$")
	public void user_selects_number_of_Rooms() throws Throwable {
	   dropDown(pom.getObjSearch().getRoomnos(), "byValue", "1");
	}

	@When("^User clears the check in date$")
	public void user_clears_the_check_in_date() throws Throwable {
	   clearOnelement(pom.getObjSearch().getIndate());
	   inputOfelement(pom.getObjSearch().getIndate(), "25/06/2021");
	}

	@When("^User clears the check out date$")
	public void user_clears_the_check_out_date() throws Throwable {
	    clearOnelement(pom.getObjSearch().getOutdate());
	    inputOfelement(pom.getObjSearch().getOutdate(), "30/6/2021");
	}

	@When("^User selects Adults per room$")
	public void user_selects_Adults_per_room() throws Throwable {
	    dropDown(pom.getObjSearch().getAdultroom(), "byValue", "3");
	}

	@When("^User selects childrens per room$")
	public void user_selects_childrens_per_room() throws Throwable {
	    dropDown(pom.getObjSearch().getChildroom(), "byValue", "1");
	}

	@When("^User clicks search button$")
	public void user_clicks_search_button() throws Throwable {
	    clickOnelement(pom.getObjSearch().getSubmit());
	}

	@Then("^User validate search button$")
	public void user_validate_search_button() throws Throwable {
	    
	}


}
