package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SideBar extends Page{

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
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebElement getBannerLink() {
        return bannerLink;
    }

    public void setBannerLink(WebElement bannerLink) {
        this.bannerLink = bannerLink;
    }

    public WebElement getButtonDashboard() {
        return buttonDashboard;
    }

    public void setButtonDashboard(WebElement buttonDashboard) {
        this.buttonDashboard = buttonDashboard;
    }

    public WebElement getLabelMoney() {
        return labelMoney;
    }

    public void setLabelMoney(WebElement labelMoney) {
        this.labelMoney = labelMoney;
    }

    public WebElement getButtonTransactions() {
        return buttonTransactions;
    }

    public void setButtonTransactions(WebElement buttonTransactions) {
        this.buttonTransactions = buttonTransactions;
    }

    public WebElement getLabelSystem() {
        return labelSystem;
    }

    public void setLabelSystem(WebElement labelSystem) {
        this.labelSystem = labelSystem;
    }

    public WebElement getButtonCategories() {
        return buttonCategories;
    }

    public void setButtonCategories(WebElement buttonCategories) {
        this.buttonCategories = buttonCategories;
    }

    public WebElement getButtonSettingsDropdownMenu() {
        return buttonSettingsDropdownMenu;
    }

    public void setButtonSettingsDropdownMenu(WebElement buttonSettingsDropdownMenu) {
        this.buttonSettingsDropdownMenu = buttonSettingsDropdownMenu;
    }

    public WebElement getSettingsDropdownButtonSettings() {
        return SettingsDropdownButtonSettings;
    }

    public void setSettingsDropdownButtonSettings(WebElement settingsDropdownButtonSettings) {
        SettingsDropdownButtonSettings = settingsDropdownButtonSettings;
    }

    public WebElement getSettingsDropdownButtonTemplates() {
        return SettingsDropdownButtonTemplates;
    }

    public void setSettingsDropdownButtonTemplates(WebElement settingsDropdownButtonTemplates) {
        SettingsDropdownButtonTemplates = settingsDropdownButtonTemplates;
    }

    public WebElement getSettingsDropdownButtonCurrencies() {
        return SettingsDropdownButtonCurrencies;
    }

    public void setSettingsDropdownButtonCurrencies(WebElement settingsDropdownButtonCurrencies) {
        SettingsDropdownButtonCurrencies = settingsDropdownButtonCurrencies;
    }

    public WebElement getButtonOpenHideSideBar() {
        return buttonOpenHideSideBar;
    }

    public void setButtonOpenHideSideBar(WebElement buttonOpenHideSideBar) {
        this.buttonOpenHideSideBar = buttonOpenHideSideBar;
    }
}
