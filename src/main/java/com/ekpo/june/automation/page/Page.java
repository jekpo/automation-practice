package com.ekpo.june.automation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class Page
{
 
  // Shared instance of the WebDriver in all the pages
  protected final WebDriver driver;
  
  // The page url
  protected String pageUrl;
  
  /**
   * The constructor for the page 
   * 
   * @param driver
   */
  protected Page(WebDriver driver) {
    this.driver = driver;
  }
  
  /**
   * The constructor for the page 
   * 
   * @param driver
   * @param pageUrl
   */
  protected Page(WebDriver driver, final String pageUrl) {
    this.driver = driver;
    this.pageUrl = pageUrl;
  }
  
  /**
   * Sets the url for the Page
   * @param pageUrl
   */
  public void setPageUrl(final String pageUrl) {
    this.pageUrl = pageUrl;
  }
  
  /**
   * Closes the page when the test is done
   * 
   */
  public void close() {
   driver.close(); 
  }
  
  /**
   * Opens the page using the WebDriver
   * 
   */
  public void open() {
    driver.get(this.pageUrl);
  }
  
  /**
   * Returns whether the current url is for the page
   * 
   * @return
   */
  public boolean isOnPage() {
	  return this.pageUrl != null && this.driver.getCurrentUrl().equals(this.pageUrl);
  }
  
  
  
  /**
   * Used to retrieve the element on the page
   * 
   * Should not be used directly
   * 
   * @param cssLocator The selector to target the element
   * @return
   */
  protected WebElement retrieveElement(final String cssLocator) {
    
    WebElement element = null;
    
    try {
      
      element = driver.findElement(By.cssSelector(cssLocator));
      
    } catch (Throwable e) {
        
        System.out.println("An error occurred while trying to retrieve element on page " + e);
    }
      
    return element;
      
  }
  
  /**
   * Used to verify that the element is visible on the page
   * @param cssLocator The selector to target the element
   * @return
   */
  protected boolean elementIsDisplayed(final String cssLocator) {
    
    boolean isVisible = false;
    
    WebElement element = retrieveElement(cssLocator);
    
    if (element != null) {
      isVisible = element.isDisplayed();
    }
    
    return isVisible;
  }
  
  /**
   * Clicks on the WebElement
   * 
   * @param cssLocator The selector to target the element
   */
  protected void click(final String cssLocator) {
   
    WebElement element = retrieveElement(cssLocator);
    
    element.click();
  }
  
  /**
   * Clears the value on the WebElement
   * 
   * If this element is a text entry element, this will clear the value.
   * 
   * @param cssLocator The selector to target the element
   */
  protected void clear(final String cssLocator) {
   
    WebElement element = retrieveElement(cssLocator);
    
    element.clear();
  }
  
  /**
   * 
   * Determine whether or not this element is selected or not. 
   * 
   * This operation only applies to input elements such as checkboxes, options in a select and radio buttons.
   * 
   * @param cssLocator
   * 
   * @return True if the element is currently selected or checked, false otherwise.
   */
  protected boolean isSelected(final String cssLocator) {
	  
	  WebElement element = retrieveElement(cssLocator);
	    
	  return element.isSelected();
  }
  
  /**
   * Submits the form tied to the WebElement
   * 
   * If this current element is a form, or an element within a form, then this will be submitted to
   * the remote server. If this causes the current page to change, then this method will block until
   * the new page is loaded.
   * 
   * @param cssLocator The selector to target the element
   */
  protected void submit(final String cssLocator) {
   
    WebElement element = retrieveElement(cssLocator);
    
    element.submit();
  }
  
  /**
   * Use this method to simulate typing into an element, which may set its value.
   * 
   * @param cssLocator The selector to target the element
   * @param keysToSend
   */
  protected void type(final String cssLocator, final String keysToSend) {
	  
	  WebElement element = retrieveElement(cssLocator);
	  
	  element.sendKeys(keysToSend);
  }
  
  /**
   * Use this method to simulate typing into an element, which may set its value.
   * 
   * @param cssLocator The selector to target the element
   * @param keysToSend
   */
  protected void sendKeys(final String cssLocator, final String keysToSend) {
	  this.type(cssLocator, keysToSend);
  }
}