package pages.register;

import com.mypreciousweb.config.Config;
import defaults.DefaultTestRegister;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Перевірка UI на сторінці реєстрації
 */
public class TestRegistration_MPW_01 extends DefaultTestRegister {

    @Test
    public void MPW_01() {

        Assert.assertEquals(driver.getCurrentUrl(), Config.registrationPageURL());
        Assert.assertTrue(register.getButtonRegistration().isDisplayed());
        Assert.assertTrue(register.getButtonBackToLoginPage().isDisplayed());
        Assert.assertTrue(register.getFieldCopyPassword().isDisplayed());
        Assert.assertTrue(register.getFieldEmail().isDisplayed());
        Assert.assertTrue(register.getFieldFirstName().isDisplayed());
        Assert.assertTrue(register.getFieldLastName().isDisplayed());
        Assert.assertTrue(register.getFieldLogin().isDisplayed());
        Assert.assertTrue(register.getFieldPassword().isDisplayed());
        Assert.assertTrue(register.getImageRegisterPage().isDisplayed());
        Assert.assertTrue(register.getLabelNoticeMessage().isDisplayed());
        Assert.assertTrue(register.getLabelRegistration().isDisplayed());

        Assert.assertEquals(register.getLabelRegistration().getText(), Config.getLabelRegister());
        Assert.assertEquals(register.getFieldLogin().getAttribute("placeholder"), Config.getLabelRegisterFieldUsername());
        Assert.assertEquals(register.getFieldPassword().getAttribute("placeholder"), Config.getLabelRegisterFieldPassword());
        Assert.assertEquals(register.getFieldCopyPassword().getAttribute("placeholder"), Config.getLabelRegisterFieldRepeatPassword());
        Assert.assertEquals(register.getFieldEmail().getAttribute("placeholder"), Config.getLabelRegisterFieldEmail());
        Assert.assertEquals(register.getLabelNoticeMessage().getText(), Config.getLabelRegisterNotificationInfo());
        Assert.assertEquals(register.getFieldFirstName().getAttribute("placeholder"), Config.getLabelRegisterFieldFirstName());
        Assert.assertEquals(register.getFieldLastName().getAttribute("placeholder"), Config.getLabelRegisterFieldLastName());
        Assert.assertEquals(register.getButtonRegistration().getText(), Config.getLabelRegisterButtonRegister());
        Assert.assertEquals(register.getButtonBackToLoginPage().getText(), Config.getLabelRegisterLoginButton());
    }
}
