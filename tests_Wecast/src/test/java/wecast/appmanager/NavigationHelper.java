package wecast.appmanager;

import org.openqa.selenium.By;


public class NavigationHelper extends HelperBase {

    public NavigationHelper(ApplicationManager app) {
        super(app);
    }

    public void homePage(){
        click(By.id("menu-item-1950"));
    }

    public void storyPage(){
        click(By.id("menu-item-1942"));
    }

    public void technologyPage(){
        click(By.id("menu-item-1951"));
    }

    public void faqsPage(){
        click(By.id("menu-item-1948"));
    }

    public void blogPage(){
        click(By.id("menu-item-2671"));
    }

    public void contactPage(){
        click(By.id("menu-item-1947"));
    }

    public void preOrderPage(){
        click(By.id("menu-item-2018"));
    }

    public void learnMore(){
        click(By.linkText("LEARN MORE"));
    }

    public void downloadApp(){
        click(By.linkText("DOWNLOAD THE APP"));
    }

    public void downloadPlugin(){

    }
}

