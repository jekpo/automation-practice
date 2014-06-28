package com.ekpo.june.automation.page;

import org.openqa.selenium.WebDriver;

public class CountryListPage extends Page {

	public static final String PAGE_URL = "http://selenium-training.israelekpo.com/countries/";
	
	public CountryListPage(WebDriver driver) {
		super(driver);
		this.setPageUrl(PAGE_URL);
	}

}
