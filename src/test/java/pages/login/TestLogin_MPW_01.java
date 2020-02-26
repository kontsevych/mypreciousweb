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
        Assert.assertEquals(driver.getCurrentUrl(), Config.loginPageURL());

        Assert.assertTrue(login.getImageLogin().isDisplayed());
        Assert.assertTrue(login.getWelcomeText().isDisplayed());
        Assert.assertTrue(login.getFieldUsername().isDisplayed());
        Assert.assertTrue(login.getFieldPassword().isDisplayed());
        Assert.assertTrue(login.getCheckBoxLabelRememberMe().isDisplayed());
        Assert.assertTrue(login.getButtonLogin().isDisplayed());
        Assert.assertTrue(login.getButtonForgotPassword().isDisplayed());
        Assert.assertTrue(login.getButtonRegistration().isDisplayed());

        Assert.assertEquals(login.getWelcomeText().getText(), Config.getLabelLoginTextWelcomeBack() );
        Assert.assertEquals(login.getFieldPassword().getAttribute("placeholder"), Config.getLabelLoginFieldPassword());
        Assert.assertEquals(login.getFieldUsername().getAttribute("placeholder"), Config.getLabelLoginFieldUsername());
        Assert.assertEquals(login.getButtonLogin().getText(), Config.getLabelLoginButtonLogin());
        Assert.assertEquals(login.getButtonForgotPassword().getText(), Config.getLabelLoginButtonForgotPassword());
        Assert.assertEquals(login.getButtonRegistration().getText(), Config.getLabelLoginButtonRegistration());
        Assert.assertEquals(login.getCheckBoxLabelRememberMe().getText(), Config.getLabelLoginTextRememberMe());
    }

}
