import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * Created by nastia on 10/22/17.
 */
public class BaseTest {
    WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void baseSetup() {
        //System.setProperty("webdriver.chrome.driver", "/Users/nastia/IdeaProjects/tm/src/main/resources/chromedriver");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\akvas\\IdeaProjects\\tm\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass(alwaysRun = true)
    public void teardown() {
        driver.quit();
    }
}
