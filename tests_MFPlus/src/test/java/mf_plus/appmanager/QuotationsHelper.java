package mf_plus.appmanager;

import mf_plus.model.QuotationData;
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

    private void fillJobType(String jobType) {
        By listLocator = By.xpath("//div[2]/div/div[2]/div[1]/div/div[2]/div/div/form/div/div[1]/div[1]/div/div[2]/span/span/span[1]");
        By elementLocator = By.xpath(String.format("//div[@class='k-animation-container']//span[.='%s']",jobType));
        chooseFromListWithoutInput(listLocator,elementLocator, "");
    }

    private void fillMode(String mode) {
        By listLocator = By.xpath("//div[2]/div/div[2]/div[1]/div/div[2]/div/div/form/div/div[1]/div[1]/div/div[3]/span/span/span[1]");
        By elementLocator = By.xpath(String.format("//div[@class='k-animation-container']//span[.='%s']",mode));
        chooseFromListWithoutInput(listLocator,elementLocator, "");
    }

    private void fillType(String type) {
        By listLocator = By.xpath("//div[2]/div/div[2]/div[1]/div/div[2]/div/div/form/div/div[1]/div[1]/div/div[4]/span/span/span[1]");
        By elementLocator = By.xpath(String.format("//div[@class='k-animation-container']//span[.='%s']",type));
        chooseFromListWithoutInput(listLocator,elementLocator, "");
    }

    private void fillService(String service) {
        By listLocator = By.xpath("//div[2]/div/div[2]/div[1]/div/div[2]/div/div/form/div/div[1]/div[1]/div/div[5]/span/span/span[1]");
        By elementLocator = By.xpath(String.format("//div[@class='k-animation-container']//span[.='%s']",service));
        chooseFromListWithoutInput(listLocator,elementLocator, "");

    }

    public void fillSecondLine(QuotationData q1) {
        fillJobType(q1.getJobType());
        fillMode(q1.getMode());
        fillType(q1.getType());
        fillService(q1.getService());
    }








}
