package defaults;

import org.testng.annotations.BeforeClass;
import pages.Login;

public class DefaultTestLogin extends DefaultTest{
    protected Login login;

    @BeforeClass
    public void setUpLogin(){
        login = new Login(driver);
    }
}
