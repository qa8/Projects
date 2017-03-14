package wecast.tests;

import org.testng.annotations.Test;

/**
 * Created by admin on 14.03.2017.
 */
public class MainPageTests extends TestBase {

    @Test
    public void testOpenMainPage(){
        app.goTo().storyPage();
        app.goTo().tecnologyPage();
        app.goTo().homePage();
        app.goTo().faqsPage();
        app.goTo().contactPage();
        app.goTo().preOrderPage();
        app.goTo().blogPage();
    }




}
