package tmpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

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
    public void loadPage() {
        driver.get(getPageUrl());
        Assert.assertEquals(driver.getTitle(), pageTitle);
    }
    public String getPageUrl() {
        return pageUrl;
    }
    public void setElementText(WebElement element, String text) {
        //element.clear();
        element.click();
        element.sendKeys(text);
    }

    //explicit wait
    public WebElement waitForElementToBeDisplayed(WebElement element){
        WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
        element = webDriverWait.until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public void waitForElementToDisappear(WebElement element){
        WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
        webDriverWait.until(ExpectedConditions.invisibilityOf(element));
    }

}
