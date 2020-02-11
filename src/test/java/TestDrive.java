
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Login;

public class TestDrive {
    private static ChromeDriver driver;
    public static WebDriverWait wait;
    Login login = new Login(driver);

    @BeforeClass
    public static void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 20);
        Login login = new Login(driver);

        driver.manage().window().maximize();
        driver.get(login.getLoginPageURL());
    }

    @Test
    public void openLoginPage() {


        try {
            System.out.println(login.getButtonLogin().isDisplayed());
            Assert.assertFalse(login.getButtonLogin().isDisplayed());
            //login.getButtonForgotPassword().click();
        } catch (NullPointerException e) {
            System.out.println(e);
            System.out.println("test");
            Assert.assertFalse(login.getButtonLogin().isDisplayed());
        }

    }

    @AfterClass
    public void closeBrowser() {
        driver.close();
    }
}
