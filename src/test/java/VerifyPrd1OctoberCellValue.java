import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import tmpages.AllAppsPage;
import tmpages.SignInPage;
import tmpages.allAppsPages.app3Pages.app3ProcessesPage.App3ProcessesPage;
import tmpages.allAppsPages.app3Pages.app3ProcessesPage.correctnessTestingPanels.AllPanelsCorrectnessTestingPage;
import tmpages.allAppsPages.app3Pages.app3ProcessesPage.correctnessTestingPanels.G1_NullPartialDataPanelPage;

/**
 * Created by nastia on 10/22/17.
 */
public class VerifyPrd1OctoberCellValue extends BaseTest {
    private SignInPage signInPage;
    private AllAppsPage allAppsPage;
    private App3ProcessesPage app3ProcessesPage;
    private AllPanelsCorrectnessTestingPage allPanelsCorrectnessTestingPage;
    private G1_NullPartialDataPanelPage g1_nullPartialDataPanelPage;

    @BeforeClass(alwaysRun = true)
    public void generalSetup() {
        signInPage = new SignInPage(driver);
        allAppsPage = new AllAppsPage(driver);
        app3ProcessesPage = new App3ProcessesPage(driver);
        allPanelsCorrectnessTestingPage = new AllPanelsCorrectnessTestingPage(driver);
        g1_nullPartialDataPanelPage = new G1_NullPartialDataPanelPage(driver);
    }

    @Test
    public void cellValueValidation() throws InterruptedException {
        signInPage.loadPage();
        signInPage.signInSuccessfully("tidemark.automation+reference.admin@gmail.com", "Password1" );
        allAppsPage.clickApp3();
        app3ProcessesPage.clickCorrectnessTestingProcess();
        allPanelsCorrectnessTestingPage.addNewCycle("Test cycle name");
        allPanelsCorrectnessTestingPage.clickG1_NullPartialDataPanel();
        String cellValue = g1_nullPartialDataPanelPage.getPrd1OctoberCellValue();
        Assert.assertEquals(cellValue, "$70.2");
        System.out.println(cellValue);
    }
}
