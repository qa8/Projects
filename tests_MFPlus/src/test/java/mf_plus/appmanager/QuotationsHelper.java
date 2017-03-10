package mf_plus.appmanager;

import mf_plus.model.CostsData;
import mf_plus.model.QuotationData;
import org.openqa.selenium.By;

/**
 * Created by admin on 13.02.2017.
 */
public class QuotationsHelper extends HelperBase {

    public String currNum = "";

    public QuotationsHelper(ApplicationManager app) {
        super(app);
    }

    public String getCurrNum() {
        return currNum;
    }

    public void setCurrNum(String currNum) {
        this.currNum = currNum;
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
        waitSimple(2000);
        fillJobType(q1.getJobType());
        fillMode(q1.getMode());
        fillType(q1.getType());
        fillService(q1.getService());
    }


    public String getQuoteNum() {
        String num = getElement(By.xpath("//div[2]/div/div[2]/div[1]/div/div[1]/div/div/div/form/div/div[1]/span")).getText();
        return num;
    }

    public void addToCostsTable(CostsData c1) {
        startNewCost();
        enterVendor(c1.getVendor());
        enterType(c1.getType());
        enterDescription(c1.getDescription());
        enterSum(c1.getSum());
        enterRate();
        submitNewCost();
    }

    private void enterRate() {
        click(By.xpath("//div[2]/div/div[2]/div[1]/div/div[4]/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div[2]/table/tbody/tr/td[8]/span[1]/span/input"));
        waitSimple(1000);
    }

    private void submitNewCost() {
        click(By.id("expenseTick"));
        waitSimple(1000);
    }

    private void enterSum(double sum) {
        waitSimple(3000);
//        waitForElementVisible(By.name("Total"));
        click(By.xpath("//div[2]/div/div[2]/div[1]/div/div[4]/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div[2]/table/tbody/tr/td[7]/span[1]/span/input"));
        type(By.xpath("//div[2]/div/div[2]/div[1]/div/div[4]/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div[2]/table/tbody/tr/td[7]/span[1]/span/input[2]"),""+sum);
    }

    private void enterDescription(String description) {
        type(By.xpath("//div[2]/div/div[2]/div[1]/div/div[4]/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div[2]/table/tbody/tr/td[5]/input"),description);
    }

    private void enterType(String type) {
        By listLocator = By.xpath("//div[2]/div/div[2]/div[1]/div/div[4]/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[4]/span[1]/span/span[1]");
        By elementLocator = By.xpath(String.format("//ul[@id='Type_listbox']//li[.='%s']",type));
        chooseFromListWithoutInput(listLocator,elementLocator,"");
    }

    private void enterVendor(String vendor) {
//        type(By.name("VendorId_input"),vendor);
        By listLocator = By.name("VendorId_input");
        By elementLocator = By.xpath("//div[66]/div/div[2]/ul/li");
        chooseFromListWithInput(listLocator,elementLocator,vendor);
    }

    private void startNewCost() {
        waitForDisappear(By.id("page-preloader"));
//        waitForDisappear(By.id("spinner-js-costs"));
        waitSimple(5000);
        click(By.id("expenseAdd"));
        waitSimple(100);
    }

    public void importToBS(CostsData c1) {
        pointCost(c1);
        click(By.id("importIntoBSButton"));
        waitSimple(100);
        click(By.id("createBillableService"));
        waitSimple(1000);
    }

    private void pointCost(CostsData c1) {
        waitSimple(1000);
        click(By.xpath("//div[2]/div/div[2]/div[1]/div/div[4]/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div[2]/table/tbody/tr/td[4]"));
        waitSimple(500);
    }

    public void createClientFile() {
        waitForDisappear(By.id("page-preloader"));
        waitSimple(10000);
        By listLocator = By.xpath("//div[2]/div/div[2]/div[1]/div/div[1]/div/div/div/form/div/div[5]/div[1]/ul/li/span");
        By elementLocator = By.xpath("//div[@class='k-animation-container']//span[.='Client File']");
        click(listLocator);
        waitSimple(1000);
        chooseElement(elementLocator);
        waitSimple(50000);
    }

    public void createInvoice() {
        waitForDisappear(By.id("page-preloader"));
        waitSimple(10000);
        By listLocator = By.xpath("//div[2]/div/div[2]/div[1]/div/div[1]/div/div/div/form/div/div[5]/div[1]/ul/li/span");
//        By elementLocator = By.xpath("//div[@class='k-animation-container']//span[.='Invoice']");
        By elementLocator = By.xpath("//div[2]/div/div[2]/div[1]/div/div[1]/div/div/div/form/div/div[5]/div[1]/ul/li/div/ul/li/span");
        click(listLocator);
        waitSimple(1000);
        chooseElement(elementLocator);
        waitSimple(50000);

    }

    public String getInvoiceNum() {
        String num = getElement(By.xpath("//div[2]/div/div[2]/div[1]/div[1]/div[1]/span[2]")).getText();
        return num;
    }
}
