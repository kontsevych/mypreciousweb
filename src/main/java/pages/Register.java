package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {

    private WebDriver driver;
    private String registerPageURL = "https://mypreciousweb.herokuapp.com/register";

    @FindBy(xpath = "//*[@id='page-top']/div/div/div/div/div[2]/div/div[1]/h1")
    private WebElement labelRegistration;

    @FindBy(xpath = "//*[@id='login']")
    private WebElement fieldLogin;

    @FindBy(xpath = "//*[@id='password']")
    private WebElement fieldPassword;

    @FindBy(xpath = "//*[@id='password-repeat']")
    private WebElement fieldCopyPassword;

    @FindBy(xpath = "//*[@id='email']")
    private WebElement fieldEmail;

    @FindBy(xpath = "//*[@id='page-top']/div/div/div/div/div[2]/div/form/div[3]/div/small")
    private WebElement labelNoticeMessage;

    @FindBy(xpath = "//*[@id='first-name']")
    private WebElement fieldFirstName;

    @FindBy(xpath = "//*[@id='last-name']")
    private WebElement fieldLastName;

    @FindBy(xpath = "//*[@id='page-top']/div/div/div/div/div[2]/div/form/button")
    private WebElement buttonRegistration;

    @FindBy(xpath = "//*[@id='page-top']/div/div/div/div/div[2]/div/div[2]/a")
    private WebElement buttonBackToLoginPage;

    @FindBy(xpath = "//*[@id='page-top']/div/div/div/div/div[2]/div/div[2]/a")
    private WebElement imageRegisterPage;


    public Register(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public String getRegisterPageURL() {
        return registerPageURL;
    }

    public WebElement getLabelRegistration() {
        return labelRegistration;
    }

    public WebElement getFieldLogin() {
        return fieldLogin;
    }

    public WebElement getFieldPassword() {
        return fieldPassword;
    }

    public WebElement getFieldCopyPassword() {
        return fieldCopyPassword;
    }

    public WebElement getFieldEmail() {
        return fieldEmail;
    }

    public WebElement getLabelNoticeMessage() {
        return labelNoticeMessage;
    }

    public WebElement getFieldFirstName() {
        return fieldFirstName;
    }

    public WebElement getFieldLastName() {
        return fieldLastName;
    }

    public WebElement getButtonRegistration() {
        return buttonRegistration;
    }

    public WebElement getButtonBackToLoginPage() {
        return buttonBackToLoginPage;
    }

    public WebElement getImageRegisterPage() {
        return imageRegisterPage;
    }

}
