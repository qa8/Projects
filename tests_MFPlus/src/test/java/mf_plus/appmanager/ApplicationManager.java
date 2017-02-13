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

    public ApplicationManager(String browser) {
        this.browser = browser;
        properties=new Properties();
    }


    public void init() throws IOException {
        String target=System.getProperty("target","local");
        properties.load(new FileReader(new File(String.format("src/test/resources/%s.properties",target))));

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
}
