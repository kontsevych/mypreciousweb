package pages.login;

import com.mypreciousweb.config.Config;
import defaults.DefaultTestLogin;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Перевіряємо всі елементи на сторінці логіну
 */
public class TestLogin_MPW_01 extends DefaultTestLogin {

    @Test
    public void MPW_01_Verify_UI_Elements() {
        Assert.assertEquals(Config.loginPageURL(), driver.getCurrentUrl());
        Assert.assertTrue(login.getWelcomeText().isDisplayed());
        Assert.assertTrue(login.getImageLogin().isDisplayed());
        Assert.assertTrue(login.getFieldPassword().isDisplayed());
        Assert.assertTrue(login.getFieldUsername().isDisplayed());
        Assert.assertTrue(login.getButtonRegistration().isDisplayed());
        Assert.assertTrue(login.getButtonForgotPassword().isDisplayed());
        Assert.assertTrue(login.getButtonLogin().isDisplayed());

        Assert.assertEquals(Config.getLabelLoginTextWelcomeBack(), login.getWelcomeText().getText());
        System.out.println(login.getFieldPassword().getText());
        Assert.assertEquals(Config.getLabelLoginFieldPassword(), login.getFieldPassword().getCssValue("placeholder"));
    }
}
