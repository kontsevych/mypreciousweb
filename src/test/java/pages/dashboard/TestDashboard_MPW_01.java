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
        Assert.assertTrue(dashboard.getLabelBoard().isDisplayed());
        Assert.assertTrue(dashboard.getButtonAddTransaction().isDisplayed());
        Assert.assertTrue(dashboard.getLabelToday().isDisplayed());
        Assert.assertEquals(dashboard.getLabelBoard().getText(), Config.getLabelDashboardBoard());
        Assert.assertEquals(dashboard.getButtonAddTransaction().getText(), Config.getLabelDashboardAddTransactionButton());
        Assert.assertEquals(dashboard.getLabelToday().getAttribute("textContent"), Config.getLabelDashboardToday());
    }
}
