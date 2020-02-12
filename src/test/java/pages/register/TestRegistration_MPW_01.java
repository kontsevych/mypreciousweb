package pages.register;

import com.mypreciousweb.config.Config;
import defaults.DefaultTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestRegistration_MPW_01 extends DefaultTest {

    @Test
    public void MPW_01() {
        login.getButtonRegistration().click();
        Assert.assertEquals(driver.getCurrentUrl(), Config.registrationPageURL());
    }
}
