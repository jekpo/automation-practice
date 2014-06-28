package com.ekpo.june.automation.page;

import org.openqa.selenium.WebDriver;

public class CountryDetailPage extends Page {

	public static final String PAGE_URL = "http://selenium-training.israelekpo.com/countries/country-detail.php";
	
	public CountryDetailPage(WebDriver driver) {
		super(driver);
		this.setPageUrl(PAGE_URL);
	}

}
