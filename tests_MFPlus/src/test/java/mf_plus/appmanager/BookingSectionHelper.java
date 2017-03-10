package mf_plus.appmanager;

import mf_plus.model.QuotationData;
import org.openqa.selenium.By;

/**
 * Created by admin on 18.02.2017.
 */
public class BookingSectionHelper extends HelperBase {

    public BookingSectionHelper(ApplicationManager app) {
        super(app);
    }


    public void chooseBookingType(String type){
        By listLocator = By.xpath("//div[2]/div/div[2]/div[1]/div/div[4]/div[2]/div/div[1]/div/div/form/div/div[2]/div/span/span/span[1]");
        By elementLocator = By.xpath(String.format("//ul[@id='bookingType_listbox']//li[.='%s']",type));
        chooseFromListWithoutInput(listLocator,elementLocator, "");
        for (int i=0;i<=3;i++) {
            if (getElement(listLocator).getText().equals("")) {
                chooseFromListWithoutInput(listLocator,elementLocator, "");
            }
        }
    }

    public void chooseSource(String source){
        By listLocator = By.xpath("//div[2]/div/div[2]/div[1]/div/div[4]/div[2]/div/div[1]/div/div/form/div/div[7]/div/span/span/span[1]");
        By elementLocator = By.xpath(String.format("//ul[@id='source_listbox']//li[.='%s']",source));
//        By elementLocator = By.xpath("//div[18]/div/div[3]/ul/li[1]");

        chooseFromListWithoutInput(listLocator,elementLocator, "");
        for (int i=0;i<=3;i++) {
            if (getElement(listLocator).getText().equals("")) {
                chooseFromListWithoutInput(listLocator,elementLocator, "");
            }
        }
        waitForElementClickable(By.id("client"));
    }

    public void chooseBooker(String bookerName){
        waitSimple(1000);
        By listLocator = By.id("booker");
        By elementLocator = By.xpath(String.format("//ul[@id='booker_listbox']//li[.='%s']", bookerName));
        if (getElement(listLocator).getAttribute("value").equals("")) {
            chooseFromListWithInput(listLocator, elementLocator, bookerName);
        }
    }

    public void chooseBookerContact(String bookerContact){
        By listLocator = By.xpath("//div[2]/div/div[2]/div[1]/div/div[4]/div[2]/div/div[1]/div/div/form/div/div[4]/div[2]/span/span/span[1]");
        By elementLocator = By.xpath(String.format("//ul[@id='bookedContact_listbox']//li[.='%s']",bookerContact));
        for (int i=0;i<=3;i++) {
            if (getElement(listLocator).getText().equals("")) {
                chooseFromListWithoutInput(listLocator,elementLocator, "");
            }
        }
    }

    public void chooseAccount(String accountName){
//        By listLocator = ;
//        By elementLocator = ;
//        chooseFromListWithInput(listLocator,elementLocator,accountName);
    }

    public void chooseAccountContact(String accountContact){
//        By listLocator = ;
//        By elementLocator = ;
//        chooseFromListWithoutInput(listLocator,elementLocator);
    }



    public void fillBookingForm(QuotationData q1){
        waitForDisappear(By.id("page-preloader"));
        chooseBookingType(q1.getBookingType());
        waitForDisappear(By.id("page-preloader"));
        chooseBooker(q1.getBooker());
        waitForDisappear(By.id("page-preloader"));
        chooseBookerContact(q1.getBookerContact());
        waitForDisappear(By.id("page-preloader"));
        chooseAccount(q1.getAccount());
        waitForDisappear(By.id("page-preloader"));
        chooseAccountContact(q1.getAccountContact());
        waitForDisappear(By.id("page-preloader"));
        chooseSource(q1.getSource());
    }

}
