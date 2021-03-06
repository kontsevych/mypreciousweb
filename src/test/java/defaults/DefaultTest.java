package defaults;

import com.mypreciousweb.config.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class DefaultTest {
    protected WebDriver driver;
    protected WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        Config.configSetup();
        String oS = System.getProperty("os.name").toLowerCase();
        String path = Config.pathDriverChrome();

        if (oS.contains("windows 10")) {
            path = Config.pathDriverChromeWindows();
        }
        System.setProperty(Config.setNameWebdriverChromeDriver(), System.getProperty("user.home") + path);

        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 40);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @BeforeMethod
    public void profileSetup() {
        driver.manage().window().maximize();
        driver.get(Config.loginPageURL());
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }


}
