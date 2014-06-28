package com.ekpo.june.automation.page;

import org.openqa.selenium.WebDriver;

public class TransportationOptionsPage extends Page {

	public static final String PAGE_URL = "http://selenium-training.israelekpo.com/transportation.php";
	
	public TransportationOptionsPage(WebDriver driver) {
		super(driver);
		this.setPageUrl(PAGE_URL);
	}
	
	public boolean isPageHeaderVisible() {
		return this.isElementVisible("#transportationModule h2");
	}
	
	public boolean isPageMessageVisible() {
		return this.isElementVisible("#transportationModule h3");
	}
	
	public boolean isTravelByLandRadioOptionVisible() {
		return this.isElementVisible("#transportOptionsForm input[type=radio][value=Land]");
	}
	
	public boolean isTravelByLandRadioOptionSelected() {
		return this.isSelected("#transportOptionsForm input[type=radio][value=Land]");
	}
	
	public void selectTravelByLandRadioOption() {
		this.click("#transportOptionsForm input[type=radio][value=Land]");
	}
}
