package pages.login;

import com.mypreciousweb.config.Config;
import defaults.DefaultTestLogin;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Verify mandatory fields labels
 */
public class TestLogin_MPW_03 extends DefaultTestLogin {

    @Test
    public void MPW_03_Verify_Validation() {
        login.getFieldUsername().sendKeys("abc");
        login.getFieldPassword().sendKeys("123");
        login.getButtonLogin().click();

        Assert.assertEquals(Config.getAlertLoginUsernameLength(), login.getAlertInvalidUsernameLength().getText());
        Assert.assertEquals(Config.getAlertLoginPasswordLength(), login.getAlertInvalidPasswordLength().getText());

        login.getFieldUsername().sendKeys("abcd");
        login.getFieldPassword().sendKeys("123456");
        login.getButtonLogin().click();

        System.out.println("Config - " + Config.getAlertLoginWrongUsernameOrPassword());
        System.out.println("xPath - " + login.getAlertWrongLoginOrPassword().getText());

        Assert.assertEquals(Config.getAlertLoginWrongUsernameOrPassword(), login.getAlertWrongLoginOrPassword().getText());
    }
}
