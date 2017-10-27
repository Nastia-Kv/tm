import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AllProcessesPage extends BasePage {
    public AllProcessesPage(WebDriver driver) {
        super(driver);
    }

    private AllPanelsPage allPanelsPage = new AllPanelsPage(driver);

    @FindBy(xpath = "//div[contains(text(), 'Loading...')]")
    private WebElement loadingIcon;
    @FindBy(css = ".children-container:nth-of-type(2) div.tile>div")
    private List<WebElement> processesTileBox;
    @FindBy(xpath = "//span[.='Correctness Testing']/ancestor::div[@class='tile']/div")
    private WebElement correctnessTestingProcess;
    @FindBy(xpath = "//*[@class='name-container pr-overflowing-text']//span[.='Correctness Testing']")
    private WebElement correctnessTesting;

    public AllPanelsPage openProcess(String processName) {
        waitForListElementToBeDisplayed(processesTileBox);
        for (WebElement element : processesTileBox) {
            String tileText = element.findElement(By.cssSelector("span")).getText();
            if (tileText.equals(processName)) {
                element.click();
            }
        }
        return allPanelsPage;
    }


}
