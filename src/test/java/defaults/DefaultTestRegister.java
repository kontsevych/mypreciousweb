package defaults;

import com.mypreciousweb.config.Config;
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

    public void createNewUser(){
        openRegisterPage();
        register.getFieldLogin().sendKeys(Config.getUsername());
        register.getFieldPassword().sendKeys(Config.getPassword());
        register.getFieldEmail().sendKeys(Config.getEmail());
        register.getButtonRegistration().click();
    }

}
