package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SideBar extends Page {

    @FindBy(xpath = "//*[@id='accordionSidebar']/a")
    private WebElement bannerLink;

    @FindBy(xpath = "//*[@id='accordionSidebar']/li[1]/a")
    private WebElement buttonDashboard;

    @FindBy(xpath = "//*[@id='accordionSidebar']/div[1]")
    private WebElement labelMoney;

    @FindBy(xpath = "//*[@id='accordionSidebar']/li[2]/a")
    private WebElement buttonTransactions;

    @FindBy(xpath = "//*[@id='accordionSidebar']/div[2]")
    private WebElement labelSystem;

    @FindBy(xpath = "//*[@id='accordionSidebar']/li[3]/a")
    private WebElement buttonCategories;

    @FindBy(xpath = "//*[@id='accordionSidebar']/li[4]/a")
    private WebElement buttonSettingsDropdownMenu;

    @FindBy(xpath = "/html/body/div/ul/li[4]/div/div/a[1]")
    private WebElement SettingsDropdownButtonSettings;

    @FindBy(xpath = "//*[@id='accordionSidebar']/li[4]/div/div/a[2]")
    private WebElement SettingsDropdownButtonTemplates;

    @FindBy(xpath = "//*[@id='accordionSidebar']/li[4]/div/div/a[3]")
    private WebElement SettingsDropdownButtonCurrencies;

    @FindBy(id = "sidebarToggle")
    private WebElement buttonOpenHideSideBar;

    public SideBar(WebDriver driver) {
        super(driver);
    }

    public WebElement getBannerLink() {
        return bannerLink;
    }

    public WebElement getButtonDashboard() {
        return buttonDashboard;
    }

    public WebElement getLabelMoney() {
        return labelMoney;
    }

    public WebElement getButtonTransactions() {
        return buttonTransactions;
    }

    public WebElement getLabelSystem() {
        return labelSystem;
    }

    public WebElement getButtonCategories() {
        return buttonCategories;
    }

    public WebElement getButtonSettingsDropdownMenu() {
        return buttonSettingsDropdownMenu;
    }

    public WebElement getSettingsDropdownButtonSettings() {
        return SettingsDropdownButtonSettings;
    }

    public WebElement getSettingsDropdownButtonTemplates() {
        return SettingsDropdownButtonTemplates;
    }

    public WebElement getSettingsDropdownButtonCurrencies() {
        return SettingsDropdownButtonCurrencies;
    }

    public WebElement getButtonOpenHideSideBar() {
        return buttonOpenHideSideBar;
    }


}
