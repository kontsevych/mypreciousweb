package pages.login;

import com.mypreciousweb.config.Config;
import defaults.DefaultTestSetting;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogin_MPW_01 extends DefaultTestSetting {

    @Test
    public void MPW_01() {
        Assert.assertEquals(Config.loginPageURL(), driver.getCurrentUrl());
    }
}
