package com.ekpo.june.automation.test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.ekpo.june.automation.page.ControlPanelPage;
import com.ekpo.june.automation.page.LoginPage;

public class SmartPageObjectsLoginPage {

	@Test
	public void smartLoginDefaultDisplay() {
		
		WebDriver driver = new FirefoxDriver();
		
		LoginPage loginPage = new LoginPage(driver);
		
		// Opens the login page
		loginPage.open();
		
		// Verify that the page title is visible
		Assert.assertTrue(loginPage.isPageTitleVisible());
		
		// Verify that the username field is visible
		Assert.assertTrue(loginPage.isUserNameInputFieldVisible());
		
		// Verify that the password field is visible
		Assert.assertTrue(loginPage.isPasswordInputFieldVisible());
		
		// Assert that the submit button is visible
		Assert.assertTrue(loginPage.isSubmitButtonVisible());
		
		// Assert that we are on the login page
		Assert.assertTrue(loginPage.isOnPage());
		
		driver.close();
		driver.quit();
	}
	
	
	@Test
	public void smartEnterUsernameAndPasswordAndSubmitLogin() {
		
		WebDriver driver = new FirefoxDriver();
		
		LoginPage loginPage = new LoginPage(driver);
		ControlPanelPage controlPanelPage = new ControlPanelPage(driver);
		
		String username = "john.doe";
		String password = "12345";
		
		// Opens the login page
		loginPage.open();
		
		// Enter the username and password
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
		
		// Submit the username and password
		loginPage.signIn();
		
		// Assert that we are on the control panel page
		Assert.assertTrue(controlPanelPage.isOnPage());
		
		driver.close();
		driver.quit();
	}

}
