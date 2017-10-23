package tmpages.allAppsPages.app3Pages.app3ProcessesPage.correctnessTestingPanels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import tmpages.BasePage;

/**
 * Created by nastia on 10/22/17.
 */
public class G1_NullPartialDataPanelPage extends BasePage {
    public G1_NullPartialDataPanelPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='centered-cell']/div[.='Waiting for grid details']")
    private WebElement waitingForGridDetailsMsg;
    @FindBy(xpath = "//tbody//tr[@id='prgrid-1215-0']/td[1]")
    private WebElement prd1OctoberCell;
    @FindBy(xpath = "(//*[@class='pr-grid-scroller']//tbody/tr)[1]/td")

    private WebElement prd1OctoberCellValue;

    public String getPrd1OctoberCellValue(){
        waitForElementToBeDisplayed(prd1OctoberCellValue);
        String text = prd1OctoberCellValue.getText();
        return text;
    }

}
