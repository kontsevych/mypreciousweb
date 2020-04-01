package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard extends Page {

    @FindBy(id = "content")
    private WebElement labelDashboard;
    @FindBy(xpath = "//*[@id='content']/div/div[1]/h1")
    private WebElement labelBoard;
	@FindBy(xpath="//*[@id='content']/div/div[1]/div[1]/button")
	private WebElement buttonAddTransaction;
	@FindBy(xpath="//*[@id='content']/div/div[2]/div[1]/div/div[1]/div/div[1]")
	private WebElement labelToday;
	@FindBy(xpath="//*[@id='content']/div/div[2]/div[1]/div/div[1]/div/div[1]/span")
	private WebElement labelTodayDate;
	@FindBy(xpath="//*[@id='content']/div/div[2]/div[1]/div/div[1]/div/div[2]/i")
	private WebElement buttonToday;
	@FindBy(xpath="//*[@id='content']/div/div[2]/div[1]/div/div[2]/div/div[1]/div/div/b")
	private WebElement labelTodayMoney;
	@FindBy(xpath="//*[@id='content']/div/div[2]/div[2]/div/div[1]/div/div[1]")
	private WebElement labelWeek;
	@FindBy(xpath="//*[@id='content']/div/div[2]/div[2]/div/div[1]/div/div[1]/span")
	private WebElement labelWeekDate;
	@FindBy(xpath="//*[@id='content']/div/div[2]/div[2]/div/div[1]/div/div[2]/i")
	private WebElement buttonWeek;
	@FindBy(xpath="//*[@id='content']/div/div[2]/div[2]/div/div[2]/div/div[1]/div/div/b")
	private WebElement labelMoneyWeek;
	@FindBy(xpath="//*[@id='content']/div/div[2]/div[3]/div/div[1]/div/div[1]")
	private WebElement labelMonth;
	@FindBy(xpath="//*[@id='content']/div/div[2]/div[3]/div/div[1]/div/div[1]/span")
	private WebElement labelCurrentMonth;
	@FindBy(xpath="//*[@id='content']/div/div[2]/div[3]/div/div[1]/div/div[2]/i")
	private WebElement buttonMoth;
	@FindBy(xpath="//*[@id='content']/div/div[2]/div[3]/div/div[2]/div/div[1]/div/div/b")
	private WebElement labelMoneyMonth;
	@FindBy(xpath="//*[@id='content']/div/div[2]/div[4]/div/div[1]/div/div[1]")
	private WebElement labelYear;
	@FindBy(xpath="//*[@id='content']/div/div[2]/div[4]/div/div[1]/div/div[1]/span")
	private WebElement labelYearDate;
	@FindBy(xpath="//*[@id='content']/div/div[2]/div[4]/div/div[1]/div/div[2]/i")
	private WebElement buttonYear;
	@FindBy(xpath="//*[@id='content']/div/div[2]/div[4]/div/div[2]/div/div[1]/div/div/b")
	private WebElement labelMoneyYear;
	@FindBy(xpath="//*[@id='content-wrapper']/footer/div/div")
	private WebElement labelCopyright;

    public WebElement getLabelBoard() {
        return labelBoard;
    }

    public WebElement getButtonAddTransaction() {
        return buttonAddTransaction;
    }

    public WebElement getLabelToday() {
        return labelToday;
    }

    public WebElement getLabelTodayDate() {
        return labelTodayDate;
    }

    public WebElement getButtonToday() {
        return buttonToday;
    }

    public WebElement getLabelTodayMoney() {
        return labelTodayMoney;
    }

    public WebElement getLabelWeek() {
        return labelWeek;
    }

    public WebElement getLabelWeekDate() {
        return labelWeekDate;
    }

    public WebElement getButtonWeek() {
        return buttonWeek;
    }

    public WebElement getLabelMoneyWeek() {
        return labelMoneyWeek;
    }

    public WebElement getLabelMonth() {
        return labelMonth;
    }

    public WebElement getLabelCurrentMonth() {
        return labelCurrentMonth;
    }

    public WebElement getButtonMoth() {
        return buttonMoth;
    }

    public WebElement getLabelMoneyMonth() {
        return labelMoneyMonth;
    }

    public WebElement getLabelYear() {
        return labelYear;
    }

    public WebElement getLabelYearDate() {
        return labelYearDate;
    }

    public WebElement getButtonYear() {
        return buttonYear;
    }

    public WebElement getLabelMoneyYear() {
        return labelMoneyYear;
    }

    public WebElement getLabelCopyright() {
        return labelCopyright;
    }

    public WebElement getLabelDashboard() {
        return labelDashboard;
    }

    public Dashboard(WebDriver driver) {
        super(driver);
    }
}
