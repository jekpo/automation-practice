package com.ekpo.june.automation.page;

import org.openqa.selenium.WebDriver;

import com.ekpo.june.automation.util.WebDriverFactory;

public class BasePage {
	
	protected WebDriver driver;
	
	public BasePage() {
		
		String browserName = "firefox";
		
		driver = WebDriverFactory.getDriverFromBrowserName(browserName);
	}
}
