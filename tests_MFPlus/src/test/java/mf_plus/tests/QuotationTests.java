package mf_plus.tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

/**
 * Created by admin on 12.02.2017.
 */
public class QuotationTests extends TestBase {

    @Test(priority = 5)
    public void testQuotationToInvoice(){
        app.goTo().quotationsMainViewPage();
        String curNum = app.quotations().getCurrNum();
        String num = "157";
        app.quotations().chooseQuotation(curNum);
        app.quotations().createInvoice();
        String invNum = app.quotations().getInvoiceNum();
        app.goTo().fromJSToHomePage();
        assertNotEquals(invNum,"");
    }



}
