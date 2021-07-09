package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.Baseclass.Base_Class;
import com.adactin.property.File_Reader_Manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature" , 
                 glue = "com\\adactin\\project",
                 monochrome = true // to avoid special characters
		)
public class RunnerClass {

	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() throws Throwable {
		String browser = File_Reader_Manager.getObjectFR().getObjectCR().getBrowser();
		driver = Base_Class.browserLaunch(browser);
	}
	@AfterClass
	public static void teardown() {
		driver.quit();
	}
}
