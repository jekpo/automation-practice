package com.ekpo.june.automation.page;

import org.openqa.selenium.WebDriver;

public class TransportationOptionsPage extends Page {

	public static final String PAGE_URL = "http://selenium-training.israelekpo.com/transportation.php";
	
	public TransportationOptionsPage(WebDriver driver) {
		super(driver);
		this.setPageUrl(PAGE_URL);
	}
}
