package tmpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by nastia on 10/22/17.
 */
public class BasePage {
    public String pageUrl;
    public String pageTitle;
    public WebDriver driver;

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //basic methods
    public String getPageUrl() {
        return pageUrl;
    }

    public String getPageTitle() {
        return pageTitle;
    }

    public void loadPage() {
        driver.get(getPageUrl());
    }

    public void setElementText(WebElement element, String text) {
        element.click();
        element.sendKeys(text);
    }


}
