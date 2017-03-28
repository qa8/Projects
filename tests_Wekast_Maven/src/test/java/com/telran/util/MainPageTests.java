package com.telran.util;

import com.telran.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import static org.testng.Assert.assertTrue;

/**
 * Created by admin on 14.03.2017.
 */
public class MainPageTests extends TestNgTestBase {

    public HomePage homePage;


    @BeforeMethod
    public void initPageObjects() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test(priority = 1)
    public void testOpenMainPage(){
          assertTrue(homePage.isElementPresent(By.linkText("LEARN MORE")));
    }

    @Test(priority = 2)
    public void testLearnMore(){
        homePage.learnMore();
        assertTrue(driver.getCurrentUrl().contains("indiegogo"));
        driver.navigate().back();
    }

    @Test(priority = 3)
    public void testMenuStory(){
        homePage.storyPage();
        assertTrue(homePage.isElementPresent(By.id("post-1797")));
        driver.navigate().back();
    }

    @Test(priority = 4)
    public void testMenuTechnology(){
        homePage.technologyPage();
        assertTrue(homePage.isElementPresent(By.linkText("DOWNLOAD OUR FREE APP")));
        driver.navigate().back();
    }

    @Test(priority = 5)
    public void testMenuFaqs(){
        homePage.faqsPage();
        assertTrue(homePage.isElementPresent(By.linkText("setup instructions")));
        driver.navigate().back();
    }

    @Test(priority = 6)
    public void testMenuBlog(){
        homePage.blogPage();
        assertTrue(homePage.isElementPresent(By.linkText("PRESENTATION TIPS")));
        driver.navigate().back();
    }

    @Test(priority = 7)
    public void testMenuContact(){
        homePage.contactPage();
        assertTrue(homePage.isElementPresent(By.linkText("info@wekast.com")));
        driver.navigate().back();
    }

    @Test(priority = 8)
    public void testMenuPreOrder(){
        homePage.preOrderPage();
        assertTrue(homePage.isElementPresent(By.linkText("Click here to –>Pre-Order")));
        driver.navigate().back();
    }

    @Test(priority = 9)
    public void testDownloadAppPage(){
        homePage.downloadAppPage();
        assertTrue(driver.getCurrentUrl().contains("google"));
        driver.navigate().back();
    }

}
