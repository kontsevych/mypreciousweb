import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class TestsSettings {
    protected WebDriver driver;

    @BeforeClass
    public void setUp() {
        String oS = System.getProperty("os.name").toLowerCase();
        String path = "Driver/chromedriver";

        if(oS.contains("windows 10")){
            path = "\\WebDrivers\\chromedriver.exe";
        }
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.home") + path);
        driver = new FirefoxDriver();
        System.out.println("SetUp is done");
    }

    @BeforeTest
    public void profileSetup() {
        driver.manage().window().maximize();
        System.out.println("The profile setup process is completed");
    }


    @AfterClass
    public void afterMethod() {
        driver.quit();
    }

}
