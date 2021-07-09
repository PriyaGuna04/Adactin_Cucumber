package com.adactin.property;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adactin.pom.BookingPage;
import com.adactin.pom.LoginPage;
import com.adactin.pom.SearchHotelpage;
import com.adactin.pom.SelectPage;

public class Page_Object_Manager {
	
	public static WebDriver driver;
	
	private LoginPage login;
	private SearchHotelpage search;
	private SelectPage select;
	private BookingPage book;

	public Page_Object_Manager(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver1, this);
	}
	
	public LoginPage getObjLogin() {
		login = new LoginPage(driver);
		return login;

	}
	
	public SearchHotelpage getObjSearch() {
		search = new SearchHotelpage(driver);
		return search;
    }
	
	public SelectPage getObjSelect() {
         select = new SelectPage(driver);
         return select;
	}
	
	public BookingPage getObjBook() {
		book = new BookingPage(driver);
		return book;

	}

}
