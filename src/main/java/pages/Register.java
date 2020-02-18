package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {

    private WebDriver driver;

    @FindBy(id = "page-top")
    private WebElement labelRegistration;

    @FindBy(id = "login")
    private WebElement fieldLogin;

    @FindBy(id = "password")
    private WebElement fieldPassword;

    @FindBy(id = "password-repeat")
    private WebElement fieldCopyPassword;

    @FindBy(id = "email")
    private WebElement fieldEmail;

    @FindBy(xpath = "//*[@id='page-top']/div/div/div/div/div[2]/div/form/div[3]/div/small")
    private WebElement labelNoticeMessage;

    @FindBy(id = "first-name")
    private WebElement fieldFirstName;

    @FindBy(id = "last-name")
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
