package com.ekpo.june.automation.page;

import org.openqa.selenium.WebDriver;

public class ControlPanelPage extends Page {

	public static final String PAGE_URL = "http://selenium-training.israelekpo.com/control-panel.php";
	
	public ControlPanelPage(WebDriver driver) {
		super(driver);
		this.setPageUrl(PAGE_URL);
	}

}
