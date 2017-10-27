import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AllAppsPage extends BasePage {
    public AllAppsPage(WebDriver driver) {
        super(driver);
        this.pageTitle = "Tidemark - Select application";
    }

    private AllProcessesPage allProcessesPage = new AllProcessesPage(driver);

    @FindBy(css = ".loading-mask")
    WebElement loading1;
    @FindBy(css = ".mask-message")
    WebElement loading11;

    //????????????????????????????????????????????????????????????????????????
    @FindBy(xpath = "//div[@class='mask-message']")
    WebElement loadingMessage1;
    //????????????????????????????????????????????????????????????????????????

    @FindBy(css = ".x-mask-msg.x-mask-msg-default.x-layer")
    WebElement loading2;
    @FindBy(css = ".x-mask-msg.x-mask-msg-default.x-layer div")
    WebElement loading22;

    //@FindBy(css = ".x-component.tiles-container.x-fit-item.x-component-default.x-body-masked div.tile")
    //private List<WebElement> appTilesBox;

    @FindBy(css = "div.tile>div")
    private List<WebElement> appTilesBox;

    @FindBy(xpath = "//div[contains(text(), \"Loading...\")]")
    WebElement loadingMessage;

    @FindBy(xpath = "//span[contains(text(),'app3 Test GridView')]")
    WebElement app3;


    public AllProcessesPage openApp(String appName) {
        waitForListElementToBeDisplayed(appTilesBox);
        for (WebElement element : appTilesBox) {
            String tileText = element.findElement(By.cssSelector("span")).getText();
            if (tileText.equals(appName)) {
                element.click();
            }
        }
        return allProcessesPage;
    }
}
