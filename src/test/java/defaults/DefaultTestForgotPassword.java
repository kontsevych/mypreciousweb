package defaults;

import org.testng.annotations.BeforeClass;
import pages.ForgotPassword;
import pages.Login;

public class DefaultTestForgotPassword extends DefaultTest{
    protected Login login;
    protected ForgotPassword forgotPassword;

    @BeforeClass
    public void setUpLogin() {
        login = new Login(driver);
        forgotPassword = new ForgotPassword(driver);
    }

    public void openForgotPasswordPage(){
        login.getButtonForgotPassword().click();
    }
}
