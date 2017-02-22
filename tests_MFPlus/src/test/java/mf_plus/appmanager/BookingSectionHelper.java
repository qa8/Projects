package mf_plus.appmanager;

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


    public void chooseBookingType(){
        waitForElementVisible(By.xpath("//div[2]/div/div[2]/div[1]/div/div[4]/div[2]/div/div[1]/div/div/form/div/div[2]/div/span/span/span[1]"));
        if (getElement(By.xpath("//div[2]/div/div[2]/div[1]/div/div[4]/div[2]/div/div[1]/div/div/form/div/div[2]/div/span/span/span[1]")).getText().equals("")) {
            click(By.xpath("//div[2]/div/div[2]/div[1]/div/div[4]/div[2]/div/div[1]/div/div/form/div/div[2]/div/span/span/span[1]"));
            waitForElementVisible(By.xpath("//ul[@id='bookingType_listbox']//li[.='Private']"));
            chooseElement(By.xpath("//ul[@id='bookingType_listbox']//li[.='Private']"));
        }
    }

    public void chooseSource(){
        waitForElementClickable(By.xpath("//div[2]/div/div[2]/div[1]/div/div[4]/div[2]/div/div[1]/div/div/form/div/div[7]/div/span/span/span[1]"));
        if (getElement(By.xpath("//div[2]/div/div[2]/div[1]/div/div[4]/div[2]/div/div[1]/div/div/form/div/div[7]/div/span/span/span[1]")).getText().equals("")) {
            waitSimple(3000);
            click(By.xpath("//div[2]/div/div[2]/div[1]/div/div[4]/div[2]/div/div[1]/div/div/form/div/div[7]/div/span/span/span[1]"));
            chooseElement(By.xpath("//ul[@id='source_listbox']//li[.='Mail']"));
            waitForElementClickable(By.id("client"));
        }
    }

    public void chooseBooker(String bookerName){
        waitForDisappear(By.id("page-preloader"));
        //        waitForElementClickable(By.id("booker"));
//        getElement(By.id("booker")).getAttribute("required").equals("required") &&
        if (getElement(By.id("booker")).getAttribute("value").equals(bookerName)==false) {
            waitSimple(3000);
            type(By.id("booker"), bookerName);
            waitForDisappear(By.id("page-preloader"));
            waitForElementClickable(By.xpath(String.format("//ul[@id='booker_listbox']//li[.='%s']", bookerName)));
            wd.findElement(By.xpath(String.format("//ul[@id='booker_listbox']//li[.='%s']", bookerName))).click();
//            waitForDisappear(By.id("page-preloader"));
            waitSimple(3000);
        }
    }

    public void chooseBookerContact(){
        waitForElementVisible(By.xpath("//div[2]/div/div[2]/div[1]/div/div[4]/div[2]/div/div[1]/div/div/form/div/div[4]/div[2]/span/span/span[1]"));
        if (getElement(By.xpath("//div[2]/div/div[2]/div[1]/div/div[4]/div[2]/div/div[1]/div/div/form/div/div[4]/div[2]/span/span/span[1]")).getText().equals("")) {
//            waitForElementClickable(By.xpath("//div[2]/div/div[2]/div[1]/div/div[4]/div[2]/div/div[1]/div/div/form/div/div[4]/div[2]/span/span/span[1]"));
            waitSimple(3000);
            click(By.xpath("//div[2]/div/div[2]/div[1]/div/div[4]/div[2]/div/div[1]/div/div/form/div/div[4]/div[2]/span/span/span[1]"));
            waitForElementVisible(By.xpath("//ul[@id='bookedContact_listbox']//li[.='ES_Polina ES_Smirnov']"));
            waitSimple(1000);
            chooseElement(By.xpath("//ul[@id='bookedContact_listbox']//li[.='ES_Polina ES_Smirnov']"));
        }
        waitForDisappear(By.id("page-preloader"));
    }


    public void fillBookingForm(String bookerName){
        waitForDisappear(By.id("page-preloader"));
        chooseBookingType();
        waitForDisappear(By.id("page-preloader"));
        chooseBooker(bookerName);
        waitForDisappear(By.id("page-preloader"));
        chooseBookerContact();
        waitForDisappear(By.id("page-preloader"));
        chooseSource();
    }

}
