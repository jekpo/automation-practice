package com.ekpo.june.automation.page;

import org.openqa.selenium.WebDriver;

public class LoginPage extends Page {

	public static final String PAGE_URL = "http://selenium-training.israelekpo.com/login.php";
	
	public LoginPage(WebDriver driver) {
		super(driver);
		this.setPageUrl(PAGE_URL);
	}
	
	public boolean isPageTitleVisible() {
		return this.elementIsDisplayed("h2.pageTitle");
	}
	
	public void enterUsername(String username) {
		this.type("#usernameContainer input", username);
	}
	
	public boolean isUserNameInputFieldVisible() {
		return this.elementIsDisplayed("#usernameContainer input");
	}
	
	public boolean isUsernameLabelVisible() {
		return this.elementIsDisplayed("#usernameContainer label");
	}
	
	public void enterPassword(String password) {
		this.type("#passwordContainer input", password);
	}
	
	public boolean isPasswordInputFieldVisible() {
		return this.elementIsDisplayed("#passwordContainer input");
	}
	
	public boolean isPasswordLabelVisible() {
		return this.elementIsDisplayed("#passwordContainer label");
	}
	
	public void signIn() {
		this.click("#submitButtonContainer input");
	}
	
	public boolean isSubmitButtonVisible() {
		return this.elementIsDisplayed("#submitButtonContainer input");
	}
}
