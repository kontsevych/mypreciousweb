package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard extends Page {

    @FindBy(id = "content")
    private WebElement LabelDashboard;


    public Dashboard(WebDriver driver) {
        super(driver);
    }
}
