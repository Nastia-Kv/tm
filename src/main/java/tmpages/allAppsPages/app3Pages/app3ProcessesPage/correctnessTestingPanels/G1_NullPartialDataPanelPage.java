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

    @FindBy(xpath = "//div[@class='centered-cell']/div[.='Waiting for grid details']") WebElement waitingForGridDetailsMsg;
    @FindBy(xpath = "//tbody//tr[@id='prgrid-1215-0']/td[1]") WebElement prd1OctoberCell;
    @FindBy(xpath = "//tbody//tr[@id='prgrid-1215-0']/td[1]//span[.='$70.2']") WebElement prd1OctoberCellValue;


}
