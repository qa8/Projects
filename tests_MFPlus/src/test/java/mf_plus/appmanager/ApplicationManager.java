package mf_plus.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Created by admin on 26.11.2016.
 */
public class ApplicationManager {

    private final Properties properties;
    WebDriver wd;

    private String browser;
    private SessionHelper sessionHelper;
    private NavigationHelper navigationHelper;
    private QuotationsHelper quotationsHelper;
    private PartyFormsHelper partyFormsHelper;
    private CostsHelper costsHelper;
    private TimeSheetsHelper timeSheetsHelper;
    private BookingSectionHelper bookingSectionHelper;
    private SurveysHelper surveysHelper;

    public ApplicationManager(String browser) {
        this.browser = browser;
        properties=new Properties();
    }


    public void init() throws IOException {
        String target=System.getProperty("target","local");
        properties.load(new FileReader(new File(String.format("src/test/resources/%s.properties",target))));
        session();
    }

    public void stop() {
        wd.quit();
    }

    public WebDriver getDriver() {
        if (wd==null){
            if (browser.equals(BrowserType.FIREFOX)){
                wd = new FirefoxDriver();
            }else if(browser.equals(BrowserType.CHROME)){
                wd = new ChromeDriver();
            }else if(browser.equals(BrowserType.IE)){
                wd = new InternetExplorerDriver();

            }

            wd.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
//            wd.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
//            wd.manage().timeouts().setScriptTimeout(0, TimeUnit.SECONDS);
            wd.get(properties.getProperty("web.baseUrl"));

        }
        return wd;
    }

    public SessionHelper session() {
        if (sessionHelper==null){
            sessionHelper=new SessionHelper(this);
            sessionHelper.login(properties.getProperty("web.adminLogin"), properties.getProperty("web.adminPassword"));
        }
        return sessionHelper;
    }

    public NavigationHelper goTo() {
        if (navigationHelper==null){
            navigationHelper = new NavigationHelper(this);
        }
        return navigationHelper;
    }

    public QuotationsHelper quotations() {
        if (quotationsHelper==null){
            quotationsHelper = new QuotationsHelper(this);
        }
        return quotationsHelper;
    }

    public SurveysHelper surveys() {
        if (surveysHelper==null){
            surveysHelper = new SurveysHelper(this);
        }
        return surveysHelper;
    }

    public PartyFormsHelper partyForms() {
        if (partyFormsHelper==null){
            partyFormsHelper = new PartyFormsHelper(this);
        }
        return partyFormsHelper;
    }

    public CostsHelper costs() {
        if (costsHelper==null){
            costsHelper = new CostsHelper(this);
        }
        return costsHelper;
    }

    public TimeSheetsHelper timeSheets() {
        if (timeSheetsHelper ==null){
            timeSheetsHelper = new TimeSheetsHelper(this);
        }
        return timeSheetsHelper;
    }

    public BookingSectionHelper booking() {
        if (bookingSectionHelper ==null){
            bookingSectionHelper = new BookingSectionHelper(this);
        }
        return bookingSectionHelper;
    }
}
