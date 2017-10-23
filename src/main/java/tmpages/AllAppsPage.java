package tmpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import tmpages.allAppsPages.app3Pages.app3ProcessesPage.App3ProcessesPage;
import tmpages.allAppsPages.app3Pages.app3ProcessesPage.correctnessTestingPanels.AllPanelsCorrectnessTestingPage;

/**
 * Created by nastia on 10/22/17.
 */
public class AllAppsPage extends BasePage {
    public AllAppsPage(WebDriver driver) {
        super(driver);
        this.pageTitle = "Tidemark - Select application";
    }

    App3ProcessesPage app3ProcessesPage;
    @FindBy(css = ".x-mask-msg.viewport-mask.x-mask-msg-default.x-layer.loading-mask") WebElement loading1;
    @FindBy(xpath = "//div[contains(text(), \"Loading...\")]") WebElement loadingMessage;
    @FindBy(xpath = "//div[@class=\"mask-message\"]") WebElement loadingMessage1;
    @FindBy(css = ".x-mask-msg.x-mask-msg-default.x-layer") WebElement loading2;
    @FindBy(xpath = "//span[contains(text(),'app3 Test GridView')]") WebElement app3;

    public App3ProcessesPage clickApp3(){
        waitForElementToDisappear(loading2);
        waitForElementToBeDisplayed(app3);
        app3.click();
        return app3ProcessesPage;
    }

}
