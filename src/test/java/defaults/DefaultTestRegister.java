package defaults;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.Login;
import pages.Register;

public class DefaultTestRegister extends DefaultTest {
    protected Register register;
    protected Login login;

    @BeforeClass
    public void setUpRegister() {
        login = new Login(driver);
        register = new Register(driver);
    }

    @BeforeMethod
    public void setUpRegisterPage() {
        openRegisterPage();
    }

    public void openRegisterPage() {
        login.getButtonRegistration().click();
    }

}
