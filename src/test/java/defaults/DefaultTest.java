package defaults;

import com.mypreciousweb.config.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.Login;
import pages.Register;

import java.util.concurrent.TimeUnit;

public class DefaultTest {
    protected WebDriver driver;
    protected Login login;
    protected Register register;

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
        login = new Login(driver);
        register = new Register(driver);
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
