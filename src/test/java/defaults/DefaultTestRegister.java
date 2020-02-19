package defaults;

import org.testng.annotations.BeforeClass;
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

}
