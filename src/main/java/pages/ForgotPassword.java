package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassword {

    private WebDriver driver;
    private String forgotPasswordPageURL = "https://mypreciousweb.herokuapp.com/forgot-password";

    @FindBy(xpath = "//*[@id='page-top']/div/div/div/div/div/div/div[2]/div/div[1]/h1")
    private WebElement labelResetYourPassword;

    @FindBy(xpath = "//*[@id='email']")
    private WebElement fieldEmail;

    @FindBy(xpath = "//*[@id='page-top']/div/div/div/div/div/div/div[2]/div/form/button")
    private WebElement buttonResetYourPassword;

    @FindBy(xpath = "//*[@id='page-top']/div/div/div/div/div/div/div[2]/div/div[3]/a")
    private WebElement buttonLogin;

    public ForgotPassword(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public String getForgotPasswordPageURL() {
        return forgotPasswordPageURL;
    }

    public WebElement getLabelResetYourPassword() {
        return labelResetYourPassword;
    }

    public WebElement getFieldEmail() {
        return fieldEmail;
    }

    public WebElement getButtonResetYourPassword() {
        return buttonResetYourPassword;
    }

    public WebElement getButtonLogin() {
        return buttonLogin;
    }
}
