
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

/**
 * Created by nastia on 10/22/17.
 */
public class BasePage {
    public String pageUrl;
    public String pageTitle;
    public WebDriver driver;
    protected WebDriverWait webDriverWait;

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        webDriverWait = new WebDriverWait(driver, 15);
    }

    @FindBy(css = ".loading-mask")
    WebElement loading1;
    @FindBy(css = ".mask-message")
    WebElement loading11;

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
    public WebElement waitForElementToBeDisplayed(WebElement element) {
        element = webDriverWait.until(ExpectedConditions.visibilityOf(element));
        return element;
    }
    public List<WebElement> waitForListElementToBeDisplayed(List<WebElement> element) {
        element = webDriverWait.until(ExpectedConditions.visibilityOfAllElements(element));
        return element;
    }

    public void waitForElementToDisappear(WebElement element) {
        webDriverWait.until(ExpectedConditions.invisibilityOf(element));
    }

    public void waitForPageToLoad(){
        webDriverWait.until(ExpectedConditions.invisibilityOf(loading11));
    }

}
