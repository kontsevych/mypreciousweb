package pages.login;

import com.mypreciousweb.config.Config;
import defaults.DefaultTest;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Перевіряємо всі елементи на сторінці логіну
 */
public class TestLogin_MPW_01 extends DefaultTest {

    @Test
    public void MPW_01() {
        Assert.assertEquals(Config.loginPageURL(), driver.getCurrentUrl());
        Assert.assertTrue(login.getWelcomeText().isDisplayed());
        Assert.assertTrue(login.getImageLogin().isDisplayed());
        Assert.assertTrue(login.getFieldPassword().isDisplayed());
        Assert.assertTrue(login.getFieldUsername().isDisplayed());
        Assert.assertTrue(login.getButtonRegistration().isDisplayed());
        Assert.assertTrue(login.getButtonForgotPassword().isDisplayed());
        Assert.assertTrue(login.getButtonLogin().isDisplayed());
    }
}
