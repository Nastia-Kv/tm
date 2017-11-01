
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by nastia on 10/22/17.
 */
public class SignInPage extends BasePage {
    public SignInPage(WebDriver driver) {
        super(driver);
        //this.pageUrl = "host";
        this.pageUrl = "https://qe3b.usw1.aws.tidemark.net/reference/login";
        this.pageTitle = "Sign In";
    }

    AllAppsPage allAppsPage1 = new AllAppsPage(driver);
    @FindBy(name = "userName") WebElement userNameFld;
    @FindBy(name = "password") WebElement passwordFld;
    @FindBy(css = "span.normal") WebElement signInBtn;
    //tidemark.automation+reference.admin@gmail.com

    public AllAppsPage signInSuccessfully(String username, String password){
        waitForElementToBeDisplayed(userNameFld);
        setElementText(userNameFld, username);
        waitForElementToBeDisplayed(passwordFld);
        setElementText(passwordFld, password);
        signInBtn.click();

        return allAppsPage1;

    }


}
