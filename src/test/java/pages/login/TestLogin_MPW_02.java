package pages.login;

import com.mypreciousweb.config.Config;
import defaults.DefaultTestDashboard;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Verify login to the system with valid username and password
 */
public class TestLogin_MPW_02 extends DefaultTestDashboard {

    @Test
    public void MPW_02_Verify_Login()  {

        login.getFieldUsername().sendKeys(Config.getUsername());
        login.getFieldPassword().sendKeys(Config.getPassword());
        login.getButtonLogin().click();
        wait.until(ExpectedConditions.urlContains(Config.getPathDomain() + Config.getPageDashboard()));

        Assert.assertEquals(Config.getPathDomain() + Config.getPageDashboard(), driver.getCurrentUrl());
        Assert.assertTrue(dashboard.getLabelDashboard().isDisplayed());
    }
}
