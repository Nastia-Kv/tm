import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AllPanelsPage extends BasePage {
    public AllPanelsPage(WebDriver driver) {
        super(driver);
    }

    private GridPage gridPage = new GridPage(driver);

    @FindBy(css = ".trigger.add")
    private WebElement addNewCycleBtn;
    @FindBy(xpath = "//*[@name='cycleName']")
    private WebElement newCycleField;
    @FindBy(xpath = "//button[.='Start']")
    private WebElement startBtn;
    @FindBy(xpath = "//div[@class='x-mask-msg']/div[.='Starting cycle']")
    private WebElement startingCycleText;
//    @FindBy(css = ".children-container:nth-of-type(3) div.tile>div")
//    private List<WebElement> panelsTileBox;

    @FindBy(xpath = "//span[.='G1_NullPartialData']/ancestor::*[@class='tile']/div")
    private WebElement g1_NullPartialDataPanel;

    public void addNewCycle(String cycleName) {
        waitForElementToBeDisplayed(addNewCycleBtn);
        addNewCycleBtn.click();
        waitForElementToBeDisplayed(newCycleField);
        setElementText(newCycleField, cycleName);
        startBtn.click();
    }

    public GridPage openPanel(){
        waitForElementToDisappear(startingCycleText);
        waitForListElementToBeDisplayed(driver.findElements(By.cssSelector(".children-container:nth-of-type(3) div.tile>div span")));
        g1_NullPartialDataPanel.click();
        return gridPage;
    }

}
