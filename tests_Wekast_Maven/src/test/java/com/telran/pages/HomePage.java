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
    clickElement(learnMore);
  }

  public void storyPage() {
    clickElement(storyPage);
  }

  public void technologyPage() {
    clickElement(technologyPage);
  }

  public void faqsPage() {
    clickElement(faqsPage);
  }

  public void blogPage() {
    clickElement(blogPage);
  }

  public void contactPage() {
    clickElement(contactPage);
  }

  public void preOrderPage() {
    clickElement(preOrderPage);
  }

  public void downloadAppPage() {
    clickElement(downloadAppPage);
  }
}
