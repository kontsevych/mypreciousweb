package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard {

    public WebDriver driver;
    public String dashboardPageURL = "/dashboard";

	@FindBy(xpath="//*[@id='content']/div/div[1]/h1")
	private WebElement LabelDashboard;




}
