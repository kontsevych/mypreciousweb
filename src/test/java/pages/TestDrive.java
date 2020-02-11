package pages;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import testSettings.TestsSettings;


public class TestDrive extends TestsSettings {
Login login;

    @Test
    public void openLoginPage() {

        try {
            System.out.println(login.getButtonLogin().isDisplayed());
            Assert.assertFalse(login.getButtonLogin().isDisplayed());
        } catch (NullPointerException e) {
            System.out.println(e);
            System.out.println("test");
            Assert.assertFalse(login.getButtonLogin().isDisplayed());
        }

    }

}
