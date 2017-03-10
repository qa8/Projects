package mf_plus.tests;

import mf_plus.model.CostsData;
import mf_plus.model.QuotationData;
import org.testng.annotations.Test;

/**
 * Created by admin on 12.02.2017.
 */
public class QuotationSATests extends TestBase {

    @Test(priority = 1)
    public void testSAQuotationCreate() {
        QuotationData q1 = new QuotationData().withNumber("115").withBookingType("Private").withBooker("ES_DIV01")
                .withBookerContact("ES_Polina ES_Smirnov").withAccount("").withAccountContact("").withSource("Mail")
                .withClientName("ES_TestClient7").withJobType("Export").withMode("Air AIR").withType("DTD")
                .withService("Full Origin Service");
        app.goTo().quotationsMainViewPage();
        app.quotations().newSAQuotation();
        String curNum = app.quotations().getQuoteNum();
        app.quotations().setCurrNum(curNum);
//        app.booking().fillBookingForm(q1);
//        app.partyForms().fillNewClientForm(7);
//        app.partyForms().chooseClient(q1.getClientName());
//        app.partyForms().editClientDetails();
//        app.quotations().fillSecondLine(q1);
        app.goTo().fromQuotToHomePage();

    }

    @Test(priority = 2)
    public void testSAQuotationEdit(){
        QuotationData q1 = new QuotationData().withNumber("157").withBookingType("Agent").withBooker("ES_DIV01")
                .withBookerContact("ES_Polina ES_Smirnov").withAccount("").withAccountContact("").withSource("Mail")
                .withClientName("ES_TestClient7").withJobType("Export").withMode("Air AIR").withType("DTD")
                .withService("Full Origin Service");
        app.goTo().quotationsMainViewPage();
        String curNum = app.quotations().getCurrNum();
        String num = curNum.equals("") ? q1.getNumber() : curNum;
        app.quotations().chooseQuotation(num);
        app.booking().fillBookingForm(q1);
////        app.partyForms().fillNewClientForm(7);
//
        app.partyForms().chooseClient(q1.getClientName());
        app.partyForms().editClientDetails();
        app.quotations().fillSecondLine(q1);
        app.quotations().setCurrNum(app.quotations().getQuoteNum());
        app.goTo().fromQuotToHomePage();
    }

    @Test(priority = 3)
    public void testSAQuotationCosts(){
        CostsData c1 = new CostsData().withVendor("ES_DIV01").withType("Quotation").withDescription("Internal cost").withSum(1000.50);
        CostsData c2 = new CostsData().withVendor("ES_1Agent").withType("Quotation").withDescription("FR").withSum(2000);
        app.goTo().quotationsMainViewPage();
        String curNum = app.quotations().getCurrNum();
        String num = "129";
        app.quotations().chooseQuotation(curNum);
        app.quotations().addToCostsTable(c1);
        app.quotations().importToBS(c1);
        app.goTo().fromQuotToHomePage();
    }

    @Test(priority = 4)
    public void testSAQuotationToClientFile(){
        app.goTo().quotationsMainViewPage();
        String curNum = app.quotations().getCurrNum();
        String num = "129";
        app.quotations().chooseQuotation(curNum);
        app.quotations().createClientFile();
        app.goTo().fromJSToHomePage();
    }




}
