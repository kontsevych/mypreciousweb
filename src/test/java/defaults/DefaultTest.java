package defaults;

import com.mypreciousweb.config.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.Login;

import java.util.concurrent.TimeUnit;

public class DefaultTest {
    protected WebDriver driver;
    protected Login login;

    @BeforeClass
    public void setUp() {
        Config.configSetup();
        String oS = System.getProperty("os.name").toLowerCase();
        String path = Config.driverChrome();

        if (oS.contains("windows 10")) {
            path = "\\Driver\\chromedriver.exe";
        }
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.home") + path);
        driver = new ChromeDriver();
        login = new Login(driver);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("The setup process is completed");
    }

    @BeforeMethod
    public void profileSetup() {
        driver.manage().window().maximize();
        driver.get(Config.loginPageURL());
        System.out.println("The profile setup process is completed - @BeforeTest");
    }


    @AfterClass
    public void afterClass() {
       driver.quit();
        System.out.println("The close_up process is completed");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After suite");
    }

}
