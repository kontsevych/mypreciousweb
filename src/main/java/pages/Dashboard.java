package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard extends Page {

    @FindBy(id = "content")
    private WebElement labelDashboard;

    public WebElement getLabelDashboard() {
        return labelDashboard;
    }

    public Dashboard(WebDriver driver) {
        super(driver);
    }
}
