import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class test extends BaseTest {
    private SignInPage signInPage;
    private AllAppsPage allAppsPage;
    private AllProcessesPage allProcessesPage;
    private AllPanelsPage allPanelsPage;
    private GridPage gridPage;

    @BeforeClass(alwaysRun = true)
    public void generalSetup() {
        signInPage = new SignInPage(driver);
        allAppsPage = new AllAppsPage(driver);
        allProcessesPage = new AllProcessesPage(driver);
        allPanelsPage = new AllPanelsPage(driver);
        gridPage = new GridPage(driver);
    }

    @Test
    public void cellValueValidation() throws InterruptedException {
        System.out.println(11);
        signInPage.loadPage();
        System.out.println(22);
        signInPage.signInSuccessfully("tidemark.automation+reference.admin@gmail.com", "Password1");
        System.out.println(33);

        allAppsPage.openApp("app3 Test GridView");

        System.out.println(44);
        allProcessesPage.openProcess("Correctness Testing");
        System.out.println(55);
        allPanelsPage.addNewCycle("2");
        System.out.println(66);
        Thread.sleep(10000);
        allPanelsPage.openPanel("G1_NullPartialData");
        Thread.sleep(10000);
        System.out.println(77);
        gridPage.getPrd1OctoberCellValue();
        System.out.println(88);
    }


}
