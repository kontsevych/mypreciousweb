package pages.dashboard;

import com.mypreciousweb.config.Config;
import defaults.DefaultTestDashboard;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDashboard_MPW_01 extends DefaultTestDashboard {

    @Test
    public void MPW_02_Verify_OpenDashboardPage() {

        Assert.assertEquals(driver.getCurrentUrl(), Config.getPathDomain() + Config.getPageDashboard());
        Assert.assertTrue(dashboard.getLabelDashboard().isDisplayed());

    }
}
