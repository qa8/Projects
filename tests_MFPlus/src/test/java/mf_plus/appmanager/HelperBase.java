package mf_plus.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * Created by admin on 27.11.2016.
 */
public class HelperBase {
    protected ApplicationManager app;
    protected WebDriver wd;


    public HelperBase(ApplicationManager app) {
        this.app=app;
        this.wd=app.getDriver();
    }

    protected void click(By locator) {
        getElement(locator).click();
    }

    protected WebElement getElement(By locator) {
        return wd.findElement(locator);
    }

    protected void type(By locator, String text) {
        WebElement e = getElement(locator);
        if (text!=null) {
            String existingText = e.getAttribute("value");
            if (!text.equals(existingText)) {
                e.click();
                e.clear();
                e.sendKeys(text);
            }
        }
    }

    protected void attach(By locator, File file) {
        if (file!=null) {
            wd.findElement(locator).sendKeys(file.getAbsolutePath());
        }
    }

    public boolean isAlertPresent() {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    protected boolean isElementPresent(By locator) {
        try {
            wd.findElement(locator);
            return true;
        } catch (NoSuchElementException ex){
            return false;
        }
    }

    protected void waitForDisappear(By locator) {
        WebDriverWait wait=new WebDriverWait(wd,10);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    protected void waitForElementClickable(By locator){
        WebDriverWait wait=new WebDriverWait(wd,10);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    protected void waitForElementVisible(By locator){
        WebDriverWait wait=new WebDriverWait(wd,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected void waitSimple(long t){
        try {
            Thread.sleep(t);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        WebDriverWait wait=new WebDriverWait(wd,t);
//        wait.withTimeout(t, TimeUnit.SECONDS);
    }

    protected void chooseElement(By locator){
        Actions builder = new Actions(wd);
        builder.moveToElement(getElement(locator)).click();
        Action mouseOverAndClick = builder.build();
        mouseOverAndClick.perform();
    }

    protected void chooseElement(WebElement element){
        Actions builder = new Actions(wd);
        builder.moveToElement(element).click();
        Action mouseOverAndClick = builder.build();
        mouseOverAndClick.perform();
    }
}
