package tmpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by nastia on 10/22/17.
 */
public class AllAppsPage extends BasePage {
    public AllAppsPage(WebDriver driver) {
        super(driver);
        this.pageTitle = "Tidemark - Select application";
    }

    @FindBy(css = ".x-mask-msg.viewport-mask.x-mask-msg-default.x-layer.loading-mask") WebElement loading1;
    @FindBy(xpath = "//div[contains(text(), \"Loading...\")]") WebElement loadingMessage;
    @FindBy(xpath = "//div[@class=\"mask-message\"]") WebElement loadingMessage1;
    @FindBy(css = ".x-mask-msg.x-mask-msg-default.x-layer") WebElement loading2;
    @FindBy(xpath = "//span[contains(text(),'app3 Test GridView')]") WebElement app3;

}
