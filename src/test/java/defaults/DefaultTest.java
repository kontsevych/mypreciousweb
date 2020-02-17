package defaults;

import com.mypreciousweb.config.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import pages.Login;

import java.util.concurrent.TimeUnit;

public class DefaultTest {
    protected WebDriver driver;
    protected Login login;

    @BeforeSuite
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

    @BeforeTest
    public void profileSetup() {
        driver.manage().window().maximize();
        System.out.println("The profile setup process is completed");
    }

    @BeforeClass
    public void appSetUp(){
        driver.get(Config.loginPageURL());
        System.out.println("The app setup process is completed");
    }

    @AfterClass
    public void afterMethod() {
        driver.quit();
        System.out.println("The close_up process is completed");
    }

    public static void main(String[] args) {
        System.out.println(System.getProperty("user.home"));
    }
}
