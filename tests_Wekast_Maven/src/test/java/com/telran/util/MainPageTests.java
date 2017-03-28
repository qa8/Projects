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

    @Test
    public void testOpenMainPage(){
          assertTrue(homePage.isElementPresent(By.linkText("LEARN MORE")));
    }

    @Test
    public void testLearnMore(){
        homePage.learnMore();
        assertTrue(driver.getCurrentUrl().contains("indiegogo"));
        driver.navigate().back();
    }

    @Test
    public void testMenuStory(){
        homePage.storyPage();
//        assertTrue(app.goTo().isElementPresent(By.id("post-1797")));
        driver.navigate().back();
    }

    @Test
    public void testMenuTechnology(){
        homePage.technologyPage();
//        assertTrue(app.goTo().isElementPresent(By.linkText("DOWNLOAD OUR FREE APP")));
        driver.navigate().back();
    }

    @Test
    public void testMenuFaqs(){
        homePage.faqsPage();
//        assertTrue(app.goTo().isElementPresent(By.linkText("setup instructions")));
        driver.navigate().back();
    }

    @Test
    public void testMenuBlog(){
        homePage.blogPage();
//        assertTrue(app.goTo().isElementPresent(By.linkText("PRESENTATION TIPS")));
        driver.navigate().back();
    }

    @Test
    public void testMenuContact(){
        homePage.contactPage();
//        assertTrue(app.goTo().isElementPresent(By.linkText("info@wekast.com")));
        driver.navigate().back();
    }

    @Test
    public void testMenuPreOrder(){
        homePage.preOrderPage();
//        assertTrue(app.goTo().isElementPresent(By.linkText("Click here to –>Pre-Order")));
        driver.navigate().back();
    }

    @Test
    public void testDownloadAppPage(){
        homePage.downloadAppPage();
        assertTrue(driver.getCurrentUrl().contains("google"));
        driver.navigate().back();
    }

}
