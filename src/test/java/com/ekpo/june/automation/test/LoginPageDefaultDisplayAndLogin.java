package com.ekpo.june.automation.test;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * This class contains the test for the default display of the login page
 * 
 * http://selenium-training.israelekpo.com/login.php
 * http://selenium-training.israelekpo.com/scenarios/0001.scenario
 * 
 * More scenarios are available here
 * http://selenium-training.israelekpo.com/scenarios.php
 * 
 * @author June Ekpo <jedewor@yahoo.com>
 *
 */
public class LoginPageDefaultDisplayAndLogin {

	@Test
	public void testLoginPageDefaultDisplay() {
		
		// This test verifies the default display of the login page
		
		String loginPageURL = "http://selenium-training.israelekpo.com/login.php";
		
		// 1. Create an instance of the WebDriver for the Firefox Browser
		WebDriver driver = new FirefoxDriver();
		
		// 2. Navigate to the login page
		driver.get(loginPageURL);
		
		// 3. Use the web driver to find the elements by CSS Selectors
		WebElement pageHeaderElement = driver.findElement(By.cssSelector("h2.pageTitle"));
		WebElement usernameTextFieldElement = driver.findElement(By.cssSelector("#usernameContainer input"));
		WebElement passwordFieldElement = driver.findElement(By.cssSelector("#passwordContainer input"));
		WebElement submitButtonElement = driver.findElement(By.cssSelector("#submitButtonContainer input"));
		
		// 4. Validate that the elements are present and visible on the page
		Assert.assertTrue(pageHeaderElement.isDisplayed());
		Assert.assertTrue(usernameTextFieldElement.isDisplayed());
		Assert.assertTrue(passwordFieldElement.isDisplayed());
		Assert.assertTrue(submitButtonElement.isDisplayed());
		
		// 5. close all open windows
		driver.close();
		
		// 6. Shutdown WebDriver
		driver.quit();
	}
	
	@Test
	public void testLoginPageAuthenticate() {
		
		// This Test verifies that we are able to successfully login 
		
		String loginPageURL = "http://selenium-training.israelekpo.com/login.php";
		String username = "john.doe";
		String password = "12345";
		
		// Create an instance of the WebDriver for the Firefox Browser
		WebDriver driver = new FirefoxDriver();
		
		// Sets the timeout to 30 seconds
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		// Navigate to the login page
		driver.get(loginPageURL);
		
		// Use the web driver to find the elements by CSS Selectors
		WebElement usernameTextFieldElement = driver.findElement(By.cssSelector("#usernameContainer input"));
		WebElement passwordFieldElement = driver.findElement(By.cssSelector("#passwordContainer input"));
		WebElement submitButtonElement = driver.findElement(By.cssSelector("#submitButtonContainer input"));
		
		// Enter the username in the username field
		usernameTextFieldElement.sendKeys(username);
		
		// Enter the password in the password field
		passwordFieldElement.sendKeys(password);
		
		// Click on the Sign In button
		submitButtonElement.click();
		
		// Retrieve the current URL after we have logged in successfully
		String actualUrl = driver.getCurrentUrl();
		
		// This is the expected URL we should land on
		String expectedUrl = "http://selenium-training.israelekpo.com/control-panel.php";
		
		// Verifies that the user is navigated to the control panel and the login was successful
		Assert.assertEquals(actualUrl, expectedUrl);
		
		// close all open windows
		driver.close();
				
		// Shutdown Webdriver
		driver.quit();
	}
}
