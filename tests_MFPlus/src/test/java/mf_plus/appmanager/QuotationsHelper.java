package mf_plus.appmanager;

import org.openqa.selenium.By;

/**
 * Created by admin on 13.02.2017.
 */
public class QuotationsHelper extends HelperBase {

    public QuotationsHelper(ApplicationManager app) {
        super(app);
    }

    public void newSAQuotation(){
        waitForDisappear(By.id("page-preloader"));
        waitForElementClickable(By.id("newQuote"));
        click(By.id("newQuote"));
        waitForDisappear(By.id("page-preloader"));
    }

    public void chooseQuotation(String number){
        waitForDisappear(By.id("page-preloader"));
        click(By.linkText(number));
    }

}
