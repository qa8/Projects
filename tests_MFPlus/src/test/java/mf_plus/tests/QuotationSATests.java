package mf_plus.tests;

import org.testng.annotations.Test;

/**
 * Created by admin on 12.02.2017.
 */
public class QuotationSATests extends TestBase {

    @Test(enabled = false)
    public void testSAQuotationCreate() {
        app.goTo().quotationsMainViewPage();
        app.quotations().newSAQuotation();
        app.booking().fillBookingForm("ES_DIV01");
        app.partyForms().fillNewClientForm(7);

    }

    @Test
    public void testSAQuotationEdit(){
        app.goTo().quotationsMainViewPage();
        app.quotations().chooseQuotation(115);
        app.booking().fillBookingForm("ES_DIV01");
//        app.partyForms().fillNewClientForm(7);

        app.partyForms().chooseClient("ES_TestClient7");
        app.partyForms().editClientDetails();

    }

}
