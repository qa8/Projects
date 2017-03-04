package mf_plus.appmanager;

import org.openqa.selenium.By;

/**
 * Created by admin on 27.11.2016.
 */
public class NavigationHelper extends HelperBase {

    public NavigationHelper(ApplicationManager app) {
        super(app);
    }

    public void quotationsMainViewPage(){
        waitForDisappear(By.id("page-preloader"));
        click(By.linkText("Quotations"));
    }

    public void surveysMainViewPage(){
        waitForDisappear(By.id("page-preloader"));
        click(By.linkText("Surveys"));
    }

    public void dailyAgendaMainViewPage(){
        waitForDisappear(By.id("page-preloader"));
        click(By.linkText("Daily Agenda"));
    }
    public void tasksMainViewPage(){
        waitForDisappear(By.id("page-preloader"));
        click(By.linkText("Tasks"));
    }

    public void jobsMainViewPage(){
        waitForDisappear(By.id("page-preloader"));
        click(By.linkText("Jobs"));
    }

    public void shipmentsMainViewPage(){
        waitForDisappear(By.id("page-preloader"));
        click(By.linkText("Shipments"));
    }

    public void operationsMainViewPage(){
        waitForDisappear(By.id("page-preloader"));
        click(By.linkText("Operations"));
    }

    public void warehouseMainViewPage(){
        waitForDisappear(By.id("page-preloader"));
        click(By.linkText("Warehouse"));
    }

    public void crmMainViewPage(){
        waitForDisappear(By.id("page-preloader"));
        click(By.linkText("CRM"));
    }

    public void financialsMainViewPage(){
        waitForDisappear(By.id("page-preloader"));
        click(By.linkText("Financials"));
    }

    public void managementMainViewPage(){
        waitForDisappear(By.id("page-preloader"));
        click(By.linkText("Management"));
    }

    public void jobSummaryClientViewPage(){
        waitForDisappear(By.id("page-preloader"));
        click(By.linkText(""));
    }


    public void fromQuotToHomePage() {
        waitForDisappear(By.id("page-preloader"));
        waitSimple(500);
        click(By.xpath("//div[2]/div/div[1]/div/div/div/a"));
        waitForDisappear(By.id("page-preloader"));
        waitSimple(1000);
    }

    public void fromJSToHomePage() {
        waitForDisappear(By.id("page-preloader"));
        click(By.xpath("//div[2]/div/div[1]/div/div/a"));
        waitForDisappear(By.id("page-preloader"));
        waitSimple(1000);
    }
}

