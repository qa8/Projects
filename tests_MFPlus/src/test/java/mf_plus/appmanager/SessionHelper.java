package mf_plus.appmanager;

import org.openqa.selenium.By;

/**
 * Created by admin on 27.11.2016.
 */
public class SessionHelper extends HelperBase {

    public SessionHelper(ApplicationManager app) {
        super(app);
    }

    public void login(String username, String password) {

        waitForDisappear(By.id("page-preloader"));

        type(By.id("username"),username);
        type(By.id("password"),password);
        click(By.id("loginSubmit"));
    }

}
