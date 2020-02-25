package defaults;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.ForgotPassword;
import pages.Login;

public class DefaultTestForgotPassword extends DefaultTest {
    protected Login login;
    protected ForgotPassword forgotPassword;

    @BeforeClass
    public void setUpLogin() {
        login = new Login(driver);
        forgotPassword = new ForgotPassword(driver);

    }

    @BeforeMethod
    public void setUpForgotPasswordPage() {
        openForgotPasswordPage();
    }

    public void openForgotPasswordPage() {
        login.getButtonForgotPassword().click();
    }
}
