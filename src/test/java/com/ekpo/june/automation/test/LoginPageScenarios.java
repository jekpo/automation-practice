package com.ekpo.june.automation.test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPageScenarios {

    @Test
    public void defaultDisplayTest() {

        // Log In to the page
        String signInPage = "http://selenium-training.israelekpo.com/login.php";

        // creating instance of driver
        WebDriver driver = new FirefoxDriver();

        // Navigate to the Sign In page
        driver.get(signInPage);

        // Webdriver is used to find the elements by CSS selector

        WebElement pageHeaderElement = driver.findElement(By.cssSelector("h2.pageTitle"));
        WebElement usernameContainerElement = driver.findElement(By.cssSelector("#usernameContainer"));
        WebElement usernameLabelElement = driver.findElement(By.cssSelector("#usernameContainer label"));
        WebElement usernameTextFieldElement = driver.findElement(By.cssSelector("#usernameContainer input"));
        WebElement passwordContainerElement = driver.findElement(By.cssSelector("#passwordContainer"));
        WebElement passwordLabelElement = driver.findElement(By.cssSelector("#passwordContainer label"));
        WebElement passwordFieldElement = driver.findElement(By.cssSelector("#passwordContainer input"));
        WebElement submitButtonElement = driver.findElement(By.cssSelector("#submitButtonContainer input"));

        // 4. Validate that the elements are present and visible on the page
                Assert.assertTrue(pageHeaderElement.isDisplayed());
                Assert.assertTrue(usernameContainerElement.isDisplayed());
                Assert.assertTrue(usernameLabelElement.isDisplayed());
                Assert.assertTrue(usernameTextFieldElement.isDisplayed());
                Assert.assertTrue(passwordContainerElement.isDisplayed());
                Assert.assertTrue(passwordLabelElement.isDisplayed());
                Assert.assertTrue(passwordFieldElement.isDisplayed());
                Assert.assertTrue(submitButtonElement.isDisplayed());

                driver.close();

                driver.quit();

    }


    @Test

    public void controlPanelPage() {

        String signInPage = "http://selenium-training.israelekpo.com/login.php";
        String username = "john.doe";
        String password = "12345";

        WebDriver driver = new FirefoxDriver();

        driver.get(signInPage);

        WebElement usernameTextFieldElement = driver.findElement(By.cssSelector("#usernameContainer input"));
        WebElement passwordTextFieldElement = driver.findElement(By.cssSelector("#passwordContainer input"));
        WebElement submitButtonElement = driver.findElement(By.cssSelector("#submitButtonContainer input"));

        usernameTextFieldElement.sendKeys(username);
        passwordTextFieldElement.sendKeys(password);
        submitButtonElement.click();

        String actualUrl = driver.getCurrentUrl();

        String expectedUrl = "http://selenium-training.israelekpo.com/control-panel.php";

        Assert.assertEquals(expectedUrl, actualUrl);

        WebElement controlPanelElement = driver.findElement(By.cssSelector(".main_container h2"));
        WebElement logOutButtonElement = driver.findElement(By.cssSelector(".main_container a"));
        WebElement entryPointsModuleElement = driver.findElement(By.cssSelector("#entryPoints"));
        WebElement countryListElement = driver.findElement(By.cssSelector("#entryPoints a"));

        Assert.assertTrue(controlPanelElement.isDisplayed());
        Assert.assertTrue(logOutButtonElement.isDisplayed());
        Assert.assertTrue(entryPointsModuleElement.isDisplayed());
        Assert.assertTrue(countryListElement.isDisplayed());

        driver.close();

        driver.quit();





    }
}
