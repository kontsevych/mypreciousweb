package pages.forgotpassword;

import com.mypreciousweb.config.Config;
import defaults.DefaultTestForgotPassword;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Перевірити наявність UI елементів на сторінці
 */

public class TestForgotPassword_MPW_01 extends DefaultTestForgotPassword {

    @Test
    public void MPW_01_Verify_UI_Elements() throws InterruptedException {

        Assert.assertTrue(forgotPassword.getLabelResetYourPassword().isDisplayed());
        Assert.assertTrue(forgotPassword.getFieldEmail().isDisplayed());
        Assert.assertTrue(forgotPassword.getButtonResetYourPassword().isDisplayed());

        Assert.assertEquals(forgotPassword.getLabelResetYourPassword().getText(), Config.getLabelForgotPasswordTop());
        Assert.assertEquals(forgotPassword.getFieldEmail().getAttribute("placeholder"), Config.getLabelForgotPasswordFieldEmail());
        Assert.assertEquals(forgotPassword.getButtonResetYourPassword().getText(), Config.getLabelForgotPasswordButtonResetPassword());

    }
}
