package tmpages.allAppsPages.app3Pages.app3ProcessesPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import tmpages.BasePage;
import tmpages.allAppsPages.app3Pages.app3ProcessesPage.correctnessTestingPanels.AllPanelsCorrectnessTestingPage;

/**
 * Created by nastia on 10/22/17.
 */
public class App3ProcessesPage extends BasePage {
    public App3ProcessesPage(WebDriver driver) {
        super(driver);
    }

    AllPanelsCorrectnessTestingPage allPanelsCorrectnessTestingPage;

    @FindBy(xpath = "//div[contains(text(), 'Loading...')]") WebElement loadingIcon;
    @FindBy(xpath = "//span[.='Correctness Testing']/ancestor::div[@class='tile']/div") WebElement correctnessTestingProcess;

    public AllPanelsCorrectnessTestingPage clickCorrectnessTestingProcess(){
        waitForElementToBeDisplayed(correctnessTestingProcess);
        correctnessTestingProcess.click();
        return allPanelsCorrectnessTestingPage;
    }

}
