package mf_plus.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by admin on 27.11.2016.
 */
public class SessionHelper extends HelperBase {

    public SessionHelper(ApplicationManager app) {
        super(app);
    }

    public void login(String username, String password) {

        waitForPage();

        type(By.id("username"),username);
        type(By.id("password"),password);
        click(By.id("loginSubmit"));
    }

}
