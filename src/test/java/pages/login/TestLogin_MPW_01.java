package pages.login;

import com.mypreciousweb.config.Config;
import defaults.DefaultTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogin_MPW_01 extends DefaultTest {

    @Test
    public void MPW_01() {
        Assert.assertEquals(Config.loginPageURL(), driver.getCurrentUrl());
    }
}
