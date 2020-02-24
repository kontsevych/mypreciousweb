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

        Assert.assertTrue(login.getImageLogin().isDisplayed());
        Assert.assertTrue(login.getWelcomeText().isDisplayed());
        Assert.assertTrue(login.getFieldUsername().isDisplayed());
        Assert.assertTrue(login.getFieldPassword().isDisplayed());
        Assert.assertTrue(login.getCheckBoxLabelRememberMe().isDisplayed());
        Assert.assertTrue(login.getButtonLogin().isDisplayed());
        Assert.assertTrue(login.getButtonForgotPassword().isDisplayed());
        Assert.assertTrue(login.getButtonRegistration().isDisplayed());

        Assert.assertEquals(Config.getLabelLoginTextWelcomeBack(), login.getWelcomeText().getText());
        Assert.assertEquals(Config.getLabelLoginFieldPassword(), login.getFieldPassword().getAttribute("placeholder"));
        Assert.assertEquals(Config.getLabelLoginFieldUsername(), login.getFieldUsername().getAttribute("placeholder"));
        Assert.assertEquals(Config.getLabelLoginButtonLogin(), login.getButtonLogin().getText());
        Assert.assertEquals(Config.getLabelLoginButtonForgotPassword(), login.getButtonForgotPassword().getText());
        Assert.assertEquals(Config.getLabelLoginButtonRegistration(), login.getButtonRegistration().getText());
        Assert.assertEquals(Config.getLabelLoginTextRememberMe(), login.getCheckBoxLabelRememberMe().getText());

    }

}
