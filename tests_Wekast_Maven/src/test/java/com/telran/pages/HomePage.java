package com.telran.pages;

import com.telran.util.LogLog4j;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Sample page
 */
public class HomePage extends Page {
  private static Logger Log = Logger.getLogger(LogLog4j.class.getName());
  @FindBy(how = How.TAG_NAME, using = "h1")
  public WebElement header;

  @FindBy(id = "menu-item-1950")
  public WebElement homePage;

  @FindBy(id = "menu-item-1942")
  public WebElement storyPage;

  @FindBy(id = "menu-item-1951")
  public WebElement technologyPage;

  @FindBy(id = "menu-item-1948")
  public WebElement faqsPage;

  @FindBy(id = "menu-item-2671")
  public WebElement blogPage;

  @FindBy(id = "menu-item-1947")
  public WebElement contactPage;

  @FindBy(id = "menu-item-2018")
  public WebElement preOrderPage;

  @FindBy(linkText = "LEARN MORE")
  public WebElement learnMore;

  @FindBy(linkText = "DOWNLOAD THE APP")
  public WebElement downloadAppPage;



  public HomePage(WebDriver webDriver) {
    super(webDriver);
  }

  public void learnMore() {
    Log.info("Selecting Learn More");
    clickElement(learnMore);
  }

  public void storyPage() {
    Log.info("Selecting Story Page");
    clickElement(storyPage);
  }

  public void technologyPage() {
    Log.info("Selecting Technology Page");
    clickElement(technologyPage);
  }

  public void faqsPage() {
    Log.info("Selecting FAQs Page");
    clickElement(faqsPage);
  }

  public void blogPage() {
    Log.info("Selecting Blog Page");
    clickElement(blogPage);
  }

  public void contactPage() {
    Log.info("Selecting Contact Page");
    clickElement(contactPage);
  }

  public void preOrderPage() {
    Log.info("Selecting Pre-order Page");
    clickElement(preOrderPage);
  }

  public void downloadAppPage() {
    Log.info("Selecting Download-app Page");
    clickElement(downloadAppPage);
  }
}
