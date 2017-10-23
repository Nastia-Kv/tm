package tmpages.allAppsPages.app3Pages.app3ProcessesPage.correctnessTestingPanels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import tmpages.BasePage;

/**
 * Created by nastia on 10/22/17.
 */
public class AllPanelsCorrectnessTestingPage extends BasePage{
    public AllPanelsCorrectnessTestingPage(WebDriver driver) {
        super(driver);
    }

    G1_NullPartialDataPanelPage g1_NullPartialDataPanelPage;
    @FindBy(css = ".trigger.add")
    private WebElement addNewCycleBtn;
    @FindBy(xpath = "//*[@name='cycleName']")
    private WebElement newCycleField;
    @FindBy(xpath = "//button[.='Start']")
    private WebElement startBtn;
    @FindBy(xpath = "//div[@class='x-mask-msg']/div[.='Starting cycle']")
    private WebElement startingCycleText;
    @FindBy(xpath = "//span[.='G1_NullPartialData']/ancestor::*[@class='tile']/div")
    private WebElement g1_NullPartialDataPanel;

    public void addNewCycle(String cycleName){
        waitForElementToBeDisplayed(addNewCycleBtn);
        addNewCycleBtn.click();
        waitForElementToBeDisplayed(newCycleField);
        setElementText(newCycleField, cycleName );
        startBtn.click();
    }
    public G1_NullPartialDataPanelPage clickG1_NullPartialDataPanel(){
        waitForElementToBeDisplayed(g1_NullPartialDataPanel);
        g1_NullPartialDataPanel.click();
        return g1_NullPartialDataPanelPage;
    }
}
