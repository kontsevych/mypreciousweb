package pages.register;

import com.mypreciousweb.config.Config;
import defaults.DefaultTestRegister;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestRegistration_MPW_01 extends DefaultTestRegister {

    @Test
    public void MPW_01() {
        login.getButtonRegistration().click();
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
    }
}
