package defaults;

import com.mypreciousweb.config.Config;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
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

    @BeforeMethod
    public void openDashboardPage(){
        openDashboardPages();
    }

    public void openDashboardPages(){
        login.getFieldUsername().sendKeys(Config.getUsername());
        login.getFieldPassword().sendKeys(Config.getPassword());
        login.getButtonLogin().click();
        wait.until(ExpectedConditions.urlContains(Config.getPathDomain() + Config.getPageDashboard()));
    }

}
