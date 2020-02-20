package pages.login;

import com.mypreciousweb.config.Config;
import defaults.DefaultTestLogin;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Verify mandatory fields
 * Verify fields validation
 */
public class TestLogin_MPW_03 extends DefaultTestLogin {

    @Test
    public void MPW_03_Verify_Validation() {
        login.getFieldUsername().sendKeys("tes");
        login.getFieldPassword().sendKeys("123");
        login.getButtonLogin().click();

        System.out.println("Get Config: " + Config.getAlertLoginUsernameLength());
        System.out.println("Get text: " + login.getAlertInvalidUsernameLength().getText());

        Assert.assertEquals(Config.getAlertLoginUsernameLength(), login.getAlertInvalidUsernameLength().toString());
    }
}
