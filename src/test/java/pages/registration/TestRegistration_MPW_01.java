package pages.registration;

import com.mypreciousweb.config.Config;
import defaults.DefaultTestSetting;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestRegistration_MPW_01 extends DefaultTestSetting {

    @Test
    public void MPW_01() {
        login.getButtonRegistration().click();
        Assert.assertEquals(driver.getCurrentUrl(), Config.registrationPageURL());
    }
}
