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

    @FindBy(css = ".trigger.add") WebElement addNewCycle;
    @FindBy(xpath = "//*[@name='cycleName']") WebElement newCycleField;
    @FindBy(xpath = "//button[.='Start']") WebElement startBtn;
    @FindBy(xpath = "//div[@class='x-mask-msg']/div[.='Starting cycle']") WebElement startingCycleText;
    @FindBy(xpath = "//span[.='G1_NullPartialData']/ancestor::*[@class='tile']/div") WebElement G1_NullPartialDataPanel;

    public void addNewCycle(String cycleName){
        addNewCycle.click();
        setElementText(newCycleField, cycleName );
        startBtn.click();
    }
}
