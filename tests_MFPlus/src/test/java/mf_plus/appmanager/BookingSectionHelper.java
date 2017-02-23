package mf_plus.appmanager;

import mf_plus.model.QuotationData;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by admin on 18.02.2017.
 */
public class BookingSectionHelper extends HelperBase {

    public BookingSectionHelper(ApplicationManager app) {
        super(app);
    }


//    public void chooseBookingType(){
//        waitForElementVisible(By.xpath("//div[2]/div/div[2]/div[1]/div/div[4]/div[2]/div/div[1]/div/div/form/div/div[2]/div/span/span/span[1]"));
//        if (getElement(By.xpath("//div[2]/div/div[2]/div[1]/div/div[4]/div[2]/div/div[1]/div/div/form/div/div[2]/div/span/span/span[1]")).getText().equals("")) {
//            waitSimple(3000);
//            click(By.xpath("//div[2]/div/div[2]/div[1]/div/div[4]/div[2]/div/div[1]/div/div/form/div/div[2]/div/span/span/span[1]"));
//            waitForElementVisible(By.xpath("//ul[@id='bookingType_listbox']//li[.='Private']"));
//            chooseElement(By.xpath("//ul[@id='bookingType_listbox']//li[.='Private']"));
//        }
//    }

    public void chooseBookingType(String type){
        By listLocator = By.xpath("//div[2]/div/div[2]/div[1]/div/div[4]/div[2]/div/div[1]/div/div/form/div/div[2]/div/span/span/span[1]");
        By elementLocator = By.xpath(String.format("//ul[@id='bookingType_listbox']//li[.='%s']",type));
        chooseFromListWithoutInput(listLocator,elementLocator);
    }

//    public void chooseSource(){
//        waitForElementClickable(By.xpath("//div[2]/div/div[2]/div[1]/div/div[4]/div[2]/div/div[1]/div/div/form/div/div[7]/div/span/span/span[1]"));
//        if (getElement(By.xpath("//div[2]/div/div[2]/div[1]/div/div[4]/div[2]/div/div[1]/div/div/form/div/div[7]/div/span/span/span[1]")).getText().equals("")) {
//            waitSimple(3000);
//            click(By.xpath("//div[2]/div/div[2]/div[1]/div/div[4]/div[2]/div/div[1]/div/div/form/div/div[7]/div/span/span/span[1]"));
//            chooseElement(By.xpath("//ul[@id='source_listbox']//li[.='Mail']"));
//            waitForElementClickable(By.id("client"));
//        }
//    }

    public void chooseSource(String source){
        By listLocator = By.xpath("//div[2]/div/div[2]/div[1]/div/div[4]/div[2]/div/div[1]/div/div/form/div/div[7]/div/span/span/span[1]");
        By elementLocator = By.xpath(String.format("//ul[@id='source_listbox']//li[.='%s']",source));
        chooseFromListWithoutInput(listLocator,elementLocator);
        waitForElementClickable(By.id("client"));
    }

//    public void chooseBooker(String bookerName){
//        waitForDisappear(By.id("page-preloader"));
//        if (getElement(By.id("booker")).getAttribute("value").equals(bookerName)==false) {
//            waitSimple(3000);
//            type(By.id("booker"), bookerName);
//            waitForDisappear(By.id("page-preloader"));
//            waitForElementClickable(By.xpath(String.format("//ul[@id='booker_listbox']//li[.='%s']", bookerName)));
//            wd.findElement(By.xpath(String.format("//ul[@id='booker_listbox']//li[.='%s']", bookerName))).click();
//            waitSimple(3000);
//        }
//    }

    public void chooseBooker(String bookerName){
        By listLocator = By.id("booker");
        By elementLocator = By.xpath(String.format("//ul[@id='booker_listbox']//li[.='%s']", bookerName));
        chooseFromListWithInput(listLocator,elementLocator,bookerName);
    }

//    public void chooseBookerContact(){
//        waitForElementVisible(By.xpath("//div[2]/div/div[2]/div[1]/div/div[4]/div[2]/div/div[1]/div/div/form/div/div[4]/div[2]/span/span/span[1]"));
//        if (getElement(By.xpath("//div[2]/div/div[2]/div[1]/div/div[4]/div[2]/div/div[1]/div/div/form/div/div[4]/div[2]/span/span/span[1]")).getText().equals("")) {
//            waitSimple(3000);
//            click(By.xpath("//div[2]/div/div[2]/div[1]/div/div[4]/div[2]/div/div[1]/div/div/form/div/div[4]/div[2]/span/span/span[1]"));
//            waitForElementVisible(By.xpath("//ul[@id='bookedContact_listbox']//li[.='ES_Polina ES_Smirnov']"));
//            waitSimple(1000);
//            chooseElement(By.xpath("//ul[@id='bookedContact_listbox']//li[.='ES_Polina ES_Smirnov']"));
//        }
//        waitForDisappear(By.id("page-preloader"));
//    }

    public void chooseBookerContact(String bookerContact){
        By listLocator = By.xpath("//div[2]/div/div[2]/div[1]/div/div[4]/div[2]/div/div[1]/div/div/form/div/div[4]/div[2]/span/span/span[1]");
        By elementLocator = By.xpath(String.format("//ul[@id='bookedContact_listbox']//li[.='%s']",bookerContact));
        chooseFromListWithoutInput(listLocator,elementLocator);
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
