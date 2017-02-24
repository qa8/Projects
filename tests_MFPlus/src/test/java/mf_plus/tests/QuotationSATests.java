package mf_plus.tests;

import mf_plus.model.QuotationData;
import org.testng.annotations.Test;

/**
 * Created by admin on 12.02.2017.
 */
public class QuotationSATests extends TestBase {

    @Test
    public void testSAQuotationCreate() {
        QuotationData q1 = new QuotationData().withNumber("115").withBookingType("Agent").withBooker("ES_DIV01")
                .withBookerContact("ES_Polina ES_Smirnov").withAccount("").withAccountContact("").withSource("Mail")
                .withClientName("ES_TestClient7").withJobType("Export").withMode("Air AIR").withType("DTD")
                .withService("Full Origin Service");
        app.goTo().quotationsMainViewPage();
        app.quotations().newSAQuotation();
        app.booking().fillBookingForm(q1);
//        app.partyForms().fillNewClientForm(7);
        app.partyForms().chooseClient(q1.getClientName());
        app.partyForms().editClientDetails();
        app.quotations().fillSecondLine(q1);

    }

    @Test(enabled = false)
    public void testSAQuotationEdit(){
        QuotationData q1 = new QuotationData().withNumber("133").withBookingType("Agent").withBooker("ES_DIV01")
                .withBookerContact("ES_Polina ES_Smirnov").withAccount("").withAccountContact("").withSource("Mail")
                .withClientName("ES_TestClient7").withJobType("Export").withMode("Air AIR").withType("DTD")
                .withService("Full Origin Service");
        app.goTo().quotationsMainViewPage();
        app.quotations().chooseQuotation(q1.getNumber());
//        app.booking().fillBookingForm(q1);
////        app.partyForms().fillNewClientForm(7);
//
//        app.partyForms().chooseClient(q1.getClientName());
//        app.partyForms().editClientDetails();
        app.quotations().fillSecondLine(q1);

    }

}
