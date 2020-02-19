package defaults;

import org.testng.annotations.BeforeClass;
import pages.Dashboard;
import pages.Login;
import pages.Register;

public class DefaultTestDashboard extends DefaultTest {
    protected Register register;
    protected Login login;
    protected Dashboard dashboard;

    @BeforeClass
    public void setUpRegister() {
        login = new Login(driver);
        register = new Register(driver);
        dashboard = new Dashboard(driver);
    }
}
