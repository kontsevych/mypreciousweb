package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SideBar {

    private WebElement driver;

	@FindBy(xpath="//*[@id='accordionSidebar']/a")
	private WebElement bannerLink;

	@FindBy(xpath="//*[@id='accordionSidebar']/li[1]/a")
	private WebElement buttonDashboard;

	@FindBy(xpath="//*[@id='accordionSidebar']/div[1]")
	private WebElement labelMoney;

	@FindBy(xpath="//*[@id='accordionSidebar']/li[2]/a")
	private WebElement webElement;




}
