package defaults;

import com.mypreciousweb.config.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.Login;

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
        System.out.println("SetUp is done");
    }

    @BeforeMethod
    public void profileSetup() {
        driver.manage().window().maximize();
        System.out.println("The profile setup process is completed");
        driver.get(Config.loginPageURL());
    }

    @AfterClass
    public void afterMethod() {
        driver.quit();
    }

    public static void main(String[] args) {
        System.out.println(System.getProperty("user.home"));
    }
}
