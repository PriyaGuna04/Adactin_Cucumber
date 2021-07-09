package com.adactin.project;

import org.openqa.selenium.WebDriver;

import com.adactin.Baseclass.Base_Class;
import com.adactin.pom.LoginPage;
import com.adactin.property.File_Reader_Manager;
import com.adactin.property.Page_Object_Manager;
import com.adactin.runner.RunnerClass;

import cucumber.api.java.en.*;

public class LoginStepDefinition extends Base_Class{
	
     public static WebDriver driver = RunnerClass.driver;
     
    // LoginPage lp = new LoginPage(driver);
     Page_Object_Manager pom = new Page_Object_Manager(driver);
     
	@Given("^User launch url of adactin application$")
	public void user_launch_url_of_adactin_application() throws Throwable {
	    //url("https://adactinhotelapp.com/");
		String url = File_Reader_Manager.getObjectFR().getObjectCR().geturl();
		url(url);
	}

	@When("^User enters \"([^\"]*)\" as username$")
	public void user_enters_as_username(String arg1) throws Throwable {
	    inputOfelement(pom.getObjLogin().getUsername(), arg1);
	}

	@When("^User enters \"([^\"]*)\" as password$")
	public void user_enters_as_password(String arg1) throws Throwable {
	    inputOfelement(pom.getObjLogin().getPassword(), arg1);
	}

	@When("^User click login button$")
	public void user_click_login_button() throws Throwable {
	  clickOnelement(pom.getObjLogin().getLogin());   
	}

	@Then("^User validate login button$")
	public void user_validate_login_button() throws Throwable {
	    
	}

}
