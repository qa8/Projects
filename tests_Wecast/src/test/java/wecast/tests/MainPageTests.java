package wecast.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

/**
 * Created by admin on 14.03.2017.
 */
public class MainPageTests extends TestBase {

    @Test
    public void testOpenMainPage(){
          assertTrue(app.goTo().isElementPresent(By.linkText("LEARN MORE")));
    }

    @Test
    public void testLearnMore(){
        app.goTo().learnMore();
        assertTrue(app.getDriver().getCurrentUrl().contains("indiegogo"));
        app.getDriver().navigate().back();
    }

    @Test
    public void testMenuStory(){
        app.goTo().storyPage();
        assertTrue(app.goTo().isElementPresent(By.id("post-1797")));
        app.getDriver().navigate().back();
    }

    @Test
    public void testMenuTechnology(){
        app.goTo().technologyPage();
        assertTrue(app.goTo().isElementPresent(By.linkText("DOWNLOAD OUR FREE APP")));
        app.getDriver().navigate().back();
    }

    @Test
    public void testMenuFaqs(){
        app.goTo().faqsPage();
        assertTrue(app.goTo().isElementPresent(By.linkText("setup instructions")));
        app.getDriver().navigate().back();
    }

    @Test
    public void testMenuBlog(){
        app.goTo().blogPage();
        assertTrue(app.goTo().isElementPresent(By.linkText("PRESENTATION TIPS")));
        app.getDriver().navigate().back();
    }

    @Test
    public void testMenuContact(){
        app.goTo().contactPage();
        assertTrue(app.goTo().isElementPresent(By.linkText("info@wekast.com")));
        app.getDriver().navigate().back();
    }

    @Test
    public void testMenuPreOrder(){
        app.goTo().preOrderPage();
        assertTrue(app.goTo().isElementPresent(By.linkText("Click here to –>Pre-Order")));
        app.getDriver().navigate().back();
    }

    @Test
    public void testDownloadApp(){
        app.goTo().downloadApp();
        assertTrue(app.getDriver().getCurrentUrl().contains("google"));
        app.getDriver().navigate().back();
    }

}
