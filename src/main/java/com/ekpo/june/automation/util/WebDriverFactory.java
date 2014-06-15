package com.ekpo.june.automation.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverFactory {
	
	/**
	 * Returns a WebDriver based on the browser name
	 * 
	 * http://docs.seleniumhq.org/docs/03_webdriver.jsp#introducing-webdriver
	 * 
	 * By Default it returns the FirefoxDriver
	 * 
	 * Setup instructions for ChromeDriver available here
	 * https://code.google.com/p/selenium/wiki/ChromeDriver
	 * 
	 * Additional instructions needed to setup Chrome, Opera, Android and IOS
	 * 
	 * @param browserName
	 * @return
	 */
	public static WebDriver getDriverFromBrowserName(String browserName) {
		
		WebDriver driver = new FirefoxDriver();
		
		if (browserName.equals("firefox")) {
			
			driver = new FirefoxDriver();
			
		} else if (browserName.equals("chrome")) {
			
			driver = new ChromeDriver();
			
		} else if (browserName.equals("safari")) {
			
			driver = new SafariDriver();
			
		} else if (browserName.equals("ie")) {
			
			driver = new InternetExplorerDriver();
		}
		
		return driver;
	}

}
