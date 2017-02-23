package mf_plus.appmanager;

import org.openqa.selenium.By;

/**
 * Created by admin on 13.02.2017.
 */
public class PartyFormsHelper extends HelperBase {

    public PartyFormsHelper(ApplicationManager app) {
        super(app);
    }

    public void fillNewClientForm(int number){
        waitForDisappear(By.linkText("Please, write in Booking section"));
        waitForElementVisible(By.id("clientPlus"));
        waitForElementClickable(By.id("clientPlus"));
        click(By.id("clientPlus"));
        type(By.id("newPartyName"),"ES_TestClient"+number);
        type(By.id("newPersonFirstName"),"ES_TestFN"+number);
        type(By.id("newPersonLastName"),"ES_TestLN"+number);
        type(By.id("newPersonEmail"),"es_test@mail.ru");
        type(By.id("newPersonPhone"),"+74991111113");
        click(By.id("saveNewParty"));
        waitForDisappear(By.linkText("Please, enter Client"));
    }

    public void editClientDetails(){
//        waitForDisappear(By.id("page-preloader"));
        waitSimple(1000);
        click(By.id("clientMore"));
        waitForDisappear(By.id("page-preloader"));
        click(By.cssSelector("a.header__back_link"));
        waitForDisappear(By.id("page-preloader"));
    }

//    public void chooseClient(String clientName){
//        waitForDisappear(By.id("page-preloader"));
//        waitSimple(1000);
//        waitForElementClickable(By.id("client"));
//        if (getElement(By.id("client")).getAttribute("value").equals(clientName)==false) {
//            type(By.id("client"), clientName);
//            waitForDisappear(By.id("page-preloader"));
//            waitForElementClickable(By.xpath(String.format("//div[@class='k-animation-container']//li[.='%s']", clientName)));
//            wd.findElement(By.xpath(String.format("//div[@class='k-animation-container']//li[.='%s']", clientName))).click();
//            waitForDisappear(By.id("page-preloader"));
//            waitSimple(1000);
//        }
//    }

    public void chooseClient(String clientName){
        By listLocator=By.id("client");
        By elementLocator=By.xpath(String.format("//div[@class='k-animation-container']//li[.='%s']", clientName));
        chooseFromListWithInput(listLocator,elementLocator,clientName);
        waitForDisappear(By.id("page-preloader"));
    }

}
