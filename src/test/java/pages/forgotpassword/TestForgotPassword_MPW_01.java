package pages.forgotpassword;

import com.mypreciousweb.config.Config;
import defaults.DefaultTestForgotPassword;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestForgotPassword_MPW_01 extends DefaultTestForgotPassword {

    @Test
    public void MPW_01_Verify_UI_Elements() throws InterruptedException {
        openForgotPasswordPage();

        Assert.assertEquals(Config.getLabelForgotPasswordTop(), forgotPassword.getLabelResetYourPassword().getText());
        Assert.assertTrue(forgotPassword.getFieldEmail().isDisplayed());
        System.out.println("config " + Config.getLabelForgotPasswordFieldEmail());
        System.out.println("xpath " + forgotPassword.getFieldEmail().getText());
        Assert.assertEquals(Config.getLabelForgotPasswordFieldEmail(), forgotPassword.getFieldEmail().getText());

    }
}
