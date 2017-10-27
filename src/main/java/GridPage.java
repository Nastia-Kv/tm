import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GridPage extends BasePage {
    public GridPage(WebDriver driver) {
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
