package pages;

import org.testng.Assert;
import org.testng.annotations.Test;
import testSettings.TestsSettings;


public class TestDrive extends TestsSettings {

    @Test
    public void openLoginPage() {
        Login login = new Login(driver);

        driver.get(login.getLoginPageURL());

    }

}
