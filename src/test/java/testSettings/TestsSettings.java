package testSettings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.Login;

public class TestsSettings {
    protected WebDriver driver;

    @BeforeClass
    public void setUp() {
        String oS = System.getProperty("os.name").toLowerCase();
        String path = "Driver/chromedriver";

        if(oS.contains("windows 10")){
            path = "\\Driver\\chromedriver.exe";
        }
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.home") + path);
        driver = new ChromeDriver();
        System.out.println("SetUp is done");
        Login login = new Login(driver);
    }

    @BeforeMethod
    public void profileSetup() {
        driver.manage().window().maximize();
        System.out.println("The profile setup process is completed");
    }

    @AfterClass
    public void afterMethod() {
        driver.quit();
    }

    public static void main(String[] args) {
        System.out.println(System.getProperty("user.home"));
    }
}
