package mf_plus.tests;

import org.testng.annotations.Test;

/**
 * Created by admin on 12.02.2017.
 */
public class QuotationTests extends TestBase {

    @Test(priority = 4)
    public void testQuotationToInvoice(){
        app.goTo().quotationsMainViewPage();
        String curNum = app.quotations().getCurrNum();
        String num = "133";
        app.quotations().chooseQuotation(curNum);
        app.quotations().createInvoice();
        app.goTo().fromJSToHomePage();
    }



}
